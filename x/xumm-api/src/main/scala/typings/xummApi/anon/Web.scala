package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web extends js.Object {
  var app: String | Null
  var web: String | Null
}

object Web {
  @scala.inline
  def apply(app: String = null, web: String = null): Web = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web]
  }
}

