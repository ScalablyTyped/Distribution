package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseQueryOrder")
@js.native
object ReleaseQueryOrder extends js.Object {
  @js.native
  sealed trait Ascending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseQueryOrder
  
  @js.native
  sealed trait Descending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseQueryOrder
  
  /* 1 */ val Ascending: Ascending with scala.Double = js.native
  /* 0 */ val Descending: Descending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseQueryOrder with scala.Double
  ] = js.native
}

