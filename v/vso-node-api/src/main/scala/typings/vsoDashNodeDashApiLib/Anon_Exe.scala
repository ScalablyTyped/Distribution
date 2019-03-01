package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exe extends js.Object {
  var exe: scala.Double
  var msi: scala.Double
  var referralLink: scala.Double
  var vsix: scala.Double
}

object Anon_Exe {
  @scala.inline
  def apply(exe: scala.Double, msi: scala.Double, referralLink: scala.Double, vsix: scala.Double): Anon_Exe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exe")(exe)
    __obj.updateDynamic("msi")(msi)
    __obj.updateDynamic("referralLink")(referralLink)
    __obj.updateDynamic("vsix")(vsix)
    __obj.asInstanceOf[Anon_Exe]
  }
}

