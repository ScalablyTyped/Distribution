package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

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
    val __obj = js.Dynamic.literal(build = build, platform = platform, version = version)
  
    __obj.asInstanceOf[Version]
  }
}

