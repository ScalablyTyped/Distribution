package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortHandle[TReturn] extends StObject {
  
  def abort(): TReturn = js.native
}
object AbortHandle {
  
  @scala.inline
  def apply[TReturn](abort: () => TReturn): AbortHandle[TReturn] = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[AbortHandle[TReturn]]
  }
  
  @scala.inline
  implicit class AbortHandleMutableBuilder[Self <: AbortHandle[_], TReturn] (val x: Self with AbortHandle[TReturn]) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => TReturn): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
  }
}
