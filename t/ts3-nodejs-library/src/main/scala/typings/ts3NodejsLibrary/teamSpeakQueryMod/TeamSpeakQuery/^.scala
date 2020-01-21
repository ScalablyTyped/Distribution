package typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery

import typings.ts3NodejsLibrary.teamSpeakMod.ConnectionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/transport/TeamSpeakQuery", "TeamSpeakQuery")
@js.native
object ^ extends js.Object {
  var IGNORE_LINES_INITIAL: Double = js.native
  /** returns a constructed Socket */
  def getSocket(config: ConnectionParams): QueryProtocolInterface = js.native
}

