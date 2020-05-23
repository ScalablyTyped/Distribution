package typings.winrtUwp.Windows.Data.Pdf

import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
trait PdfPageRenderOptions extends js.Object {
  /** Gets or sets the Portable Document Format (PDF) page's background color. */
  var backgroundColor: Color
  /** Gets or sets the Portable Document Format (PDF) page's encoding type to be used while the page is being converted to a bitmap. */
  var bitmapEncoderId: String
  /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
  var destinationHeight: Double
  /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
  var destinationWidth: Double
  /** Gets or sets whether the Portable Document Format (PDF) page uses the system's high contrast display setting. */
  var isIgnoringHighContrast: Boolean
  /** Gets or sets a portion of the Portable Document Format (PDF) page to be displayed. */
  var sourceRect: Rect
}

object PdfPageRenderOptions {
  @scala.inline
  def apply(
    backgroundColor: Color,
    bitmapEncoderId: String,
    destinationHeight: Double,
    destinationWidth: Double,
    isIgnoringHighContrast: Boolean,
    sourceRect: Rect
  ): PdfPageRenderOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bitmapEncoderId = bitmapEncoderId.asInstanceOf[js.Any], destinationHeight = destinationHeight.asInstanceOf[js.Any], destinationWidth = destinationWidth.asInstanceOf[js.Any], isIgnoringHighContrast = isIgnoringHighContrast.asInstanceOf[js.Any], sourceRect = sourceRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfPageRenderOptions]
  }
}

