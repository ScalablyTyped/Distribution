package typings.swr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<swr.swr/dist/types.ProviderConfiguration> */
trait PartialProviderConfigurat extends StObject {
  
  var initFocus: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], js.Function0[Unit] | Unit]] = js.undefined
  
  var initReconnect: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], js.Function0[Unit] | Unit]] = js.undefined
}
object PartialProviderConfigurat {
  
  inline def apply(): PartialProviderConfigurat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProviderConfigurat]
  }
  
  extension [Self <: PartialProviderConfigurat](x: Self) {
    
    inline def setInitFocus(value: /* callback */ js.Function0[Unit] => js.Function0[Unit] | Unit): Self = StObject.set(x, "initFocus", js.Any.fromFunction1(value))
    
    inline def setInitFocusUndefined: Self = StObject.set(x, "initFocus", js.undefined)
    
    inline def setInitReconnect(value: /* callback */ js.Function0[Unit] => js.Function0[Unit] | Unit): Self = StObject.set(x, "initReconnect", js.Any.fromFunction1(value))
    
    inline def setInitReconnectUndefined: Self = StObject.set(x, "initReconnect", js.undefined)
  }
}
