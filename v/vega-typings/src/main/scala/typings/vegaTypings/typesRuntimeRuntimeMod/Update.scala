package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.vegaTypings.anon.Force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  /**
    * If force is true, then it will always update the target,
    * even if the result is the same
    */
  var options: js.UndefOr[Force] = js.undefined
  
  /**
    * Whenever the source signal fires, the update is triggered
    */
  var source: ID | OperatorParam
  
  /**
    * The target signal is set to the new value.
    * Using an expression as a target is supported in the vega runtime
    * but not used currently in any examples, so we don't include it in the typings.
    */
  var target: ID
  
  /**
    * The update is  either a static value or a parse expression that is
    * re-evaluated whenever the source fires, and returns the value for the
    * target
    */
  var update: ObjectOrAny[ExpressionParam]
}
object Update {
  
  inline def apply(source: ID | OperatorParam, target: ID): Update = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Force): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSource(value: ID | OperatorParam): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: ID): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: ObjectOrAny[ExpressionParam]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateNull: Self = StObject.set(x, "update", null)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUpdateVarargs(value: Any*): Self = StObject.set(x, "update", js.Array(value*))
  }
}
