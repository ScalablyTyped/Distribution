package typings.webpackDevServer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object webpackAugmentingMod {
  
  trait Configuration extends StObject {
    
    /**
      * Can be used to configure the behaviour of webpack-dev-server when
      * the webpack config is passed to webpack-dev-server CLI.
      */
    var devServer: js.UndefOr[DevServerConfiguration] = js.undefined
  }
  object Configuration {
    
    inline def apply(): typings.webpackDevServer.mod.webpackAugmentingMod.Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.webpackDevServer.mod.webpackAugmentingMod.Configuration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.webpackDevServer.mod.webpackAugmentingMod.Configuration] (val x: Self) extends AnyVal {
      
      inline def setDevServer(value: DevServerConfiguration): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
      
      inline def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
    }
  }
}
