package typings
package tarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gexec extends js.Object {
  var gexec: scala.Double
  var gread: scala.Double
  var gwrite: scala.Double
  var oexec: scala.Double
  var oread: scala.Double
  var owrite: scala.Double
  var sgid: scala.Double
  var suid: scala.Double
  var svtx: scala.Double
  var uexec: scala.Double
  var uread: scala.Double
  var uwrite: scala.Double
}

object Anon_Gexec {
  @scala.inline
  def apply(
    gexec: scala.Double,
    gread: scala.Double,
    gwrite: scala.Double,
    oexec: scala.Double,
    oread: scala.Double,
    owrite: scala.Double,
    sgid: scala.Double,
    suid: scala.Double,
    svtx: scala.Double,
    uexec: scala.Double,
    uread: scala.Double,
    uwrite: scala.Double
  ): Anon_Gexec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gexec")(gexec)
    __obj.updateDynamic("gread")(gread)
    __obj.updateDynamic("gwrite")(gwrite)
    __obj.updateDynamic("oexec")(oexec)
    __obj.updateDynamic("oread")(oread)
    __obj.updateDynamic("owrite")(owrite)
    __obj.updateDynamic("sgid")(sgid)
    __obj.updateDynamic("suid")(suid)
    __obj.updateDynamic("svtx")(svtx)
    __obj.updateDynamic("uexec")(uexec)
    __obj.updateDynamic("uread")(uread)
    __obj.updateDynamic("uwrite")(uwrite)
    __obj.asInstanceOf[Anon_Gexec]
  }
}

