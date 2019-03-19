package typings
package viewportDashListLib.viewportDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var name: java.lang.String
  var os: java.lang.String
  var platform: java.lang.String
  var release: java.lang.String
  var size: java.lang.String
}

object Device {
  @scala.inline
  def apply(
    name: java.lang.String,
    os: java.lang.String,
    platform: java.lang.String,
    release: java.lang.String,
    size: java.lang.String
  ): Device = {
    val __obj = js.Dynamic.literal(name = name, os = os, platform = platform, release = release, size = size)
  
    __obj.asInstanceOf[Device]
  }
}

