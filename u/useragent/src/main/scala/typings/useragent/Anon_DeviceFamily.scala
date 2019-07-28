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
    val __obj = js.Dynamic.literal(family = family, major = major, minor = minor, patch = patch)
    if (device != null) __obj.updateDynamic("device")(device)
    if (os != null) __obj.updateDynamic("os")(os)
    __obj.asInstanceOf[Anon_DeviceFamily]
  }
}

