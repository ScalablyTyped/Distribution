package typings.winrt.Windows.Graphics.Imaging

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelDataProvider
  extends StObject
     with IPixelDataProvider
object PixelDataProvider {
  
  @scala.inline
  def apply(detachPixelData: () => Uint8Array): PixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = js.Any.fromFunction0(detachPixelData))
    __obj.asInstanceOf[PixelDataProvider]
  }
}
