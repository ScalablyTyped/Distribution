package typings.wxServerSdk.mod

import typings.wxServerSdk.AnonDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var env: String | AnonDatabase
}

object InitOptions {
  @scala.inline
  def apply(env: String | AnonDatabase): InitOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

