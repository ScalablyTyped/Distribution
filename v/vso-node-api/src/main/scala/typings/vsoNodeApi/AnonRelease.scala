package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelease extends js.Object {
  var build: Double
  var release: Double
}

object AnonRelease {
  @scala.inline
  def apply(build: Double, release: Double): AnonRelease = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelease]
  }
}

