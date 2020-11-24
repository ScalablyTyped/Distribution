package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionDailyStats extends js.Object {
  
  /**
    * List of extension statistics data points
    */
  var dailyStats: js.Array[ExtensionDailyStat] = js.native
  
  /**
    * Id of the extension, this will never be sent back to the client. For internal use only.
    */
  var extensionId: String = js.native
  
  /**
    * Name of the extension
    */
  var extensionName: String = js.native
  
  /**
    * Name of the publisher
    */
  var publisherName: String = js.native
  
  /**
    * Count of stats
    */
  var statCount: Double = js.native
}
object ExtensionDailyStats {
  
  @scala.inline
  def apply(
    dailyStats: js.Array[ExtensionDailyStat],
    extensionId: String,
    extensionName: String,
    publisherName: String,
    statCount: Double
  ): ExtensionDailyStats = {
    val __obj = js.Dynamic.literal(dailyStats = dailyStats.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], statCount = statCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDailyStats]
  }
  
  @scala.inline
  implicit class ExtensionDailyStatsOps[Self <: ExtensionDailyStats] (val x: Self) extends AnyVal {
    
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
    def setDailyStatsVarargs(value: ExtensionDailyStat*): Self = this.set("dailyStats", js.Array(value :_*))
    
    @scala.inline
    def setDailyStats(value: js.Array[ExtensionDailyStat]): Self = this.set("dailyStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionId(value: String): Self = this.set("extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = this.set("extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatCount(value: Double): Self = this.set("statCount", value.asInstanceOf[js.Any])
  }
}
