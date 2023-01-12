package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldControlOutput extends StObject {
  
  /* Note: paramType and type properties are also on this object.
    * It's unclear if they're internal use only.
    *    paramType: undefined,
    *    type: number
    */
  /**
    * Output value from the control
    */
  var value: Any
}
object FieldControlOutput {
  
  inline def apply(value: Any): FieldControlOutput = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldControlOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldControlOutput] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
