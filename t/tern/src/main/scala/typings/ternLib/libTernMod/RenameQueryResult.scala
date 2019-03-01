package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameQueryResult extends js.Object {
  /** Array of changes that must be performed to apply the rename. The client is responsible for doing the actual modification. */
  var changes: js.Array[ternLib.Anon_EndFile]
}

object RenameQueryResult {
  @scala.inline
  def apply(changes: js.Array[ternLib.Anon_EndFile]): RenameQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changes")(changes)
    __obj.asInstanceOf[RenameQueryResult]
  }
}

