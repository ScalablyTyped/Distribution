package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllBuild extends js.Object {
  var all: scala.Double
  var build: scala.Double
  var release: scala.Double
}

object Anon_AllBuild {
  @scala.inline
  def apply(all: scala.Double, build: scala.Double, release: scala.Double): Anon_AllBuild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[Anon_AllBuild]
  }
}

