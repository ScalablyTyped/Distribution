package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var build: Double
  var platform: String
  var version: String
}

object Version {
  @scala.inline
  def apply(build: Double, platform: String, version: String): Version = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Version]
  }
}

