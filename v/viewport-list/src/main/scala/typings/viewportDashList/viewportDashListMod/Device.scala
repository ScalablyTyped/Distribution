package typings.viewportDashList.viewportDashListMod

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
    val __obj = js.Dynamic.literal(name = name, os = os, platform = platform, release = release, size = size)
  
    __obj.asInstanceOf[Device]
  }
}

