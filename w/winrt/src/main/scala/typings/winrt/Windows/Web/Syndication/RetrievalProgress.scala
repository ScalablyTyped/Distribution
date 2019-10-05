package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrievalProgress extends js.Object {
  var bytesRetrieved: Double
  var totalBytesToRetrieve: Double
}

object RetrievalProgress {
  @scala.inline
  def apply(bytesRetrieved: Double, totalBytesToRetrieve: Double): RetrievalProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved, totalBytesToRetrieve = totalBytesToRetrieve)
  
    __obj.asInstanceOf[RetrievalProgress]
  }
}

