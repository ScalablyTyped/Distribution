package typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod.AvatarSize.Large
import typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod.AvatarSize.Medium
import typings.vsoDashNodeDashApi.interfacesProfileInterfacesMod.AvatarSize.Small
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AvatarSize with Double] = js.native
  /* 2 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  /* 1 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
  /* 0 */ @js.native
  object Small extends TopLevel[Small with Double]
  
}

