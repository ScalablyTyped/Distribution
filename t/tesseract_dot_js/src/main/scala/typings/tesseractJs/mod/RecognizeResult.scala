package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeResult extends StObject {
  
  var data: Page
  
  var jobId: String
}
object RecognizeResult {
  
  inline def apply(data: Page, jobId: String): RecognizeResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizeResult]
  }
  
  extension [Self <: RecognizeResult](x: Self) {
    
    inline def setData(value: Page): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
