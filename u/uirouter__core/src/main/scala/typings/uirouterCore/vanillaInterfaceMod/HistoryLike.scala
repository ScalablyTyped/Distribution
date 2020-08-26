package typings.uirouterCore.vanillaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryLike extends js.Object {
  def back(): Unit = js.native
  def back(distance: js.Any): Unit = js.native
  def forward(): Unit = js.native
  def forward(distance: js.Any): Unit = js.native
  def pushState(statedata: js.Any): Unit = js.native
  def pushState(statedata: js.Any, title: js.UndefOr[scala.Nothing], url: String): Unit = js.native
  def pushState(statedata: js.Any, title: String): Unit = js.native
  def pushState(statedata: js.Any, title: String, url: String): Unit = js.native
  def replaceState(statedata: js.Any): Unit = js.native
  def replaceState(statedata: js.Any, title: js.UndefOr[scala.Nothing], url: String): Unit = js.native
  def replaceState(statedata: js.Any, title: String): Unit = js.native
  def replaceState(statedata: js.Any, title: String, url: String): Unit = js.native
}

