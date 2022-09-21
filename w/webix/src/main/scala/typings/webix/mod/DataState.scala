package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataState extends StObject {
  
  def getState(): Any
  
  def setState(state: Any): Unit
}
object DataState {
  
  @JSImport("webix", "DataState")
  @js.native
  val ^ : DataState = js.native
  
  extension [Self <: DataState](x: Self) {
    
    inline def setGetState(value: () => Any): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSetState(value: Any => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
  }
}
