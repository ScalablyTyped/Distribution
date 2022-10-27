package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorsOptions extends StObject {
  
  var allowedHeaders: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var credentials: js.UndefOr[Boolean] = js.undefined
  
  var exposedHeaders: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var methods: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var optionsSuccessStatus: js.UndefOr[Double] = js.undefined
  
  var origin: js.UndefOr[
    CorsOrigin | (js.Function2[
      /* origin */ String, 
      /* cb */ js.Function2[/* err */ js.Error, /* origins */ CorsOrigin, Unit], 
      Unit
    ])
  ] = js.undefined
  
  var preflightContinue: js.UndefOr[Boolean] = js.undefined
}
object CorsOptions {
  
  inline def apply(): CorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorsOptions]
  }
  
  extension [Self <: CorsOptions](x: Self) {
    
    inline def setAllowedHeaders(value: String | js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
    
    inline def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value*))
    
    inline def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setExposedHeaders(value: String | js.Array[String]): Self = StObject.set(x, "exposedHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposedHeadersUndefined: Self = StObject.set(x, "exposedHeaders", js.undefined)
    
    inline def setExposedHeadersVarargs(value: String*): Self = StObject.set(x, "exposedHeaders", js.Array(value*))
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setMethods(value: String | js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setOptionsSuccessStatus(value: Double): Self = StObject.set(x, "optionsSuccessStatus", value.asInstanceOf[js.Any])
    
    inline def setOptionsSuccessStatusUndefined: Self = StObject.set(x, "optionsSuccessStatus", js.undefined)
    
    inline def setOrigin(
      value: CorsOrigin | (js.Function2[
          /* origin */ String, 
          /* cb */ js.Function2[/* err */ js.Error, /* origins */ CorsOrigin, Unit], 
          Unit
        ])
    ): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginFunction2(
      value: (/* origin */ String, /* cb */ js.Function2[/* err */ js.Error, /* origins */ CorsOrigin, Unit]) => Unit
    ): Self = StObject.set(x, "origin", js.Any.fromFunction2(value))
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setPreflightContinue(value: Boolean): Self = StObject.set(x, "preflightContinue", value.asInstanceOf[js.Any])
    
    inline def setPreflightContinueUndefined: Self = StObject.set(x, "preflightContinue", js.undefined)
  }
}
