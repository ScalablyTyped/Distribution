package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttr extends StObject {
  
  def exists(): Boolean
  
  def getAttr(attrName: Any): Any
  
  def getLabel(): Any
  
  def getNumberOfChildren(): Any
  
  def hasInputs(): Boolean
  
  def hasLabel(): Boolean
}
object GetAttr {
  
  inline def apply(
    exists: () => Boolean,
    getAttr: Any => Any,
    getLabel: () => Any,
    getNumberOfChildren: () => Any,
    hasInputs: () => Boolean,
    hasLabel: () => Boolean
  ): GetAttr = {
    val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getAttr = js.Any.fromFunction1(getAttr), getLabel = js.Any.fromFunction0(getLabel), getNumberOfChildren = js.Any.fromFunction0(getNumberOfChildren), hasInputs = js.Any.fromFunction0(hasInputs), hasLabel = js.Any.fromFunction0(hasLabel))
    __obj.asInstanceOf[GetAttr]
  }
  
  extension [Self <: GetAttr](x: Self) {
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetAttr(value: Any => Any): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
    
    inline def setGetLabel(value: () => Any): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    inline def setGetNumberOfChildren(value: () => Any): Self = StObject.set(x, "getNumberOfChildren", js.Any.fromFunction0(value))
    
    inline def setHasInputs(value: () => Boolean): Self = StObject.set(x, "hasInputs", js.Any.fromFunction0(value))
    
    inline def setHasLabel(value: () => Boolean): Self = StObject.set(x, "hasLabel", js.Any.fromFunction0(value))
  }
}
