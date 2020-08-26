package typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryProtocol extends js.Object

@JSImport("ts3-nodejs-library/lib/TeamSpeak", "TeamSpeak.QueryProtocol")
@js.native
object QueryProtocol extends js.Object {
  @js.native
  sealed trait RAW extends QueryProtocol
  
  @js.native
  sealed trait SSH extends QueryProtocol
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QueryProtocol with String] = js.native
  /* "raw" */ @js.native
  object RAW extends TopLevel[RAW with String]
  
  /* "ssh" */ @js.native
  object SSH extends TopLevel[SSH with String]
  
}

