package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseQueryOrder")
@js.native
object ReleaseQueryOrder extends js.Object {
  @js.native
  sealed trait Ascending extends ReleaseQueryOrder
  
  @js.native
  sealed trait Descending extends ReleaseQueryOrder
  
  /* 1 */ val Ascending: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseQueryOrder.Ascending with Double = js.native
  /* 0 */ val Descending: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseQueryOrder.Descending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseQueryOrder with Double] = js.native
}

