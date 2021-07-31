package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsType extends StObject {
  
  var items: Unit
  
  var `type`: String
}
object ItemsType {
  
  @scala.inline
  def apply(items: Unit, `type`: String): ItemsType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsType]
  }
  
  @scala.inline
  implicit class ItemsTypeMutableBuilder[Self <: ItemsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: Unit): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
