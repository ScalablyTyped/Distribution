package typings.uifabricReactHooks

import typings.react.mod.RefObject
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnEventMod {
  
  @JSImport("@uifabric/react-hooks/lib/useOnEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: TElement, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: TElement,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Null, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Null,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Unit, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Unit,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: RefObject[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: RefObject[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Document, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Document,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Window, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Window,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
