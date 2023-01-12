package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelDataProvider extends StObject {
  
  def detachPixelData(): js.typedarray.Uint8Array
}
object IPixelDataProvider {
  
  inline def apply(detachPixelData: () => js.typedarray.Uint8Array): IPixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = js.Any.fromFunction0(detachPixelData))
    __obj.asInstanceOf[IPixelDataProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPixelDataProvider] (val x: Self) extends AnyVal {
    
    inline def setDetachPixelData(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "detachPixelData", js.Any.fromFunction0(value))
  }
}
