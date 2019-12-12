package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import org.scalablytyped.runtime.TopLevel
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.Channel
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.ChannelClient
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.ChannelGroup
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.GlobalClient
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.ServerGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PermissionGroupTypes extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "PermissionGroupTypes")
@js.native
object PermissionGroupTypes extends js.Object {
  /** channel specific permission */
  @js.native
  sealed trait Channel extends PermissionGroupTypes
  
  /** channel-client specific permission */
  @js.native
  sealed trait ChannelClient extends PermissionGroupTypes
  
  /** channel group permission */
  @js.native
  sealed trait ChannelGroup extends PermissionGroupTypes
  
  /** client specific permission */
  @js.native
  sealed trait GlobalClient extends PermissionGroupTypes
  
  /** server group permission */
  @js.native
  sealed trait ServerGroup extends PermissionGroupTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionGroupTypes with Double] = js.native
  /* 2 */ @js.native
  object Channel extends TopLevel[Channel with Double]
  
  /* 4 */ @js.native
  object ChannelClient extends TopLevel[ChannelClient with Double]
  
  /* 3 */ @js.native
  object ChannelGroup extends TopLevel[ChannelGroup with Double]
  
  /* 1 */ @js.native
  object GlobalClient extends TopLevel[GlobalClient with Double]
  
  /* 0 */ @js.native
  object ServerGroup extends TopLevel[ServerGroup with Double]
  
}

