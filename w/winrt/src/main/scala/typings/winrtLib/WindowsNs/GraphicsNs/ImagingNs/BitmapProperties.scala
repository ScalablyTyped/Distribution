package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
@js.native
class BitmapProperties () extends IBitmapProperties {
  /* CompleteClass */
  override def getPropertiesAsync(propertiesToRetrieve: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapPropertySet] = js.native
  /* CompleteClass */
  override def setPropertiesAsync(
    propertiesToSet: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, BitmapTypedValue]
    ]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

