package typings.vegaTypings.scaleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleDataRef extends StObject {
  
  var data: String = js.native
  
  var field: ScaleField = js.native
}
object ScaleDataRef {
  
  @scala.inline
  def apply(data: String, field: ScaleField): ScaleDataRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleDataRef]
  }
  
  @scala.inline
  implicit class ScaleDataRefMutableBuilder[Self <: ScaleDataRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: ScaleField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
