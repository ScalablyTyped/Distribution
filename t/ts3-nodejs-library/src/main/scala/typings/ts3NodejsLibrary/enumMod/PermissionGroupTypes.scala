package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PermissionGroupTypes extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "PermissionGroupTypes")
@js.native
object PermissionGroupTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionGroupTypes with Double] = js.native
  
  /** channel specific permission */
  @js.native
  sealed trait Channel extends PermissionGroupTypes
  /* 2 */ val Channel: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.Channel with Double = js.native
  
  /** channel-client specific permission */
  @js.native
  sealed trait ChannelClient extends PermissionGroupTypes
  /* 4 */ val ChannelClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelClient with Double = js.native
  
  /** channel group permission */
  @js.native
  sealed trait ChannelGroup extends PermissionGroupTypes
  /* 3 */ val ChannelGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelGroup with Double = js.native
  
  /** client specific permission */
  @js.native
  sealed trait GlobalClient extends PermissionGroupTypes
  /* 1 */ val GlobalClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.GlobalClient with Double = js.native
  
  /** server group permission */
  @js.native
  sealed trait ServerGroup extends PermissionGroupTypes
  /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ServerGroup with Double = js.native
}
