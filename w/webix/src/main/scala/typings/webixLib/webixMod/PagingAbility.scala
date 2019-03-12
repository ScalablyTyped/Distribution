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
  def apply(getPage: () => scala.Double, getPager: () => js.Any, setPage: scala.Double => scala.Unit): PagingAbility = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getPager = js.Any.fromFunction0(getPager), setPage = js.Any.fromFunction1(setPage))
  
    __obj.asInstanceOf[PagingAbility]
  }
}

