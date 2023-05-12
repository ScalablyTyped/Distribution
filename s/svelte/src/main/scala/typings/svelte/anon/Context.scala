package typings.svelte.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  @JSName("$$slots")
  var DollarDollarslots: js.UndefOr[js.Object] = js.undefined
  
  var context: js.UndefOr[Map[Any, Any]] = js.undefined
}
object Context {
  
  inline def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Map[Any, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDollarDollarslots(value: js.Object): Self = StObject.set(x, "$$slots", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarslotsUndefined: Self = StObject.set(x, "$$slots", js.undefined)
  }
}
