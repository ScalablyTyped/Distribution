package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPDFResult extends StObject {
  
  var data: js.Array[Double]
  
  var jobId: String
}
object GetPDFResult {
  
  inline def apply(data: js.Array[Double], jobId: String): GetPDFResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPDFResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPDFResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
