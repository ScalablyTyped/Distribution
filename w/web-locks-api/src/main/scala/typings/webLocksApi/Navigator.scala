package typings.webLocksApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var locks: LockManager
}

object Navigator {
  @scala.inline
  def apply(locks: LockManager): Navigator = {
    val __obj = js.Dynamic.literal(locks = locks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigator]
  }
}

