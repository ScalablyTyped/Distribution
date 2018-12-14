package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  var extendedStats: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
       * Timestamp of this data point
       */
  var statisticDate: stdLib.Date
  /**
       * Version of the extension
       */
  var version: java.lang.String
}

