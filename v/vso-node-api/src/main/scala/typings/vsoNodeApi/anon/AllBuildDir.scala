package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllBuildDir extends js.Object {
  var allBuildDir: scala.Double
  var source: scala.Double
  var sourceAndOutputDir: scala.Double
  var sourceDir: scala.Double
}

object AllBuildDir {
  @scala.inline
  def apply(
    allBuildDir: scala.Double,
    source: scala.Double,
    sourceAndOutputDir: scala.Double,
    sourceDir: scala.Double
  ): AllBuildDir = {
    val __obj = js.Dynamic.literal(allBuildDir = allBuildDir.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceAndOutputDir = sourceAndOutputDir.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllBuildDir]
  }
}

