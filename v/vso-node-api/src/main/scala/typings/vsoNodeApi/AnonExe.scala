package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExe extends js.Object {
  var exe: Double
  var msi: Double
  var referralLink: Double
  var vsix: Double
}

object AnonExe {
  @scala.inline
  def apply(exe: Double, msi: Double, referralLink: Double, vsix: Double): AnonExe = {
    val __obj = js.Dynamic.literal(exe = exe.asInstanceOf[js.Any], msi = msi.asInstanceOf[js.Any], referralLink = referralLink.asInstanceOf[js.Any], vsix = vsix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExe]
  }
}

