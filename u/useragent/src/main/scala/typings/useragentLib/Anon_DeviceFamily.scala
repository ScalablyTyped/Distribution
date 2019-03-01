package typings
package useragentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceFamily extends js.Object {
  var device: java.lang.String
  var family: java.lang.String
  var major: java.lang.String
  var minor: java.lang.String
  var os: java.lang.String
  var patch: java.lang.String
}

object Anon_DeviceFamily {
  @scala.inline
  def apply(
    device: java.lang.String,
    family: java.lang.String,
    major: java.lang.String,
    minor: java.lang.String,
    os: java.lang.String,
    patch: java.lang.String
  ): Anon_DeviceFamily = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("family")(family)
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[Anon_DeviceFamily]
  }
}

