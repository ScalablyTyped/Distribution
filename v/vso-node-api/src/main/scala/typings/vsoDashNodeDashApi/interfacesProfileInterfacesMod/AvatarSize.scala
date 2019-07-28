package typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AvatarSize extends js.Object

@JSImport("vso-node-api/interfaces/ProfileInterfaces", "AvatarSize")
@js.native
object AvatarSize extends js.Object {
  @js.native
  sealed trait Large extends AvatarSize
  
  @js.native
  sealed trait Medium extends AvatarSize
  
  @js.native
  sealed trait Small extends AvatarSize
  
  /* 2 */ val Large: typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod.AvatarSize.Large with Double = js.native
  /* 1 */ val Medium: typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod.AvatarSize.Medium with Double = js.native
  /* 0 */ val Small: typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod.AvatarSize.Small with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AvatarSize with Double] = js.native
}

