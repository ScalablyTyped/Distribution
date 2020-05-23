package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  var create: Boolean
  var overwrite: Boolean
}

object Create {
  @scala.inline
  def apply(create: Boolean, overwrite: Boolean): Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
}

