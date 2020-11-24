package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "TokenType")
@js.native
object TokenType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
  
  /** channel group token (id1={groupID} id2={channelID}) */
  @js.native
  sealed trait ChannelGroup extends TokenType
  /* 1 */ @js.native
  object ChannelGroup extends TopLevel[ChannelGroup with Double]
  
  /** server group token (id1={groupID} id2=0) */
  @js.native
  sealed trait ServerGroup extends TokenType
  /* 0 */ @js.native
  object ServerGroup extends TopLevel[ServerGroup with Double]
}
