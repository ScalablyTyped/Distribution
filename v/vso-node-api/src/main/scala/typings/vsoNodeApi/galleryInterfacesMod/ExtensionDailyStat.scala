package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDailyStat extends StObject {
  
  /**
    * Stores the event counts
    */
  var counts: EventCounts
  
  /**
    * Generic key/value pair to store extended statistics. Used for sending paid extension stats like Upgrade, Downgrade, Cancel trend etc.
    */
  var extendedStats: StringDictionary[js.Any]
  
  /**
    * Timestamp of this data point
    */
  var statisticDate: Date
  
  /**
    * Version of the extension
    */
  var version: String
}
object ExtensionDailyStat {
  
  @scala.inline
  def apply(counts: EventCounts, extendedStats: StringDictionary[js.Any], statisticDate: Date, version: String): ExtensionDailyStat = {
    val __obj = js.Dynamic.literal(counts = counts.asInstanceOf[js.Any], extendedStats = extendedStats.asInstanceOf[js.Any], statisticDate = statisticDate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDailyStat]
  }
  
  @scala.inline
  implicit class ExtensionDailyStatMutableBuilder[Self <: ExtensionDailyStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounts(value: EventCounts): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStats(value: StringDictionary[js.Any]): Self = StObject.set(x, "extendedStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticDate(value: Date): Self = StObject.set(x, "statisticDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
