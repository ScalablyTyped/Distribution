package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportTfvcSource extends js.Object {
  /**
    * Set true to import History, false otherwise
    */
  var importHistory: Boolean
  /**
    * Get history for last n days (max allowed value is 180 days)
    */
  var importHistoryDurationInDays: Double
  /**
    * Path which we want to import (this can be copied from Path Control in Explorer)
    */
  var path: String
}

object GitImportTfvcSource {
  @scala.inline
  def apply(importHistory: Boolean, importHistoryDurationInDays: Double, path: String): GitImportTfvcSource = {
    val __obj = js.Dynamic.literal(importHistory = importHistory.asInstanceOf[js.Any], importHistoryDurationInDays = importHistoryDurationInDays.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportTfvcSource]
  }
}

