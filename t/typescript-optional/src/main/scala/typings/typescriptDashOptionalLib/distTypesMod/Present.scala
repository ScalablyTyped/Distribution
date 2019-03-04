package typings
package typescriptDashOptionalLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Present[T] extends Option[T] {
  var kind: typescriptDashOptionalLib.typescriptDashOptionalLibStrings.present
  var value: T
}

object Present {
  @scala.inline
  def apply[T](kind: typescriptDashOptionalLib.typescriptDashOptionalLibStrings.present, value: T): Present[T] = {
    val __obj = js.Dynamic.literal(kind = kind, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Present[T]]
  }
}

