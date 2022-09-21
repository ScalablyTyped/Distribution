package typings.waitForLocalhost

import typings.waitForLocalhost.anon.IpVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wait-for-localhost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[IpVersion] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[IpVersion]]
  inline def default(options: Options): js.Promise[IpVersion] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IpVersion]]
  
  trait Options extends StObject {
    
    /**
    	Use a custom path.
    	For example, `/health` for a health-check endpoint.
    	@default '/'
    	*/
    var path: js.UndefOr[String] = js.undefined
    
    /**
    	@default 80
    	*/
    var port: js.UndefOr[Double] = js.undefined
    
    /**
    	Use the `GET` HTTP-method instead of `HEAD` to check if the server is running.
    	@default false
    	*/
    var useGet: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setUseGet(value: Boolean): Self = StObject.set(x, "useGet", value.asInstanceOf[js.Any])
      
      inline def setUseGetUndefined: Self = StObject.set(x, "useGet", js.undefined)
    }
  }
}
