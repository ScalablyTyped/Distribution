package typings
package writeDashFileDashAtomicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gid extends js.Object {
  var gid: scala.Double
  var uid: scala.Double
}

object Anon_Gid {
  @scala.inline
  def apply(gid: scala.Double, uid: scala.Double): Anon_Gid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[Anon_Gid]
  }
}

