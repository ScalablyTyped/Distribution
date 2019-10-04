package typings.atUifabricUtilities

import typings.react.reactMod.Component
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/getWindow", JSImport.Namespace)
@js.native
object libDomGetWindowMod extends js.Object {
  def getWindow(): js.UndefOr[Window] = js.native
  def getWindow(rootElement: Component[js.Object, js.Object, _]): js.UndefOr[Window] = js.native
  def getWindow(rootElement: Element): js.UndefOr[Window] = js.native
}

