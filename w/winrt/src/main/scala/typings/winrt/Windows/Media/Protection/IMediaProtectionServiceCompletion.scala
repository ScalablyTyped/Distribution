package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaProtectionServiceCompletion extends StObject {
  
  def complete(success: Boolean): Unit
}
object IMediaProtectionServiceCompletion {
  
  inline def apply(complete: Boolean => Unit): IMediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[IMediaProtectionServiceCompletion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMediaProtectionServiceCompletion] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: Boolean => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
  }
}
