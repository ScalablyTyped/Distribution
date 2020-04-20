package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.responseTypesMod.ClientList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenUsed extends js.Object {
  var client: ClientList
  var token: String
  var token1: String
  var token2: String
}

object TokenUsed {
  @scala.inline
  def apply(client: ClientList, token: String, token1: String, token2: String): TokenUsed = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token1 = token1.asInstanceOf[js.Any], token2 = token2.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenUsed]
  }
}

