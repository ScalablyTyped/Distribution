package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes properties for customizing the appearance of the rendering area of a TimedTextCue . */
@js.native
trait TimedTextRegion extends js.Object {
  /** Gets or sets the background color of the TimedTextRegion . */
  var background: Color = js.native
  /** Gets or sets the display alignment of the TimedTextRegion . */
  var displayAlignment: TimedTextDisplayAlignment = js.native
  /** Gets or sets the extent of the TimedTextRegion , which is the rendered size of the region either in pixels or in percentage of available space. */
  var extent: TimedTextSize = js.native
  /** Gets or sets a value indicating whether text overflowing the region is clipped. */
  var isOverflowClipped: Boolean = js.native
  /** Gets or sets a value that indicates the height of each line of content. */
  var lineHeight: TimedTextDouble = js.native
  /** Gets or sets a string representing the name of the TimedTextRegion . */
  var name: String = js.native
  /** Gets or sets a value that indicates the thickness of padding space between the boundaries of the content area and the content displayed by a TimedTextRegion . */
  var padding: TimedTextPadding = js.native
  /** Gets or sets the position of the TimedTextRegion , relative to the top left corner of the video frame. */
  var position: TimedTextPoint = js.native
  /** Gets a value indicating the method in which lines of text scroll through the region. */
  var scrollMode: TimedTextScrollMode = js.native
  /** Gets or sets a value indicating whether text wraps when it reaches the edge of the TimedTextRegion . */
  var textWrapping: TimedTextWrapping = js.native
  /** Gets or sets a value indicating the direction that text flows within the TimedTextRegion . */
  var writingMode: TimedTextWritingMode = js.native
  /** Gets or sets the Z-order of the TimedTextRegion , relative to other active regions on the screen, in case they overlap. */
  var zindex: Double = js.native
}

object TimedTextRegion {
  @scala.inline
  def apply(
    background: Color,
    displayAlignment: TimedTextDisplayAlignment,
    extent: TimedTextSize,
    isOverflowClipped: Boolean,
    lineHeight: TimedTextDouble,
    name: String,
    padding: TimedTextPadding,
    position: TimedTextPoint,
    scrollMode: TimedTextScrollMode,
    textWrapping: TimedTextWrapping,
    writingMode: TimedTextWritingMode,
    zindex: Double
  ): TimedTextRegion = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], displayAlignment = displayAlignment.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], isOverflowClipped = isOverflowClipped.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scrollMode = scrollMode.asInstanceOf[js.Any], textWrapping = textWrapping.asInstanceOf[js.Any], writingMode = writingMode.asInstanceOf[js.Any], zindex = zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextRegion]
  }
  @scala.inline
  implicit class TimedTextRegionOps[Self <: TimedTextRegion] (val x: Self) extends AnyVal {
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
    def setBackground(value: Color): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayAlignment(value: TimedTextDisplayAlignment): Self = this.set("displayAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtent(value: TimedTextSize): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOverflowClipped(value: Boolean): Self = this.set("isOverflowClipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineHeight(value: TimedTextDouble): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadding(value: TimedTextPadding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: TimedTextPoint): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollMode(value: TimedTextScrollMode): Self = this.set("scrollMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextWrapping(value: TimedTextWrapping): Self = this.set("textWrapping", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritingMode(value: TimedTextWritingMode): Self = this.set("writingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setZindex(value: Double): Self = this.set("zindex", value.asInstanceOf[js.Any])
  }
  
}

