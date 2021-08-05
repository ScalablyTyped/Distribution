package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitmapProperties
  extends StObject
     with IBitmapProperties
object BitmapProperties {
  
  inline def apply(
    getPropertiesAsync: IIterable[String] => IAsyncOperation[BitmapPropertySet],
    setPropertiesAsync: IIterable[IKeyValuePair[String, BitmapTypedValue]] => IAsyncAction
  ): BitmapProperties = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync), setPropertiesAsync = js.Any.fromFunction1(setPropertiesAsync))
    __obj.asInstanceOf[BitmapProperties]
  }
}
