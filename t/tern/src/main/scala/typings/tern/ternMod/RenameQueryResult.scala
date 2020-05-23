package typings.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameQueryResult extends js.Object {
  /** Array of changes that must be performed to apply the rename. The client is responsible for doing the actual modification. */
  var changes: js.Array[typings.tern.anon.File]
}

object RenameQueryResult {
  @scala.inline
  def apply(changes: js.Array[typings.tern.anon.File]): RenameQueryResult = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameQueryResult]
  }
}

