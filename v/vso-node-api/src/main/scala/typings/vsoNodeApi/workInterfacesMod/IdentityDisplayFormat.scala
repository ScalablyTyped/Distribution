package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IdentityDisplayFormat extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "IdentityDisplayFormat")
@js.native
object IdentityDisplayFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdentityDisplayFormat with Double] = js.native
  
  /**
    * Display Avatar and Full name
    */
  @js.native
  sealed trait AvatarAndFullName extends IdentityDisplayFormat
  /* 2 */ val AvatarAndFullName: typings.vsoNodeApi.workInterfacesMod.IdentityDisplayFormat.AvatarAndFullName with Double = js.native
  
  /**
    * Display avatar only
    */
  @js.native
  sealed trait AvatarOnly extends IdentityDisplayFormat
  /* 0 */ val AvatarOnly: typings.vsoNodeApi.workInterfacesMod.IdentityDisplayFormat.AvatarOnly with Double = js.native
  
  /**
    * Display Full name only
    */
  @js.native
  sealed trait FullName extends IdentityDisplayFormat
  /* 1 */ val FullName: typings.vsoNodeApi.workInterfacesMod.IdentityDisplayFormat.FullName with Double = js.native
}
