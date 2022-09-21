package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnityLauncher extends StObject {
  
  def addAction(name: String, onActionInvoked: js.Function): Any
  
  def clearCount(): Any
  
  def clearProgress(): Any
  
  def removeAction(name: String): Any
  
  def removeActions(): Any
  
  def setCount(count: Double): Any
  
  def setProgress(progress: Double): Any
  
  def setUrgent(urgent: Boolean): Any
}
object UnityLauncher {
  
  inline def apply(
    addAction: (String, js.Function) => Any,
    clearCount: () => Any,
    clearProgress: () => Any,
    removeAction: String => Any,
    removeActions: () => Any,
    setCount: Double => Any,
    setProgress: Double => Any,
    setUrgent: Boolean => Any
  ): UnityLauncher = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction2(addAction), clearCount = js.Any.fromFunction0(clearCount), clearProgress = js.Any.fromFunction0(clearProgress), removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions), setCount = js.Any.fromFunction1(setCount), setProgress = js.Any.fromFunction1(setProgress), setUrgent = js.Any.fromFunction1(setUrgent))
    __obj.asInstanceOf[UnityLauncher]
  }
  
  extension [Self <: UnityLauncher](x: Self) {
    
    inline def setAddAction(value: (String, js.Function) => Any): Self = StObject.set(x, "addAction", js.Any.fromFunction2(value))
    
    inline def setClearCount(value: () => Any): Self = StObject.set(x, "clearCount", js.Any.fromFunction0(value))
    
    inline def setClearProgress(value: () => Any): Self = StObject.set(x, "clearProgress", js.Any.fromFunction0(value))
    
    inline def setRemoveAction(value: String => Any): Self = StObject.set(x, "removeAction", js.Any.fromFunction1(value))
    
    inline def setRemoveActions(value: () => Any): Self = StObject.set(x, "removeActions", js.Any.fromFunction0(value))
    
    inline def setSetCount(value: Double => Any): Self = StObject.set(x, "setCount", js.Any.fromFunction1(value))
    
    inline def setSetProgress(value: Double => Any): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
    
    inline def setSetUrgent(value: Boolean => Any): Self = StObject.set(x, "setUrgent", js.Any.fromFunction1(value))
  }
}
