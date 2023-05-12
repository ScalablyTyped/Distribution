package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingKlarnaSnake extends StObject {
  
  var source: js.UndefOr[String] = js.undefined
}
object BillingKlarnaSnake {
  
  inline def apply(): BillingKlarnaSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingKlarnaSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingKlarnaSnake] (val x: Self) extends AnyVal {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
