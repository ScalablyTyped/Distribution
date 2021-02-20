package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.PropertyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapTypedValue extends StObject {
  
  var `type`: PropertyType = js.native
  
  var value: js.Any = js.native
}
object IBitmapTypedValue {
  
  @scala.inline
  def apply(`type`: PropertyType, value: js.Any): IBitmapTypedValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapTypedValue]
  }
  
  @scala.inline
  implicit class IBitmapTypedValueMutableBuilder[Self <: IBitmapTypedValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
