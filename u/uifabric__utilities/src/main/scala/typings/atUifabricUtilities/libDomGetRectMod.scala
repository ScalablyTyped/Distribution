package typings.atUifabricUtilities

import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/getRect", JSImport.Namespace)
@js.native
object libDomGetRectMod extends js.Object {
  def getRect(): js.UndefOr[IRectangle] = js.native
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = js.native
  def getRect(element: Window): js.UndefOr[IRectangle] = js.native
}

