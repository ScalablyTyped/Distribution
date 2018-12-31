package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapProperties extends IBitmapPropertiesView {
  def setPropertiesAsync(
    propertiesToSet: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, BitmapTypedValue]
    ]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

