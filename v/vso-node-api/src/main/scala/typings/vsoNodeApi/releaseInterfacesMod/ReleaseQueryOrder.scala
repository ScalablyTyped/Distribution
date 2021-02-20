package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseQueryOrder")
@js.native
object ReleaseQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseQueryOrder with Double] = js.native
  
  @js.native
  sealed trait Ascending extends ReleaseQueryOrder
  /* 1 */ val Ascending: typings.vsoNodeApi.releaseInterfacesMod.ReleaseQueryOrder.Ascending with Double = js.native
  
  @js.native
  sealed trait Descending extends ReleaseQueryOrder
  /* 0 */ val Descending: typings.vsoNodeApi.releaseInterfacesMod.ReleaseQueryOrder.Descending with Double = js.native
}
