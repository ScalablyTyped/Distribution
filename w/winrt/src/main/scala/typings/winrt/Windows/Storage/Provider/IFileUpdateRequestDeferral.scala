package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileUpdateRequestDeferral extends StObject {
  
  def complete(): Unit
}
object IFileUpdateRequestDeferral {
  
  inline def apply(complete: () => Unit): IFileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IFileUpdateRequestDeferral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileUpdateRequestDeferral] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
