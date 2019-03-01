package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllBuildDir extends js.Object {
  var allBuildDir: scala.Double
  var source: scala.Double
  var sourceAndOutputDir: scala.Double
  var sourceDir: scala.Double
}

object Anon_AllBuildDir {
  @scala.inline
  def apply(
    allBuildDir: scala.Double,
    source: scala.Double,
    sourceAndOutputDir: scala.Double,
    sourceDir: scala.Double
  ): Anon_AllBuildDir = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allBuildDir")(allBuildDir)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("sourceAndOutputDir")(sourceAndOutputDir)
    __obj.updateDynamic("sourceDir")(sourceDir)
    __obj.asInstanceOf[Anon_AllBuildDir]
  }
}

