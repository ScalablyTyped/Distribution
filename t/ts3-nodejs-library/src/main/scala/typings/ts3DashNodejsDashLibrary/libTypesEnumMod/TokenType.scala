package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenType extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "TokenType")
@js.native
object TokenType extends js.Object {
  /** channel group token (id1={groupID} id2={channelID}) */
  @js.native
  sealed trait ChannelGroup extends TokenType
  
  /** server group token (id1={groupID} id2=0) */
  @js.native
  sealed trait ServerGroup extends TokenType
  
  /* 1 */ val ChannelGroup: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.TokenType.ChannelGroup with Double = js.native
  /* 0 */ val ServerGroup: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.TokenType.ServerGroup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
}

