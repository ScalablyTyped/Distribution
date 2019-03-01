package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagingAbility extends js.Object {
  def getPage(): scala.Double
  def getPager(): js.Any
  def setPage(page: scala.Double): scala.Unit
}

object PagingAbility {
  @scala.inline
  def apply(
    getPage: js.Function0[scala.Double],
    getPager: js.Function0[js.Any],
    setPage: js.Function1[scala.Double, scala.Unit]
  ): PagingAbility = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPage")(getPage)
    __obj.updateDynamic("getPager")(getPager)
    __obj.updateDynamic("setPage")(setPage)
    __obj.asInstanceOf[PagingAbility]
  }
}

