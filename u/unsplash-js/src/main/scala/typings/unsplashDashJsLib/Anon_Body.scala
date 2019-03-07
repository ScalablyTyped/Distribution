package typings
package unsplashDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Object
  var headers: js.Object
  var method: java.lang.String
  var oauth: scala.Boolean
  var query: js.Object
  var url: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(
    body: js.Object,
    headers: js.Object,
    method: java.lang.String,
    oauth: scala.Boolean,
    query: js.Object,
    url: java.lang.String
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, method = method, oauth = oauth, query = query, url = url)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

