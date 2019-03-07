package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/on", JSImport.Namespace)
@js.native
object libDomOnMod extends js.Object {
  def on(
    element: reactLib.Element,
    eventName: java.lang.String,
    callback: js.Function1[/* ev */ reactLib.Event, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def on(
    element: reactLib.Element,
    eventName: java.lang.String,
    callback: js.Function1[/* ev */ reactLib.Event, scala.Unit],
    options: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
  def on(
    element: stdLib.Window,
    eventName: java.lang.String,
    callback: js.Function1[/* ev */ reactLib.Event, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def on(
    element: stdLib.Window,
    eventName: java.lang.String,
    callback: js.Function1[/* ev */ reactLib.Event, scala.Unit],
    options: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
}

