package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagingAbility extends js.Object {
  def getPage(): Double
  def getPager(): js.Any
  def setPage(page: Double): Unit
}

object PagingAbility {
  @scala.inline
  def apply(getPage: () => Double, getPager: () => js.Any, setPage: Double => Unit): PagingAbility = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getPager = js.Any.fromFunction0(getPager), setPage = js.Any.fromFunction1(setPage))
    __obj.asInstanceOf[PagingAbility]
  }
}

