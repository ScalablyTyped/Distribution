package typings.ts3DashNodejsDashLibrary.libTypesEventsMod

import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientList
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
    val __obj = js.Dynamic.literal(client = client, token = token, token1 = token1, token2 = token2)
  
    __obj.asInstanceOf[TokenUsed]
  }
}

