package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllBuild extends js.Object {
  var all: scala.Double
  var build: scala.Double
  var release: scala.Double
}

object AllBuild {
  @scala.inline
  def apply(all: scala.Double, build: scala.Double, release: scala.Double): AllBuild = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllBuild]
  }
}

