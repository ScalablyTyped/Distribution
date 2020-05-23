package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overwrite extends js.Object {
  var overwrite: Boolean
}

object Overwrite {
  @scala.inline
  def apply(overwrite: Boolean): Overwrite = {
    val __obj = js.Dynamic.literal(overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overwrite]
  }
}

