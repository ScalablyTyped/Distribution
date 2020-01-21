package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
  /* 1 */ @js.native
  object ChannelGroup extends TopLevel[ChannelGroup with Double]
  
  /* 0 */ @js.native
  object ServerGroup extends TopLevel[ServerGroup with Double]
  
}

