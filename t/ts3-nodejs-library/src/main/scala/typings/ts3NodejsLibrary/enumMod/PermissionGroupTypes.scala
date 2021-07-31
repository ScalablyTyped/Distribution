package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PermissionGroupTypes extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "PermissionGroupTypes")
@js.native
object PermissionGroupTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionGroupTypes & Double] = js.native
  
  /** channel specific permission */
  @js.native
  sealed trait Channel
    extends StObject
       with PermissionGroupTypes
  /* 2 */ val Channel: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.Channel & Double = js.native
  
  /** channel-client specific permission */
  @js.native
  sealed trait ChannelClient
    extends StObject
       with PermissionGroupTypes
  /* 4 */ val ChannelClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelClient & Double = js.native
  
  /** channel group permission */
  @js.native
  sealed trait ChannelGroup
    extends StObject
       with PermissionGroupTypes
  /* 3 */ val ChannelGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelGroup & Double = js.native
  
  /** client specific permission */
  @js.native
  sealed trait GlobalClient
    extends StObject
       with PermissionGroupTypes
  /* 1 */ val GlobalClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.GlobalClient & Double = js.native
  
  /** server group permission */
  @js.native
  sealed trait ServerGroup
    extends StObject
       with PermissionGroupTypes
  /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ServerGroup & Double = js.native
}
