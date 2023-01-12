package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectResult extends StObject {
  
  var data: DetectData
  
  var jobId: String
}
object DetectResult {
  
  inline def apply(data: DetectData, jobId: String): DetectResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: DetectData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
