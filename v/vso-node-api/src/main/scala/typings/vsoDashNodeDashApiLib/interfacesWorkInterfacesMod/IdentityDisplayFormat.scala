package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IdentityDisplayFormat extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "IdentityDisplayFormat")
@js.native
object IdentityDisplayFormat extends js.Object {
  /**
    * Display Avatar and Full name
    */
  @js.native
  sealed trait AvatarAndFullName
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.IdentityDisplayFormat
  
  /**
    * Display avatar only
    */
  @js.native
  sealed trait AvatarOnly
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.IdentityDisplayFormat
  
  /**
    * Display Full name only
    */
  @js.native
  sealed trait FullName
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.IdentityDisplayFormat
  
  /* 2 */ val AvatarAndFullName: AvatarAndFullName with scala.Double = js.native
  /* 0 */ val AvatarOnly: AvatarOnly with scala.Double = js.native
  /* 1 */ val FullName: FullName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.IdentityDisplayFormat with scala.Double
  ] = js.native
}

