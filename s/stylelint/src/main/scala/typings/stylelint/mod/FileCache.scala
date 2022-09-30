package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCache extends StObject {
  
  def calcHashOfConfig(config: Config): Unit
  
  def destroy(): Unit
  
  def hasFileChanged(absoluteFilepath: String): Boolean
  
  def reconcile(): Unit
  
  def removeEntry(absoluteFilepath: String): Unit
}
object FileCache {
  
  inline def apply(
    calcHashOfConfig: Config => Unit,
    destroy: () => Unit,
    hasFileChanged: String => Boolean,
    reconcile: () => Unit,
    removeEntry: String => Unit
  ): FileCache = {
    val __obj = js.Dynamic.literal(calcHashOfConfig = js.Any.fromFunction1(calcHashOfConfig), destroy = js.Any.fromFunction0(destroy), hasFileChanged = js.Any.fromFunction1(hasFileChanged), reconcile = js.Any.fromFunction0(reconcile), removeEntry = js.Any.fromFunction1(removeEntry))
    __obj.asInstanceOf[FileCache]
  }
  
  extension [Self <: FileCache](x: Self) {
    
    inline def setCalcHashOfConfig(value: Config => Unit): Self = StObject.set(x, "calcHashOfConfig", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setHasFileChanged(value: String => Boolean): Self = StObject.set(x, "hasFileChanged", js.Any.fromFunction1(value))
    
    inline def setReconcile(value: () => Unit): Self = StObject.set(x, "reconcile", js.Any.fromFunction0(value))
    
    inline def setRemoveEntry(value: String => Unit): Self = StObject.set(x, "removeEntry", js.Any.fromFunction1(value))
  }
}
