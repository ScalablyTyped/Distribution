package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends js.Object {
  var add: Double
  var all: Double
  var branch: Double
  var delete: Double
  var edit: Double
  var encoding: Double
  var lock: Double
  var merge: Double
  var none: Double
  var property: Double
  var rename: Double
  var rollback: Double
  var sourceRename: Double
  var targetRename: Double
  var undelete: Double
}

object AnonEncoding {
  @scala.inline
  def apply(
    add: Double,
    all: Double,
    branch: Double,
    delete: Double,
    edit: Double,
    encoding: Double,
    lock: Double,
    merge: Double,
    none: Double,
    property: Double,
    rename: Double,
    rollback: Double,
    sourceRename: Double,
    targetRename: Double,
    undelete: Double
  ): AnonEncoding = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any], sourceRename = sourceRename.asInstanceOf[js.Any], targetRename = targetRename.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncoding]
  }
}

