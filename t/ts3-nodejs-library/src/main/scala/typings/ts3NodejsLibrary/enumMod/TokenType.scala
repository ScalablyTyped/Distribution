package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
  
  /** channel group token (id1={groupID} id2={channelID}) */
  @js.native
  sealed trait ChannelGroup extends TokenType
  /* 1 */ val ChannelGroup: typings.ts3NodejsLibrary.enumMod.TokenType.ChannelGroup with Double = js.native
  
  /** server group token (id1={groupID} id2=0) */
  @js.native
  sealed trait ServerGroup extends TokenType
  /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.enumMod.TokenType.ServerGroup with Double = js.native
}
