package typings.ts3NodejsLibrary.commandMod.Command

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parsers extends js.Object {
  
  def request(cmd: typings.ts3NodejsLibrary.commandMod.Command): String = js.native
  @JSName("request")
  var request_Original: RequestParser = js.native
  
  def response(data: ParserArgument): Response = js.native
  @JSName("response")
  var response_Original: ResponseParser = js.native
}
