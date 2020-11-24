package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagingAbility extends js.Object {
  
  def getPage(): Double = js.native
  
  def getPager(): js.Any = js.native
  
  def setPage(page: Double): Unit = js.native
}
@JSImport("webix", "PagingAbility")
@js.native
object PagingAbility extends TopLevel[PagingAbility]
