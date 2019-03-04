package typings
package useragentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Device extends js.Object {
  var device: js.UndefOr[java.lang.String] = js.undefined
  var family: java.lang.String
  var major: java.lang.String
  var minor: java.lang.String
  var os: js.UndefOr[java.lang.String] = js.undefined
  var patch: java.lang.String
}

object Anon_Device {
  @scala.inline
  def apply(
    family: java.lang.String,
    major: java.lang.String,
    minor: java.lang.String,
    patch: java.lang.String,
    device: java.lang.String = null,
    os: java.lang.String = null
  ): Anon_Device = {
    val __obj = js.Dynamic.literal(family = family, major = major, minor = minor, patch = patch)
    if (device != null) __obj.updateDynamic("device")(device)
    if (os != null) __obj.updateDynamic("os")(os)
    __obj.asInstanceOf[Anon_Device]
  }
}

