package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataState extends StObject {
  
  def getState(): obj
  
  def setState(state: obj): Unit
}
object DataState {
  
  inline def apply(getState: () => obj, setState: obj => Unit): DataState = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[DataState]
  }
  
  extension [Self <: DataState](x: Self) {
    
    inline def setGetState(value: () => obj): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSetState(value: obj => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
  }
}
