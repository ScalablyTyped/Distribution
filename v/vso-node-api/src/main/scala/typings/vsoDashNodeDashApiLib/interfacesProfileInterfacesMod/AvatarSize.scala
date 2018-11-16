package typings
package vsoDashNodeDashApiLib.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AvatarSize extends js.Object

@JSImport("vso-node-api/interfaces/ProfileInterfaces", "AvatarSize")
@js.native
object AvatarSize extends js.Object {
  @js.native
  sealed trait Large
    extends vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.AvatarSize
  
  @js.native
  sealed trait Medium
    extends vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.AvatarSize
  
  @js.native
  sealed trait Small
    extends vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.AvatarSize
  
  /* 2 */ val Large: Large with scala.Double = js.native
  /* 1 */ val Medium: Medium with scala.Double = js.native
  /* 0 */ val Small: Small with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.AvatarSize with scala.Double
  ] = js.native
}

