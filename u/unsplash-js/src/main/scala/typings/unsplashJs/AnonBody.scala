package typings.unsplashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.Object
  var headers: js.Object
  var method: String
  var oauth: Boolean
  var query: js.Object
  var url: String
}

object AnonBody {
  @scala.inline
  def apply(body: js.Object, headers: js.Object, method: String, oauth: Boolean, query: js.Object, url: String): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], oauth = oauth.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

