package typings.webLocksApi

import typings.webLocksApi.webLocksApiStrings.exclusive
import typings.webLocksApi.webLocksApiStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lock extends js.Object {
  val mode: exclusive | shared
  val name: String
}

object Lock {
  @scala.inline
  def apply(mode: exclusive | shared, name: String): Lock = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lock]
  }
}

