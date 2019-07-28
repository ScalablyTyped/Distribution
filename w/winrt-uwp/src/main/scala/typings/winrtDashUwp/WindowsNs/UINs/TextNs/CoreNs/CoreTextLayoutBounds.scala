package typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the bounding boxes—in screen coordinates—of a range of text, and of a text input control. */
@JSGlobal("Windows.UI.Text.Core.CoreTextLayoutBounds")
@js.native
abstract class CoreTextLayoutBounds () extends js.Object {
  /** Gets or sets the bounding box in screen coordinates of a text input control. */
  var controlBounds: Rect = js.native
  /** Gets or sets the bounding box in screen coordinates of a range of text. */
  var textBounds: Rect = js.native
}

