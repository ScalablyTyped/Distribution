package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextHelper extends StObject {
  
  def attachTo(view: obj): Unit
  
  def getContext(): obj
  
  def setContext(context: obj): Unit
}
object ContextHelper {
  
  @JSImport("webix", "ContextHelper")
  @js.native
  val ^ : ContextHelper = js.native
  
  extension [Self <: ContextHelper](x: Self) {
    
    inline def setAttachTo(value: obj => Unit): Self = StObject.set(x, "attachTo", js.Any.fromFunction1(value))
    
    inline def setGetContext(value: () => obj): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    inline def setSetContext(value: obj => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
  }
}
