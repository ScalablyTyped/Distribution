package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SenderType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "SenderType")
@js.native
object SenderType extends js.Object {
  @js.native
  sealed trait RequestingUser
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.SenderType
  
  @js.native
  sealed trait ServiceAccount
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.SenderType
  
  /* 2 */ val RequestingUser: RequestingUser with scala.Double = js.native
  /* 1 */ val ServiceAccount: ServiceAccount with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.SenderType with scala.Double
  ] = js.native
}

