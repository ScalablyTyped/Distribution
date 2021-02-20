package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.PropertyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapTypedValueFactory extends StObject {
  
  def create(value: js.Any, `type`: PropertyType): BitmapTypedValue = js.native
}
object IBitmapTypedValueFactory {
  
  @scala.inline
  def apply(create: (js.Any, PropertyType) => BitmapTypedValue): IBitmapTypedValueFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[IBitmapTypedValueFactory]
  }
  
  @scala.inline
  implicit class IBitmapTypedValueFactoryMutableBuilder[Self <: IBitmapTypedValueFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (js.Any, PropertyType) => BitmapTypedValue): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
