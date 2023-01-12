package typings.twineSugarcube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfAssignmentError extends StObject {
  
  /**
    * Determines whether the `<<if>>` macro returns an error when the = assignment operator is used within its conditional —
    * e.g., `<<if $suspect = "Bob">>`. Does not flag other assignment operators.
    *
    * NOTE: This setting exists because it's unlikely that you'll ever want to actually perform an assignment within a
    * conditional expression and typing = when you meant === (or ==) is a fairly easy to mistake make—either from a finger
    * slip or because you just don't know the difference between the operators.
    *
    * @default true
    * @since 2.0.0
    * @example
    * // No error is returned when = is used within an <<if>> or <<elseif>> conditional
    * Config.macros.ifAssignmentError = false;
    */
  var ifAssignmentError: Boolean
  
  /**
    * Sets the maximum number of iterations allowed before the `<<for>>` macro conditional forms are terminated with an error.
    *
    * NOTE: This setting exists to prevent a misconfigured loop from making the browser unresponsive.
    *
    * @default 1000
    * @since 2.0.0
    * @example
    * // Allow only 5000 iterations
    * Config.macros.maxLoopIterations = 5000;
    */
  var maxLoopIterations: Double
  
  /**
    * Sets the default KeyboardEvent.key value that causes the currently running <<type>> macro instance to finish
    * typing its content immediately.
    * @default " " (space)
    * @since 2.33.1
    * @example
    * // Change the default skip key to Control (CTRL)
    * Config.macros.typeSkipKey = "Control";
    */
  var typeSkipKey: String
  
  /**
    * Determines whether the <<type>> macro types out content on previously visited passages or simply outputs it
    * immediately.
    * @default true
    * @since 2.32.0
    * @example
    * // Do not type on previously visited passages
    * Config.macros.typeVisitedPassages = false;
    */
  var typeVisitedPassages: Boolean
}
object IfAssignmentError {
  
  inline def apply(
    ifAssignmentError: Boolean,
    maxLoopIterations: Double,
    typeSkipKey: String,
    typeVisitedPassages: Boolean
  ): IfAssignmentError = {
    val __obj = js.Dynamic.literal(ifAssignmentError = ifAssignmentError.asInstanceOf[js.Any], maxLoopIterations = maxLoopIterations.asInstanceOf[js.Any], typeSkipKey = typeSkipKey.asInstanceOf[js.Any], typeVisitedPassages = typeVisitedPassages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfAssignmentError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IfAssignmentError] (val x: Self) extends AnyVal {
    
    inline def setIfAssignmentError(value: Boolean): Self = StObject.set(x, "ifAssignmentError", value.asInstanceOf[js.Any])
    
    inline def setMaxLoopIterations(value: Double): Self = StObject.set(x, "maxLoopIterations", value.asInstanceOf[js.Any])
    
    inline def setTypeSkipKey(value: String): Self = StObject.set(x, "typeSkipKey", value.asInstanceOf[js.Any])
    
    inline def setTypeVisitedPassages(value: Boolean): Self = StObject.set(x, "typeVisitedPassages", value.asInstanceOf[js.Any])
  }
}
