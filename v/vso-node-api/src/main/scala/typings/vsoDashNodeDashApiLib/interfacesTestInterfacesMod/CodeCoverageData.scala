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

