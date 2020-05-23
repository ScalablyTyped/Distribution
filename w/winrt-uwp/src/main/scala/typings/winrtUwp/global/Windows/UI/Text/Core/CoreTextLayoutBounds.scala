package typings.winrtUwp.global.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the bounding boxes—in screen coordinates—of a range of text, and of a text input control. */
@JSGlobal("Windows.UI.Text.Core.CoreTextLayoutBounds")
@js.native
abstract class CoreTextLayoutBounds ()
  extends typings.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutBounds {
  /** Gets or sets the bounding box in screen coordinates of a text input control. */
  /* CompleteClass */
  override var controlBounds: Rect = js.native
  /** Gets or sets the bounding box in screen coordinates of a range of text. */
  /* CompleteClass */
  override var textBounds: Rect = js.native
}

