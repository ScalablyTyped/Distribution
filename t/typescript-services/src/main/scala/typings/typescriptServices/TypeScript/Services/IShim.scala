package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShim extends StObject {
  
  def dispose(dummy: Any): Unit
}
object IShim {
  
  inline def apply(dispose: Any => Unit): IShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose))
    __obj.asInstanceOf[IShim]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShim] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: Any => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
  }
}
