package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReportRunCreatePara extends StObject {
  
  val Parameters: Any
}
object TypeofReportRunCreatePara {
  
  inline def apply(Parameters: Any): TypeofReportRunCreatePara = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReportRunCreatePara]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofReportRunCreatePara] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Any): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
