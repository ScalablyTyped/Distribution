package typings.wordpressDom.mod

import typings.std.DOMRect
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
@js.native
object placeCaretAtVerticalEdge extends js.Object {
  def apply(container: js.UndefOr[scala.Nothing], isReverse: Boolean): Unit = js.native
  def apply(container: js.UndefOr[scala.Nothing], isReverse: Boolean, rect: DOMRect): Unit = js.native
  def apply(container: js.UndefOr[scala.Nothing], isReverse: Boolean, rect: DOMRect, mayUseScroll: Boolean): Unit = js.native
  def apply(container: HTMLElement, isReverse: Boolean): Unit = js.native
  def apply(container: HTMLElement, isReverse: Boolean, rect: DOMRect): Unit = js.native
  def apply(container: HTMLElement, isReverse: Boolean, rect: DOMRect, mayUseScroll: Boolean): Unit = js.native
}

