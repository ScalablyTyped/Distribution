package typings.tern.ternMod

import typings.tern.AnonEndFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameQueryResult extends js.Object {
  /** Array of changes that must be performed to apply the rename. The client is responsible for doing the actual modification. */
  var changes: js.Array[AnonEndFile]
}

object RenameQueryResult {
  @scala.inline
  def apply(changes: js.Array[AnonEndFile]): RenameQueryResult = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenameQueryResult]
  }
}

