package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unsubscribe extends StObject {
  
  var unsubscribe: js.Function
}
object Unsubscribe {
  
  inline def apply(unsubscribe: js.Function): Unsubscribe = {
    val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unsubscribe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Unsubscribe] (val x: Self) extends AnyVal {
    
    inline def setUnsubscribe(value: js.Function): Self = StObject.set(x, "unsubscribe", value.asInstanceOf[js.Any])
  }
}
