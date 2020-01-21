package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildRelease extends js.Object {
  var build: Double
  var release: Double
}

object AnonBuildRelease {
  @scala.inline
  def apply(build: Double, release: Double): AnonBuildRelease = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuildRelease]
  }
}

