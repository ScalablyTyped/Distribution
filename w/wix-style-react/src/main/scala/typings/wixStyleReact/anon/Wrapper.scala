package typings.wixStyleReact.anon

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wrapper extends StObject {
  
  var element: Any
  
  var wrapper: HTMLDivElement
}
object Wrapper {
  
  inline def apply(element: Any, wrapper: HTMLDivElement): Wrapper = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrapper]
  }
  
  extension [Self <: Wrapper](x: Self) {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: HTMLDivElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
