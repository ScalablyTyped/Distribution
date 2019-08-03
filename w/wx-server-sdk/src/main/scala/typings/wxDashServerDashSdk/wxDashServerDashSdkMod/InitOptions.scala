package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import typings.wxDashServerDashSdk.Anon_Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var env: String | Anon_Database
}

object InitOptions {
  @scala.inline
  def apply(env: String | Anon_Database): InitOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InitOptions]
  }
}

