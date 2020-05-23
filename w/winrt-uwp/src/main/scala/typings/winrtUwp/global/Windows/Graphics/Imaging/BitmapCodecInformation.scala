package typings.winrtUwp.global.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to information about a decoder or encoder. */
@JSGlobal("Windows.Graphics.Imaging.BitmapCodecInformation")
@js.native
abstract class BitmapCodecInformation ()
  extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation {
  /** The unique identifier of the decoder or encoder. Methods like BitmapDecoder::CreateAsync and BitmapEncoder::CreateAsync use the codec identifier to determine which codec to create. */
  /* CompleteClass */
  override var codecId: String = js.native
  /** A collection of all the file extensions supported by the decoder or encoder. */
  /* CompleteClass */
  override var fileExtensions: IVectorView[String] = js.native
  /** The friendly name of the decoder or encoder. */
  /* CompleteClass */
  override var friendlyName: String = js.native
  /** A collection of all the MIME/content types supported by the decoder or encoder. MIME type is synonymous with content type . */
  /* CompleteClass */
  override var mimeTypes: IVectorView[String] = js.native
}

