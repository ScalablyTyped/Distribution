package typings.vegaTypings.scaleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleMultiFieldsRef extends StObject {
  
  var data: String = js.native
  
  var fields: js.Array[ScaleField] = js.native
}
object ScaleMultiFieldsRef {
  
  @scala.inline
  def apply(data: String, fields: js.Array[ScaleField]): ScaleMultiFieldsRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMultiFieldsRef]
  }
  
  @scala.inline
  implicit class ScaleMultiFieldsRefMutableBuilder[Self <: ScaleMultiFieldsRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[ScaleField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: ScaleField*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
