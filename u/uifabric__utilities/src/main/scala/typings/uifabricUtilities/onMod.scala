package typings.uifabricUtilities

import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onMod {
  
  @JSImport("@uifabric/utilities/lib/dom/on", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def on(element: Document, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(
    element: Document,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(element: Element, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
