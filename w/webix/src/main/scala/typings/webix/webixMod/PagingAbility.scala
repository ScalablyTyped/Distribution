package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagingAbility extends js.Object {
  def getPage(): Double
  def getPager(): js.Any
  def setPage(page: Double): Unit
}

@JSImport("webix", "PagingAbility")
@js.native
object PagingAbility extends TopLevel[PagingAbility]

