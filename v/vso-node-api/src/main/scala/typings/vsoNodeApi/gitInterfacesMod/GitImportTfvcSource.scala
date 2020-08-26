package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitImportTfvcSource extends js.Object {
  /**
    * Set true to import History, false otherwise
    */
  var importHistory: Boolean = js.native
  /**
    * Get history for last n days (max allowed value is 180 days)
    */
  var importHistoryDurationInDays: Double = js.native
  /**
    * Path which we want to import (this can be copied from Path Control in Explorer)
    */
  var path: String = js.native
}

object GitImportTfvcSource {
  @scala.inline
  def apply(importHistory: Boolean, importHistoryDurationInDays: Double, path: String): GitImportTfvcSource = {
    val __obj = js.Dynamic.literal(importHistory = importHistory.asInstanceOf[js.Any], importHistoryDurationInDays = importHistoryDurationInDays.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportTfvcSource]
  }
  @scala.inline
  implicit class GitImportTfvcSourceOps[Self <: GitImportTfvcSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImportHistory(value: Boolean): Self = this.set("importHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportHistoryDurationInDays(value: Double): Self = this.set("importHistoryDurationInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

