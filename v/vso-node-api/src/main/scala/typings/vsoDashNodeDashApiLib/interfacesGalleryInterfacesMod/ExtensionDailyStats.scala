package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDailyStats extends js.Object {
  /**
    * List of extension statistics data points
    */
  var dailyStats: js.Array[ExtensionDailyStat]
  /**
    * Id of the extension, this will never be sent back to the client. For internal use only.
    */
  var extensionId: java.lang.String
  /**
    * Name of the extension
    */
  var extensionName: java.lang.String
  /**
    * Name of the publisher
    */
  var publisherName: java.lang.String
  /**
    * Count of stats
    */
  var statCount: scala.Double
}

object ExtensionDailyStats {
  @scala.inline
  def apply(
    dailyStats: js.Array[ExtensionDailyStat],
    extensionId: java.lang.String,
    extensionName: java.lang.String,
    publisherName: java.lang.String,
    statCount: scala.Double
  ): ExtensionDailyStats = {
    val __obj = js.Dynamic.literal(dailyStats = dailyStats, extensionId = extensionId, extensionName = extensionName, publisherName = publisherName, statCount = statCount)
  
    __obj.asInstanceOf[ExtensionDailyStats]
  }
}

