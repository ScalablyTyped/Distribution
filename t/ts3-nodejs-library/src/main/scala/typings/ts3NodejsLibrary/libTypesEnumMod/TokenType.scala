package typings.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType & Double] = js.native
  
  /** channel group token (id1={groupID} id2={channelID}) */
  @js.native
  sealed trait ChannelGroup
    extends StObject
       with TokenType
  /* 1 */ val ChannelGroup: typings.ts3NodejsLibrary.libTypesEnumMod.TokenType.ChannelGroup & Double = js.native
  
  /** server group token (id1={groupID} id2=0) */
  @js.native
  sealed trait ServerGroup
    extends StObject
       with TokenType
  /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.libTypesEnumMod.TokenType.ServerGroup & Double = js.native
}
