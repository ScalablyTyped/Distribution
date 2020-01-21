package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: String
  var description: String
  var fail: String
  var pass: String
}

object AnonConfig {
  @scala.inline
  def apply(config: String, description: String, fail: String, pass: String): AnonConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfig]
  }
}

