package typings.yargs

import typings.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequire extends js.Object {
  var require: String | `true`
}

object AnonRequire {
  @scala.inline
  def apply(require: String | `true`): AnonRequire = {
    val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequire]
  }
}

