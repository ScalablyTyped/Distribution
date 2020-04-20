package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDailyStat extends js.Object {
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
}

