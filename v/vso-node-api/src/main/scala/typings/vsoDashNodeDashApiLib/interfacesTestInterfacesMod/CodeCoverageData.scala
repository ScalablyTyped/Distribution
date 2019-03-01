package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeCoverageData extends js.Object {
  /**
    * Flavor of build for which data is retrieved/published
    */
  var buildFlavor: java.lang.String
  /**
    * Platform of build for which data is retrieved/published
    */
  var buildPlatform: java.lang.String
  /**
    * List of coverage data for the build
    */
  var coverageStats: js.Array[CodeCoverageStatistics]
}

object CodeCoverageData {
  @scala.inline
  def apply(
    buildFlavor: java.lang.String,
    buildPlatform: java.lang.String,
    coverageStats: js.Array[CodeCoverageStatistics]
  ): CodeCoverageData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildFlavor")(buildFlavor)
    __obj.updateDynamic("buildPlatform")(buildPlatform)
    __obj.updateDynamic("coverageStats")(coverageStats)
    __obj.asInstanceOf[CodeCoverageData]
  }
}

