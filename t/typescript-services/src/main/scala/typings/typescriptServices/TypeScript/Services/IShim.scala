package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShim extends StObject {
  
  def dispose(dummy: js.Any): Unit
}
object IShim {
  
  inline def apply(dispose: js.Any => Unit): IShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose))
    __obj.asInstanceOf[IShim]
  }
  
  extension [Self <: IShim](x: Self) {
    
    inline def setDispose(value: js.Any => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
  }
}
