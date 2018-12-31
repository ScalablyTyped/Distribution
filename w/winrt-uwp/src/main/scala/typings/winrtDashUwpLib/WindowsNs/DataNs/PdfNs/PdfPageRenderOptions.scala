package typings
package winrtDashUwpLib.WindowsNs.DataNs.PdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
@JSGlobal("Windows.Data.Pdf.PdfPageRenderOptions")
@js.native
/** Creates and initializes a new instance of display settings for a single page of a Portable Document Format (PDF) document. */
class PdfPageRenderOptions () extends js.Object {
  /** Gets or sets the Portable Document Format (PDF) page's background color. */
  var backgroundColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets or sets the Portable Document Format (PDF) page's encoding type to be used while the page is being converted to a bitmap. */
  var bitmapEncoderId: java.lang.String = js.native
  /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
  var destinationHeight: scala.Double = js.native
  /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
  var destinationWidth: scala.Double = js.native
  /** Gets or sets whether the Portable Document Format (PDF) page uses the system's high contrast display setting. */
  var isIgnoringHighContrast: scala.Boolean = js.native
  /** Gets or sets a portion of the Portable Document Format (PDF) page to be displayed. */
  var sourceRect: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
}

