package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetVersionDeferral extends StObject {
  
  def complete(): Unit
}
object ISetVersionDeferral {
  
  inline def apply(complete: () => Unit): ISetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ISetVersionDeferral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISetVersionDeferral] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
