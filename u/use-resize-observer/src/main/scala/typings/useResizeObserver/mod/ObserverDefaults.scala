package typings.useResizeObserver.mod

import typings.react.mod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement]
  - typings.useResizeObserver.mod.DefaultsWithResizeHandler[TElement]
*/
trait ObserverDefaults[TElement /* <: HTMLElement */] extends js.Object

object ObserverDefaults {
  @scala.inline
  def DefaultsWithoutResizeHandler[TElement](ref: RefObject[TElement] = null): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
  @scala.inline
  def DefaultsWithResizeHandler[TElement](onResize: /* newSize */ RefSize => Unit, ref: RefObject[TElement] = null): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
}

