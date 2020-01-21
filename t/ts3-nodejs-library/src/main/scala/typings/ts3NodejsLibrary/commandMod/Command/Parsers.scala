package typings.ts3NodejsLibrary.commandMod.Command

import typings.ts3NodejsLibrary.queryResponseMod.QueryResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parsers extends js.Object {
  @JSName("request")
  var request_Original: RequestParser = js.native
  @JSName("response")
  var response_Original: ResponseParser = js.native
  def request(cmd: typings.ts3NodejsLibrary.commandMod.Command): String = js.native
  def response(data: ParserArgument): js.Array[QueryResponse] = js.native
}

