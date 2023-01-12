package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataState extends StObject {
  
  def getState(): obj
  
  def setState(state: obj): Unit
}
object DataState {
  
  @JSImport("webix", "DataState")
  @js.native
  val ^ : DataState = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataState] (val x: Self) extends AnyVal {
    
    inline def setGetState(value: () => obj): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSetState(value: obj => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
  }
}
