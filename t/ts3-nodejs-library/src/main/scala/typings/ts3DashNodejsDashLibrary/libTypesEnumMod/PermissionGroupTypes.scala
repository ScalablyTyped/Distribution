package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

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
  
  /* 2 */ val Channel: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.Channel with Double = js.native
  /* 4 */ val ChannelClient: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.ChannelClient with Double = js.native
  /* 3 */ val ChannelGroup: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.ChannelGroup with Double = js.native
  /* 1 */ val GlobalClient: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.GlobalClient with Double = js.native
  /* 0 */ val ServerGroup: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.PermissionGroupTypes.ServerGroup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionGroupTypes with Double] = js.native
}

