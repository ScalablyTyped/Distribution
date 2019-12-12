package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.IdentityDisplayFormat.AvatarAndFullName
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.IdentityDisplayFormat.AvatarOnly
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.IdentityDisplayFormat.FullName
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
  sealed trait AvatarAndFullName extends IdentityDisplayFormat
  
  /**
    * Display avatar only
    */
  @js.native
  sealed trait AvatarOnly extends IdentityDisplayFormat
  
  /**
    * Display Full name only
    */
  @js.native
  sealed trait FullName extends IdentityDisplayFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdentityDisplayFormat with Double] = js.native
  /* 2 */ @js.native
  object AvatarAndFullName extends TopLevel[AvatarAndFullName with Double]
  
  /* 0 */ @js.native
  object AvatarOnly extends TopLevel[AvatarOnly with Double]
  
  /* 1 */ @js.native
  object FullName extends TopLevel[FullName with Double]
  
}

