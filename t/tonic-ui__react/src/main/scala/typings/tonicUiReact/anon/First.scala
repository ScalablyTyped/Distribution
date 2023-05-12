package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait First extends StObject {
  
  var first: js.UndefOr[Boolean] = js.undefined
  
  var last: js.UndefOr[Boolean] = js.undefined
  
  var next: js.UndefOr[Boolean] = js.undefined
  
  var previous: js.UndefOr[Boolean] = js.undefined
}
object First {
  
  inline def apply(): First = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[First]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: First] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
