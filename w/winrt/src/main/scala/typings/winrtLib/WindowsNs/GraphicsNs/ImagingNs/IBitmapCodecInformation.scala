package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapCodecInformation extends js.Object {
  var codecId: java.lang.String
  var fileExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var friendlyName: java.lang.String
  var mimeTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
}

object IBitmapCodecInformation {
  @scala.inline
  def apply(
    codecId: java.lang.String,
    fileExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    friendlyName: java.lang.String,
    mimeTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  ): IBitmapCodecInformation = {
    val __obj = js.Dynamic.literal(codecId = codecId, fileExtensions = fileExtensions, friendlyName = friendlyName, mimeTypes = mimeTypes)
  
    __obj.asInstanceOf[IBitmapCodecInformation]
  }
}

