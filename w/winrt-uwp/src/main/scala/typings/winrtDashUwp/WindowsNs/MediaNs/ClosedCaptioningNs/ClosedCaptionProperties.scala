package typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs

import typings.winrtDashUwp.WindowsNs.UINs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes properties for retrieving the closed caption formatting settings that the user can set through the system's closed captioning settings page. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties")
@js.native
abstract class ClosedCaptionProperties () extends js.Object

/* static members */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionProperties")
@js.native
object ClosedCaptionProperties extends js.Object {
  /** Gets the background color of lines of closed caption text. */
  var backgroundColor: ClosedCaptionColor = js.native
  /** Gets the background opacity of lines of closed caption text. */
  var backgroundOpacity: ClosedCaptionOpacity = js.native
  /** Gets the computed background color of lines of closed caption text. */
  var computedBackgroundColor: Color = js.native
  /** Gets the computed font color for closed caption text. */
  var computedFontColor: Color = js.native
  /** Gets the computed region color for closed caption text. */
  var computedRegionColor: Color = js.native
  /** Gets the font color for closed caption text. */
  var fontColor: ClosedCaptionColor = js.native
  /** Gets the font effect for closed caption text. */
  var fontEffect: ClosedCaptionEdgeEffect = js.native
  /** Gets the font opacity for closed caption text. */
  var fontOpacity: ClosedCaptionOpacity = js.native
  /** Gets the font size for closed caption text. */
  var fontSize: ClosedCaptionSize = js.native
  /** Gets the font style for closed caption text. */
  var fontStyle: ClosedCaptionStyle = js.native
  /** Gets the region color for closed caption text. */
  var regionColor: ClosedCaptionColor = js.native
  /** Gets the region opacity for closed caption text. */
  var regionOpacity: ClosedCaptionOpacity = js.native
}

