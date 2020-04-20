package typings.viewportList.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var name: String
  var os: String
  var platform: String
  var release: String
  var size: String
}

object Device {
  @scala.inline
  def apply(name: String, os: String, platform: String, release: String, size: String): Device = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

