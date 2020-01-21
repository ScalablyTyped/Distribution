package typings.winrtUwp.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains progress information for a data retrieval operation. */
trait RetrievalProgress extends js.Object {
  /** The number of bytes that have been received in this data retrieval operation. */
  var bytesRetrieved: Double
  /** The total number of bytes to be received during this data retrieval operation. */
  var totalBytesToRetrieve: Double
}

object RetrievalProgress {
  @scala.inline
  def apply(bytesRetrieved: Double, totalBytesToRetrieve: Double): RetrievalProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved.asInstanceOf[js.Any], totalBytesToRetrieve = totalBytesToRetrieve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetrievalProgress]
  }
}

