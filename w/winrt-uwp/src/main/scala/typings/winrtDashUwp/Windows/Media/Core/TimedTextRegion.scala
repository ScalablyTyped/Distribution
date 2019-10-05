package typings.winrtDashUwp.Windows.Media.Core

import typings.winrtDashUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes properties for customizing the appearance of the rendering area of a TimedTextCue . */
@JSGlobal("Windows.Media.Core.TimedTextRegion")
@js.native
/** Initializes a new instance of the TimedTextRegion class. */
class TimedTextRegion () extends js.Object {
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

