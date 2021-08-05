package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrievalProgress extends StObject {
  
  var bytesRetrieved: Double
  
  var totalBytesToRetrieve: Double
}
object RetrievalProgress {
  
  inline def apply(bytesRetrieved: Double, totalBytesToRetrieve: Double): RetrievalProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved.asInstanceOf[js.Any], totalBytesToRetrieve = totalBytesToRetrieve.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrievalProgress]
  }
  
  extension [Self <: RetrievalProgress](x: Self) {
    
    inline def setBytesRetrieved(value: Double): Self = StObject.set(x, "bytesRetrieved", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesToRetrieve(value: Double): Self = StObject.set(x, "totalBytesToRetrieve", value.asInstanceOf[js.Any])
  }
}
