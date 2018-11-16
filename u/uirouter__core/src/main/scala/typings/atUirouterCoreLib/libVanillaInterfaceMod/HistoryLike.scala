package typings
package atUirouterCoreLib.libVanillaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryLike extends js.Object {
  def back(): scala.Unit = js.native
  def back(distance: js.Any): scala.Unit = js.native
  def forward(): scala.Unit = js.native
  def forward(distance: js.Any): scala.Unit = js.native
  def pushState(statedata: js.Any): scala.Unit = js.native
  def pushState(statedata: js.Any, title: java.lang.String): scala.Unit = js.native
  def pushState(statedata: js.Any, title: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def replaceState(statedata: js.Any): scala.Unit = js.native
  def replaceState(statedata: js.Any, title: java.lang.String): scala.Unit = js.native
  def replaceState(statedata: js.Any, title: java.lang.String, url: java.lang.String): scala.Unit = js.native
}

