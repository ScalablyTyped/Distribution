package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var config: String
  var description: String
  var fail: String
  var pass: String
}

object Description {
  @scala.inline
  def apply(config: String, description: String, fail: String, pass: String): Description = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

