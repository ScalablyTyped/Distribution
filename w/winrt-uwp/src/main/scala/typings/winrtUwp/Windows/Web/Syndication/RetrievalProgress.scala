package typings.winrtUwp.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains progress information for a data retrieval operation. */
trait RetrievalProgress extends StObject {
  
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
  
  @scala.inline
  implicit class RetrievalProgressMutableBuilder[Self <: RetrievalProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesRetrieved(value: Double): Self = StObject.set(x, "bytesRetrieved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToRetrieve(value: Double): Self = StObject.set(x, "totalBytesToRetrieve", value.asInstanceOf[js.Any])
  }
}
