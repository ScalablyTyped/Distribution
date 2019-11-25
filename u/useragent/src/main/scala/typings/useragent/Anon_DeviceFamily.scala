package typings.useragent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceFamily extends js.Object {
  var device: js.UndefOr[String] = js.undefined
  var family: String
  var major: String
  var minor: String
  var os: js.UndefOr[String] = js.undefined
  var patch: String
}

object Anon_DeviceFamily {
  @scala.inline
  def apply(
    family: String,
    major: String,
    minor: String,
    patch: String,
    device: String = null,
    os: String = null
  ): Anon_DeviceFamily = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceFamily]
  }
}

