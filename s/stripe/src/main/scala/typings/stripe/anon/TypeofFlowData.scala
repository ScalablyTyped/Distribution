package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFlowData extends StObject {
  
  val AfterCompletion: Any
}
object TypeofFlowData {
  
  inline def apply(AfterCompletion: Any): TypeofFlowData = {
    val __obj = js.Dynamic.literal(AfterCompletion = AfterCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFlowData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFlowData] (val x: Self) extends AnyVal {
    
    inline def setAfterCompletion(value: Any): Self = StObject.set(x, "AfterCompletion", value.asInstanceOf[js.Any])
  }
}
