package typings.winrtDashUwp.WindowsNs.DataNs.PdfNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Rect
import typings.winrtDashUwp.WindowsNs.UINs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
@JSGlobal("Windows.Data.Pdf.PdfPageRenderOptions")
@js.native
/** Creates and initializes a new instance of display settings for a single page of a Portable Document Format (PDF) document. */
class PdfPageRenderOptions () extends js.Object {
  /** Gets or sets the Portable Document Format (PDF) page's background color. */
  var backgroundColor: Color = js.native
  /** Gets or sets the Portable Document Format (PDF) page's encoding type to be used while the page is being converted to a bitmap. */
  var bitmapEncoderId: String = js.native
  /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
  var destinationHeight: Double = js.native
  /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
  var destinationWidth: Double = js.native
  /** Gets or sets whether the Portable Document Format (PDF) page uses the system's high contrast display setting. */
  var isIgnoringHighContrast: Boolean = js.native
  /** Gets or sets a portion of the Portable Document Format (PDF) page to be displayed. */
  var sourceRect: Rect = js.native
}

