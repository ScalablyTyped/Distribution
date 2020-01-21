package typings.yargs

import typings.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequired extends js.Object {
  var required: String | `true`
}

object AnonRequired {
  @scala.inline
  def apply(required: String | `true`): AnonRequired = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequired]
  }
}

