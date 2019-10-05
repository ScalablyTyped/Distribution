package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.MouseWheelParameters")
@js.native
class MouseWheelParameters () extends IMouseWheelParameters {
  /* CompleteClass */
  override var charTranslation: Point = js.native
  /* CompleteClass */
  override var deltaRotationAngle: Double = js.native
  /* CompleteClass */
  override var deltaScale: Double = js.native
  /* CompleteClass */
  override var pageTranslation: Point = js.native
}

