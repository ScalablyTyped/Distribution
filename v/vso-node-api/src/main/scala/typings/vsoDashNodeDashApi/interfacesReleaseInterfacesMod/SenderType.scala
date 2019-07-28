package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SenderType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "SenderType")
@js.native
object SenderType extends js.Object {
  @js.native
  sealed trait RequestingUser extends SenderType
  
  @js.native
  sealed trait ServiceAccount extends SenderType
  
  /* 2 */ val RequestingUser: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.SenderType.RequestingUser with Double = js.native
  /* 1 */ val ServiceAccount: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.SenderType.ServiceAccount with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SenderType with Double] = js.native
}

