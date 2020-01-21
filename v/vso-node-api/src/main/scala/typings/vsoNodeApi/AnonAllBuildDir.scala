package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllBuildDir extends js.Object {
  var allBuildDir: Double
  var source: Double
  var sourceAndOutputDir: Double
  var sourceDir: Double
}

object AnonAllBuildDir {
  @scala.inline
  def apply(allBuildDir: Double, source: Double, sourceAndOutputDir: Double, sourceDir: Double): AnonAllBuildDir = {
    val __obj = js.Dynamic.literal(allBuildDir = allBuildDir.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceAndOutputDir = sourceAndOutputDir.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllBuildDir]
  }
}

