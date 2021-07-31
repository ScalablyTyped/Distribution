package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataState extends StObject {
  
  def getState(): js.Any
  
  def setState(state: js.Any): Unit
}
object DataState {
  
  @JSImport("webix", "DataState")
  @js.native
  val ^ : DataState = js.native
  
  @scala.inline
  implicit class DataStateMutableBuilder[Self <: DataState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetState(value: () => js.Any): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetState(value: js.Any => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
  }
}
