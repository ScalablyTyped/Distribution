package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadIdentitiesOptions extends js.Object

@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "ReadIdentitiesOptions")
@js.native
object ReadIdentitiesOptions extends js.Object {
  @js.native
  sealed trait FilterIllegalMemberships
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.ReadIdentitiesOptions
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.ReadIdentitiesOptions
  
  /* 1 */ val FilterIllegalMemberships: FilterIllegalMemberships with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.ReadIdentitiesOptions with scala.Double
  ] = js.native
}

