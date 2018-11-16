package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to information about a decoder or encoder. */
@JSGlobal("Windows.Graphics.Imaging.BitmapCodecInformation")
@js.native
abstract class BitmapCodecInformation () extends js.Object {
  /** The unique identifier of the decoder or encoder. Methods like BitmapDecoder::CreateAsync and BitmapEncoder::CreateAsync use the codec identifier to determine which codec to create. */
  var codecId: java.lang.String = js.native
  /** A collection of all the file extensions supported by the decoder or encoder. */
  var fileExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** The friendly name of the decoder or encoder. */
  var friendlyName: java.lang.String = js.native
  /** A collection of all the MIME/content types supported by the decoder or encoder. MIME type is synonymous with content type . */
  var mimeTypes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
}

