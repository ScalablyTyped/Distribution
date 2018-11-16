package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitImportTfvcSource extends js.Object {
  /**
       * Set true to import History, false otherwise
       */
  var importHistory: scala.Boolean
  /**
       * Get history for last n days (max allowed value is 180 days)
       */
  var importHistoryDurationInDays: scala.Double
  /**
       * Path which we want to import (this can be copied from Path Control in Explorer)
       */
  var path: java.lang.String
}

