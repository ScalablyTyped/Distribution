package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagingAbility extends js.Object {
  def getPage(): Double
  def getPager(): js.Any
  def setPage(page: Double): Unit
}

@JSGlobal("webix.PagingAbility")
@js.native
object PagingAbility extends TopLevel[PagingAbility]

