package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsType extends StObject {
  
  var items: js.UndefOr[scala.Nothing] = js.native
  
  var `type`: String = js.native
}
object ItemsType {
  
  @scala.inline
  def apply(`type`: String): ItemsType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsType]
  }
  
  @scala.inline
  implicit class ItemsTypeMutableBuilder[Self <: ItemsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
