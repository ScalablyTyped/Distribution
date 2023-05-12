package typings.tonicUiReact.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  var next: Element
  
  var previous: Element
}
object Next {
  
  inline def apply(next: Element, previous: Element): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
    
    inline def setNext(value: Element): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: Element): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
