package typings.webix.webixMod

import typings.webix.webixMod.uiNs.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdSpace extends js.Object {
  @JSName("$$")
  var $$: js.Any = js.native
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  def ui(view: js.Any): baseview = js.native
}

