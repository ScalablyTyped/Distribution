package typings.webLocksApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockManagerSnapshot extends js.Object {
  var held: js.Array[Lock]
  var pending: js.Array[Lock]
}

object LockManagerSnapshot {
  @scala.inline
  def apply(held: js.Array[Lock], pending: js.Array[Lock]): LockManagerSnapshot = {
    val __obj = js.Dynamic.literal(held = held.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockManagerSnapshot]
  }
}

