package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortModeOrder extends js.Object
@JSImport("tizen-common-web/tizen", "SortModeOrder")
@js.native
object SortModeOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortModeOrder with String] = js.native
  
  @js.native
  sealed trait ASC extends SortModeOrder
  /* "ASC" */ @js.native
  object ASC extends TopLevel[ASC with String]
  
  @js.native
  sealed trait DESC extends SortModeOrder
  /* "DESC" */ @js.native
  object DESC extends TopLevel[DESC with String]
}
