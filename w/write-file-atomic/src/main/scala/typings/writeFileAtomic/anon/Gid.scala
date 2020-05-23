package typings.writeFileAtomic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gid extends js.Object {
  var gid: Double
  var uid: Double
}

object Gid {
  @scala.inline
  def apply(gid: Double, uid: Double): Gid = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gid]
  }
}

