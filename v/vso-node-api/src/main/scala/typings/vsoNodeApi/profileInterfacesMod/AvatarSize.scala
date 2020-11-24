package typings.vsoNodeApi.profileInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AvatarSize extends js.Object
@JSImport("vso-node-api/interfaces/ProfileInterfaces", "AvatarSize")
@js.native
object AvatarSize extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AvatarSize with Double] = js.native
  
  @js.native
  sealed trait Large extends AvatarSize
  /* 2 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  @js.native
  sealed trait Medium extends AvatarSize
  /* 1 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
  @js.native
  sealed trait Small extends AvatarSize
  /* 0 */ @js.native
  object Small extends TopLevel[Small with Double]
}
