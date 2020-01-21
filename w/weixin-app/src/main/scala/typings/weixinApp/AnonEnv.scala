package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnv extends js.Object {
  var env: String
}

object AnonEnv {
  @scala.inline
  def apply(env: String): AnonEnv = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnv]
  }
}

