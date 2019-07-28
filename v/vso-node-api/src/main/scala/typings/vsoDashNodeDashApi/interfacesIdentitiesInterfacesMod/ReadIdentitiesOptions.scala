package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadIdentitiesOptions extends js.Object

@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "ReadIdentitiesOptions")
@js.native
object ReadIdentitiesOptions extends js.Object {
  @js.native
  sealed trait FilterIllegalMemberships extends ReadIdentitiesOptions
  
  @js.native
  sealed trait None extends ReadIdentitiesOptions
  
  /* 1 */ val FilterIllegalMemberships: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.ReadIdentitiesOptions.FilterIllegalMemberships with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.ReadIdentitiesOptions.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadIdentitiesOptions with Double] = js.native
}

