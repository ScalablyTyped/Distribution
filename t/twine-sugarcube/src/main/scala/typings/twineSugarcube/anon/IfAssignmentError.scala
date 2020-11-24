package typings.twineSugarcube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfAssignmentError extends js.Object {
  
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
  var ifAssignmentError: Boolean = js.native
  
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
  var maxLoopIterations: Double = js.native
  
  /**
    * Sets the default KeyboardEvent.key value that causes the currently running <<type>> macro instance to finish
    * typing its content immediately.
    * @default " " (space)
    * @since 2.33.1
    * @example
    * // Change the default skip key to Control (CTRL)
    * Config.macros.typeSkipKey = "Control";
    */
  var typeSkipKey: String = js.native
  
  /**
    * Determines whether the <<type>> macro types out content on previously visited passages or simply outputs it
    * immediately.
    * @default true
    * @since 2.32.0
    * @example
    * // Do not type on previously visited passages
    * Config.macros.typeVisitedPassages = false;
    */
  var typeVisitedPassages: Boolean = js.native
}
object IfAssignmentError {
  
  @scala.inline
  def apply(
    ifAssignmentError: Boolean,
    maxLoopIterations: Double,
    typeSkipKey: String,
    typeVisitedPassages: Boolean
  ): IfAssignmentError = {
    val __obj = js.Dynamic.literal(ifAssignmentError = ifAssignmentError.asInstanceOf[js.Any], maxLoopIterations = maxLoopIterations.asInstanceOf[js.Any], typeSkipKey = typeSkipKey.asInstanceOf[js.Any], typeVisitedPassages = typeVisitedPassages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfAssignmentError]
  }
  
  @scala.inline
  implicit class IfAssignmentErrorOps[Self <: IfAssignmentError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIfAssignmentError(value: Boolean): Self = this.set("ifAssignmentError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLoopIterations(value: Double): Self = this.set("maxLoopIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeSkipKey(value: String): Self = this.set("typeSkipKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVisitedPassages(value: Boolean): Self = this.set("typeVisitedPassages", value.asInstanceOf[js.Any])
  }
}
