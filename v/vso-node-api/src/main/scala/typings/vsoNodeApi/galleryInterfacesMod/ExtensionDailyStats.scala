package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDailyStats extends StObject {
  
  /**
    * List of extension statistics data points
    */
  var dailyStats: js.Array[ExtensionDailyStat]
  
  /**
    * Id of the extension, this will never be sent back to the client. For internal use only.
    */
  var extensionId: String
  
  /**
    * Name of the extension
    */
  var extensionName: String
  
  /**
    * Name of the publisher
    */
  var publisherName: String
  
  /**
    * Count of stats
    */
  var statCount: Double
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
  implicit class ExtensionDailyStatsMutableBuilder[Self <: ExtensionDailyStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyStats(value: js.Array[ExtensionDailyStat]): Self = StObject.set(x, "dailyStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyStatsVarargs(value: ExtensionDailyStat*): Self = StObject.set(x, "dailyStats", js.Array(value :_*))
    
    @scala.inline
    def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatCount(value: Double): Self = StObject.set(x, "statCount", value.asInstanceOf[js.Any])
  }
}
