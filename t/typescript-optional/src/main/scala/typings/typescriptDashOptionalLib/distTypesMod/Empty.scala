package typings
package typescriptDashOptionalLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Empty[T] extends Option[T] {
  var kind: typescriptDashOptionalLib.typescriptDashOptionalLibStrings.empty
}

object Empty {
  @scala.inline
  def apply[T](kind: typescriptDashOptionalLib.typescriptDashOptionalLibStrings.empty): Empty[T] = {
    val __obj = js.Dynamic.literal(kind = kind)
  
    __obj.asInstanceOf[Empty[T]]
  }
}

