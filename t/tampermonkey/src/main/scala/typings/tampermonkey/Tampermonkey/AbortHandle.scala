package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortHandle[TReturn] extends StObject {
  
  def abort(): TReturn
}
object AbortHandle {
  
  inline def apply[TReturn](abort: () => TReturn): AbortHandle[TReturn] = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[AbortHandle[TReturn]]
  }
  
  extension [Self <: AbortHandle[?], TReturn](x: Self & AbortHandle[TReturn]) {
    
    inline def setAbort(value: () => TReturn): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
  }
}
