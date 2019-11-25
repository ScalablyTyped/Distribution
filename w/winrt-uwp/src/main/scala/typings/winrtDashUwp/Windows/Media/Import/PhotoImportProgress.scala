package typings.winrtDashUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The progress data for an asynchronous photo import operation. */
trait PhotoImportProgress extends js.Object {
  /** The number of bytes that have been imported. */
  var bytesImported: Double
  /** The current import progress, expressed as a floating point value from 0 to 1. */
  var importProgress: Double
  /** The number of items that have been imported. */
  var itemsImported: Double
  /** The total number of bytes to be imported. */
  var totalBytesToImport: Double
  /** The total number of items to be imported. */
  var totalItemsToImport: Double
}

object PhotoImportProgress {
  @scala.inline
  def apply(
    bytesImported: Double,
    importProgress: Double,
    itemsImported: Double,
    totalBytesToImport: Double,
    totalItemsToImport: Double
  ): PhotoImportProgress = {
    val __obj = js.Dynamic.literal(bytesImported = bytesImported.asInstanceOf[js.Any], importProgress = importProgress.asInstanceOf[js.Any], itemsImported = itemsImported.asInstanceOf[js.Any], totalBytesToImport = totalBytesToImport.asInstanceOf[js.Any], totalItemsToImport = totalItemsToImport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhotoImportProgress]
  }
}

