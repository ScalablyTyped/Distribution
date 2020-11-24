package typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryProtocol extends js.Object
@JSImport("ts3-nodejs-library/lib/TeamSpeak", "TeamSpeak.QueryProtocol")
@js.native
object QueryProtocol extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QueryProtocol with String] = js.native
  
  @js.native
  sealed trait RAW extends QueryProtocol
  /* "raw" */ @js.native
  object RAW extends TopLevel[RAW with String]
  
  @js.native
  sealed trait SSH extends QueryProtocol
  /* "ssh" */ @js.native
  object SSH extends TopLevel[SSH with String]
}
