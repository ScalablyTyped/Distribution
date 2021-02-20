package typings.uifabricUtilities

import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onMod {
  
  @JSImport("@uifabric/utilities/lib/dom/on", "on")
  @js.native
  def on(element: Document, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom/on", "on")
  @js.native
  def on(
    element: Document,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom/on", "on")
  @js.native
  def on(element: Element, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom/on", "on")
  @js.native
  def on(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom/on", "on")
  @js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  @JSImport("@uifabric/utilities/lib/dom/on", "on")
  @js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit], options: Boolean): js.Function0[Unit] = js.native
}
