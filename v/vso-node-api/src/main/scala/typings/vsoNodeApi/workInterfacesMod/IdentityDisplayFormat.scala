package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IdentityDisplayFormat extends js.Object
@JSImport("vso-node-api/interfaces/WorkInterfaces", "IdentityDisplayFormat")
@js.native
object IdentityDisplayFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdentityDisplayFormat with Double] = js.native
  
  /**
    * Display Avatar and Full name
    */
  @js.native
  sealed trait AvatarAndFullName extends IdentityDisplayFormat
  /* 2 */ @js.native
  object AvatarAndFullName extends TopLevel[AvatarAndFullName with Double]
  
  /**
    * Display avatar only
    */
  @js.native
  sealed trait AvatarOnly extends IdentityDisplayFormat
  /* 0 */ @js.native
  object AvatarOnly extends TopLevel[AvatarOnly with Double]
  
  /**
    * Display Full name only
    */
  @js.native
  sealed trait FullName extends IdentityDisplayFormat
  /* 1 */ @js.native
  object FullName extends TopLevel[FullName with Double]
}
