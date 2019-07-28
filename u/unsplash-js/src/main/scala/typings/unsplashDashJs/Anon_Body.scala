package typings.unsplashDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Object
  var headers: js.Object
  var method: String
  var oauth: Boolean
  var query: js.Object
  var url: String
}

object Anon_Body {
  @scala.inline
  def apply(body: js.Object, headers: js.Object, method: String, oauth: Boolean, query: js.Object, url: String): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, method = method, oauth = oauth, query = query, url = url)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

