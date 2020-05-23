package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exe extends js.Object {
  var exe: scala.Double
  var msi: scala.Double
  var referralLink: scala.Double
  var vsix: scala.Double
}

object Exe {
  @scala.inline
  def apply(exe: scala.Double, msi: scala.Double, referralLink: scala.Double, vsix: scala.Double): Exe = {
    val __obj = js.Dynamic.literal(exe = exe.asInstanceOf[js.Any], msi = msi.asInstanceOf[js.Any], referralLink = referralLink.asInstanceOf[js.Any], vsix = vsix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exe]
  }
}

