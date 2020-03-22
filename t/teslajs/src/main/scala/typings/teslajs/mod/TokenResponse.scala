package typings.teslajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenResponse extends js.Object {
  var authToken: String
  var body: js.Object
  var refreshToken: String
  var response: js.Object
}

object TokenResponse {
  @scala.inline
  def apply(authToken: String, body: js.Object, refreshToken: String, response: js.Object): TokenResponse = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenResponse]
  }
}

