package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextHelper extends StObject {
  
  def attachTo(view: js.Any): Unit = js.native
  
  def getContext(): js.Any = js.native
  
  def setContext(context: js.Any): Unit = js.native
}
object ContextHelper {
  
  @JSImport("webix", "ContextHelper")
  @js.native
  val ^ : ContextHelper = js.native
  
  @scala.inline
  implicit class ContextHelperMutableBuilder[Self <: ContextHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachTo(value: js.Any => Unit): Self = StObject.set(x, "attachTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContext(value: () => js.Any): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetContext(value: js.Any => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
  }
}
