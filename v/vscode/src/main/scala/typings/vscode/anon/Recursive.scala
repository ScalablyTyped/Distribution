package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recursive extends js.Object {
  var recursive: Boolean
}

object Recursive {
  @scala.inline
  def apply(recursive: Boolean): Recursive = {
    val __obj = js.Dynamic.literal(recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recursive]
  }
}

