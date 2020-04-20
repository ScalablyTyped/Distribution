package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOperation extends js.Object {
  var kind: String
}

object ResourceOperation {
  @scala.inline
  def apply(kind: String): ResourceOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOperation]
  }
}

