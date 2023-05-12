package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSessionCreateParams extends StObject {
  
  val FlowData: TypeofFlowData
}
object TypeofSessionCreateParams {
  
  inline def apply(FlowData: TypeofFlowData): TypeofSessionCreateParams = {
    val __obj = js.Dynamic.literal(FlowData = FlowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSessionCreateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSessionCreateParams] (val x: Self) extends AnyVal {
    
    inline def setFlowData(value: TypeofFlowData): Self = StObject.set(x, "FlowData", value.asInstanceOf[js.Any])
  }
}
