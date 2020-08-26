package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortModeOrder extends js.Object

@JSImport("tizen-common-web/tizen", "SortModeOrder")
@js.native
object SortModeOrder extends js.Object {
  @js.native
  sealed trait ASC extends SortModeOrder
  
  @js.native
  sealed trait DESC extends SortModeOrder
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortModeOrder with String] = js.native
  /* "ASC" */ @js.native
  object ASC extends TopLevel[ASC with String]
  
  /* "DESC" */ @js.native
  object DESC extends TopLevel[DESC with String]
  
}

