package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  var create: Boolean
  var overwrite: Boolean
}

object AnonCreate {
  @scala.inline
  def apply(create: Boolean, overwrite: Boolean): AnonCreate = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreate]
  }
}

