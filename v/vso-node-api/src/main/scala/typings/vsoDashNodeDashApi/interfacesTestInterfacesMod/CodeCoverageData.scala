package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeCoverageData extends js.Object {
  /**
    * Flavor of build for which data is retrieved/published
    */
  var buildFlavor: String
  /**
    * Platform of build for which data is retrieved/published
    */
  var buildPlatform: String
  /**
    * List of coverage data for the build
    */
  var coverageStats: js.Array[CodeCoverageStatistics]
}

object CodeCoverageData {
  @scala.inline
  def apply(buildFlavor: String, buildPlatform: String, coverageStats: js.Array[CodeCoverageStatistics]): CodeCoverageData = {
    val __obj = js.Dynamic.literal(buildFlavor = buildFlavor.asInstanceOf[js.Any], buildPlatform = buildPlatform.asInstanceOf[js.Any], coverageStats = coverageStats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeCoverageData]
  }
}

