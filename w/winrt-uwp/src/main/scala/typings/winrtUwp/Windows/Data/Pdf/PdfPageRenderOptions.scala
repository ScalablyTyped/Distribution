package typings.winrtUwp.Windows.Data.Pdf

import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
@js.native
trait PdfPageRenderOptions extends js.Object {
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
  @scala.inline
  implicit class PdfPageRenderOptionsOps[Self <: PdfPageRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitmapEncoderId(value: String): Self = this.set("bitmapEncoderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationHeight(value: Double): Self = this.set("destinationHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationWidth(value: Double): Self = this.set("destinationWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIgnoringHighContrast(value: Boolean): Self = this.set("isIgnoringHighContrast", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRect(value: Rect): Self = this.set("sourceRect", value.asInstanceOf[js.Any])
  }
  
}

