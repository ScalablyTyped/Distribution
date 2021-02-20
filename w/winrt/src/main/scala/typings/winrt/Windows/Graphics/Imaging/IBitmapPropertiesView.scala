package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapPropertiesView extends StObject {
  
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[BitmapPropertySet] = js.native
}
object IBitmapPropertiesView {
  
  @scala.inline
  def apply(getPropertiesAsync: IIterable[String] => IAsyncOperation[BitmapPropertySet]): IBitmapPropertiesView = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync))
    __obj.asInstanceOf[IBitmapPropertiesView]
  }
  
  @scala.inline
  implicit class IBitmapPropertiesViewMutableBuilder[Self <: IBitmapPropertiesView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPropertiesAsync(value: IIterable[String] => IAsyncOperation[BitmapPropertySet]): Self = StObject.set(x, "getPropertiesAsync", js.Any.fromFunction1(value))
  }
}
