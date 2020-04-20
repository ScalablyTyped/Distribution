package typings.writeFileAtomic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGid extends js.Object {
  var gid: Double
  var uid: Double
}

object AnonGid {
  @scala.inline
  def apply(gid: Double, uid: Double): AnonGid = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGid]
  }
}

