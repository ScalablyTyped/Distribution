package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigResult extends StObject {
  
  var data: Any
  
  var jobId: String
}
object ConfigResult {
  
  inline def apply(data: Any, jobId: String): ConfigResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
