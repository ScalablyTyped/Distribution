package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSource extends StObject {
  
  val SourceOrder: Any
}
object TypeofSource {
  
  inline def apply(SourceOrder: Any): TypeofSource = {
    val __obj = js.Dynamic.literal(SourceOrder = SourceOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSource] (val x: Self) extends AnyVal {
    
    inline def setSourceOrder(value: Any): Self = StObject.set(x, "SourceOrder", value.asInstanceOf[js.Any])
  }
}
