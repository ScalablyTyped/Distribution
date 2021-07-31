package typings.waitForLocalhost

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Wait for localhost to be ready.
  	@example
  	```
  	import waitForLocalhost = require('wait-for-localhost');
  	(async () => {
  		await waitForLocalhost({port: 8080});
  		console.log('Server is ready');
  	})();
  	```
  	 */
  @scala.inline
  def apply(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def apply(options: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("wait-for-localhost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function waitForLocalhost(
  // 	options?: waitForLocalhost.Options
  // ): Promise<void>;
  // export = waitForLocalhost;
  @JSImport("wait-for-localhost", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof waitForLocalhost */ js.Any = js.native
  @scala.inline
  def default_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof waitForLocalhost */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setUseGet(value: Boolean): Self = StObject.set(x, "useGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseGetUndefined: Self = StObject.set(x, "useGet", js.undefined)
    }
  }
}
