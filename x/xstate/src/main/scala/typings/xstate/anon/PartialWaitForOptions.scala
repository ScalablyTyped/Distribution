package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<xstate.xstate/lib/waitFor.WaitForOptions> */
trait PartialWaitForOptions extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialWaitForOptions {
  
  inline def apply(): PartialWaitForOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWaitForOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialWaitForOptions] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
