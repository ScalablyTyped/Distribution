package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecursive extends js.Object {
  var recursive: Boolean
}

object AnonRecursive {
  @scala.inline
  def apply(recursive: Boolean): AnonRecursive = {
    val __obj = js.Dynamic.literal(recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecursive]
  }
}

