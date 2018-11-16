package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The progress data for an asynchronous photo import operation. */

trait PhotoImportProgress extends js.Object {
  /** The number of bytes that have been imported. */
  var bytesImported: scala.Double
  /** The current import progress, expressed as a floating point value from 0 to 1. */
  var importProgress: scala.Double
  /** The number of items that have been imported. */
  var itemsImported: scala.Double
  /** The total number of bytes to be imported. */
  var totalBytesToImport: scala.Double
  /** The total number of items to be imported. */
  var totalItemsToImport: scala.Double
}

