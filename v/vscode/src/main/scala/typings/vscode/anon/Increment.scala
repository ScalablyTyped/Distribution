package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Increment extends StObject {
  
  var increment: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Increment {
  
  inline def apply(): Increment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Increment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Increment] (val x: Self) extends AnyVal {
    
    inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
