package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var env: String | Database
}

object InitOptions {
  @scala.inline
  def apply(env: String | Database): InitOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

