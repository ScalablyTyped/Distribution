package typings.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTokenexpiration extends js.Object {
  var token_expiration: String
  var token_issued: String
  var user_token: String
}

object AnonTokenexpiration {
  @scala.inline
  def apply(token_expiration: String, token_issued: String, user_token: String): AnonTokenexpiration = {
    val __obj = js.Dynamic.literal(token_expiration = token_expiration.asInstanceOf[js.Any], token_issued = token_issued.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTokenexpiration]
  }
}

