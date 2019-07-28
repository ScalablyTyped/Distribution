package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
    val __obj = js.Dynamic.literal(dailyStats = dailyStats, extensionId = extensionId, extensionName = extensionName, publisherName = publisherName, statCount = statCount)
  
    __obj.asInstanceOf[ExtensionDailyStats]
  }
}

