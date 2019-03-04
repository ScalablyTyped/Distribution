package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrievalProgress extends js.Object {
  var bytesRetrieved: scala.Double
  var totalBytesToRetrieve: scala.Double
}

object RetrievalProgress {
  @scala.inline
  def apply(bytesRetrieved: scala.Double, totalBytesToRetrieve: scala.Double): RetrievalProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved, totalBytesToRetrieve = totalBytesToRetrieve)
  
    __obj.asInstanceOf[RetrievalProgress]
  }
}

