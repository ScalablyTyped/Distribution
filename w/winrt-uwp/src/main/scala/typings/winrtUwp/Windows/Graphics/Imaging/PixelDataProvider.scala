package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the pixel data from a bitmap frame. */
trait PixelDataProvider extends StObject {
  
  /**
    * Returns the internally-stored pixel data.
    * @return The pixel data.
    */
  def detachPixelData(): js.Array[Double]
}
object PixelDataProvider {
  
  inline def apply(detachPixelData: () => js.Array[Double]): PixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = js.Any.fromFunction0(detachPixelData))
    __obj.asInstanceOf[PixelDataProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelDataProvider] (val x: Self) extends AnyVal {
    
    inline def setDetachPixelData(value: () => js.Array[Double]): Self = StObject.set(x, "detachPixelData", js.Any.fromFunction0(value))
  }
}
