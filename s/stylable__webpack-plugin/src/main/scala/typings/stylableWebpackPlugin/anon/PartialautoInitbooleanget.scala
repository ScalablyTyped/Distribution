package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoInit :boolean,   getAutoInitModule :any | undefined,   globalInjection :(p : string): string | undefined}> */
trait PartialautoInitbooleanget extends StObject {
  
  var autoInit: js.UndefOr[Boolean] = js.undefined
  
  var getAutoInitModule: js.UndefOr[js.Any] = js.undefined
  
  var globalInjection: js.UndefOr[js.Function1[/* p */ String, String]] = js.undefined
}
object PartialautoInitbooleanget {
  
  inline def apply(): PartialautoInitbooleanget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoInitbooleanget]
  }
  
  extension [Self <: PartialautoInitbooleanget](x: Self) {
    
    inline def setAutoInit(value: Boolean): Self = StObject.set(x, "autoInit", value.asInstanceOf[js.Any])
    
    inline def setAutoInitUndefined: Self = StObject.set(x, "autoInit", js.undefined)
    
    inline def setGetAutoInitModule(value: js.Any): Self = StObject.set(x, "getAutoInitModule", value.asInstanceOf[js.Any])
    
    inline def setGetAutoInitModuleUndefined: Self = StObject.set(x, "getAutoInitModule", js.undefined)
    
    inline def setGlobalInjection(value: /* p */ String => String): Self = StObject.set(x, "globalInjection", js.Any.fromFunction1(value))
    
    inline def setGlobalInjectionUndefined: Self = StObject.set(x, "globalInjection", js.undefined)
  }
}
