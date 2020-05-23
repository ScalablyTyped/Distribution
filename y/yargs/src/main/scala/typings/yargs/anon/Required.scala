package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Required extends js.Object {
  var required: java.lang.String | `true`
}

object Required {
  @scala.inline
  def apply(required: java.lang.String | `true`): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
}

