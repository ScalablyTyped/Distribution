package typings.uifabricReactHooks

import typings.react.mod.RefObject
import typings.std.Element
import typings.std.Event
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/react-hooks/lib/useOnEvent", JSImport.Namespace)
@js.native
object useOnEventMod extends js.Object {
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[Null | (RefObject[js.UndefOr[TElement | Null]]) | TElement | Window],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[Null | (RefObject[js.UndefOr[TElement | Null]]) | TElement | Window],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}

