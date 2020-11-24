package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PermissionGroupTypes extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "PermissionGroupTypes")
@js.native
object PermissionGroupTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionGroupTypes with Double] = js.native
  
  /** channel specific permission */
  @js.native
  sealed trait Channel extends PermissionGroupTypes
  /* 2 */ @js.native
  object Channel extends TopLevel[Channel with Double]
  
  /** channel-client specific permission */
  @js.native
  sealed trait ChannelClient extends PermissionGroupTypes
  /* 4 */ @js.native
  object ChannelClient extends TopLevel[ChannelClient with Double]
  
  /** channel group permission */
  @js.native
  sealed trait ChannelGroup extends PermissionGroupTypes
  /* 3 */ @js.native
  object ChannelGroup extends TopLevel[ChannelGroup with Double]
  
  /** client specific permission */
  @js.native
  sealed trait GlobalClient extends PermissionGroupTypes
  /* 1 */ @js.native
  object GlobalClient extends TopLevel[GlobalClient with Double]
  
  /** server group permission */
  @js.native
  sealed trait ServerGroup extends PermissionGroupTypes
  /* 0 */ @js.native
  object ServerGroup extends TopLevel[ServerGroup with Double]
}
