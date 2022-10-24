package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDropdownLayoutDriver extends StObject {
  
  def element(): Any
  
  def exists(): Boolean
  
  def getDropdownLayoutDriver(): Any
}
object GetDropdownLayoutDriver {
  
  inline def apply(element: () => Any, exists: () => Boolean, getDropdownLayoutDriver: () => Any): GetDropdownLayoutDriver = {
    val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getDropdownLayoutDriver = js.Any.fromFunction0(getDropdownLayoutDriver))
    __obj.asInstanceOf[GetDropdownLayoutDriver]
  }
  
  extension [Self <: GetDropdownLayoutDriver](x: Self) {
    
    inline def setElement(value: () => Any): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetDropdownLayoutDriver(value: () => Any): Self = StObject.set(x, "getDropdownLayoutDriver", js.Any.fromFunction0(value))
  }
}
