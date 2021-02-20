package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeString extends StObject {
  
  var items: Type = js.native
  
  var `type`: String = js.native
}
object TypeString {
  
  @scala.inline
  def apply(items: Type, `type`: String): TypeString = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeString]
  }
  
  @scala.inline
  implicit class TypeStringMutableBuilder[Self <: TypeString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: Type): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
