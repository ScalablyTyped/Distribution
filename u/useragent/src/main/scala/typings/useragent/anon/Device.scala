package typings.useragent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var device: String
  var family: String
  var major: String
  var minor: String
  var os: String
  var patch: String
}

object Device {
  @scala.inline
  def apply(device: String, family: String, major: String, minor: String, os: String, patch: String): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

