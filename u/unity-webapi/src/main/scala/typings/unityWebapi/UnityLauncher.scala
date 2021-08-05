package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnityLauncher extends StObject {
  
  def addAction(name: String, onActionInvoked: js.Function): js.Any
  
  def clearCount(): js.Any
  
  def clearProgress(): js.Any
  
  def removeAction(name: String): js.Any
  
  def removeActions(): js.Any
  
  def setCount(count: Double): js.Any
  
  def setProgress(progress: Double): js.Any
  
  def setUrgent(urgent: Boolean): js.Any
}
object UnityLauncher {
  
  inline def apply(
    addAction: (String, js.Function) => js.Any,
    clearCount: () => js.Any,
    clearProgress: () => js.Any,
    removeAction: String => js.Any,
    removeActions: () => js.Any,
    setCount: Double => js.Any,
    setProgress: Double => js.Any,
    setUrgent: Boolean => js.Any
  ): UnityLauncher = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction2(addAction), clearCount = js.Any.fromFunction0(clearCount), clearProgress = js.Any.fromFunction0(clearProgress), removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions), setCount = js.Any.fromFunction1(setCount), setProgress = js.Any.fromFunction1(setProgress), setUrgent = js.Any.fromFunction1(setUrgent))
    __obj.asInstanceOf[UnityLauncher]
  }
  
  extension [Self <: UnityLauncher](x: Self) {
    
    inline def setAddAction(value: (String, js.Function) => js.Any): Self = StObject.set(x, "addAction", js.Any.fromFunction2(value))
    
    inline def setClearCount(value: () => js.Any): Self = StObject.set(x, "clearCount", js.Any.fromFunction0(value))
    
    inline def setClearProgress(value: () => js.Any): Self = StObject.set(x, "clearProgress", js.Any.fromFunction0(value))
    
    inline def setRemoveAction(value: String => js.Any): Self = StObject.set(x, "removeAction", js.Any.fromFunction1(value))
    
    inline def setRemoveActions(value: () => js.Any): Self = StObject.set(x, "removeActions", js.Any.fromFunction0(value))
    
    inline def setSetCount(value: Double => js.Any): Self = StObject.set(x, "setCount", js.Any.fromFunction1(value))
    
    inline def setSetProgress(value: Double => js.Any): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
    
    inline def setSetUrgent(value: Boolean => js.Any): Self = StObject.set(x, "setUrgent", js.Any.fromFunction1(value))
  }
}
