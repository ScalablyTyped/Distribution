package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortModeOrder extends StObject
@JSImport("tizen-common-web/tizen", "SortModeOrder")
@js.native
object SortModeOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortModeOrder with String] = js.native
  
  @js.native
  sealed trait ASC extends SortModeOrder
  /* "ASC" */ val ASC: typings.tizenCommonWeb.tizenMod.SortModeOrder.ASC with String = js.native
  
  @js.native
  sealed trait DESC extends SortModeOrder
  /* "DESC" */ val DESC: typings.tizenCommonWeb.tizenMod.SortModeOrder.DESC with String = js.native
}
