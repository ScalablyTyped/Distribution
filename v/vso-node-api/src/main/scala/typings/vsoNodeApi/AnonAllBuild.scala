package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllBuild extends js.Object {
  var all: Double
  var build: Double
  var release: Double
}

object AnonAllBuild {
  @scala.inline
  def apply(all: Double, build: Double, release: Double): AnonAllBuild = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllBuild]
  }
}

