package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokenexpiration extends js.Object {
  var token_expiration: String = js.native
  var token_issued: String = js.native
  var user_token: String = js.native
}

object Tokenexpiration {
  @scala.inline
  def apply(token_expiration: String, token_issued: String, user_token: String): Tokenexpiration = {
    val __obj = js.Dynamic.literal(token_expiration = token_expiration.asInstanceOf[js.Any], token_issued = token_issued.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokenexpiration]
  }
  @scala.inline
  implicit class TokenexpirationOps[Self <: Tokenexpiration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToken_expiration(value: String): Self = this.set("token_expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken_issued(value: String): Self = this.set("token_issued", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_token(value: String): Self = this.set("user_token", value.asInstanceOf[js.Any])
  }
  
}

