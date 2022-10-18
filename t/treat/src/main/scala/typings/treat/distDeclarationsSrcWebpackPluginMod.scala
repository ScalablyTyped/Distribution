package typings.treat

import typings.treat.anon.AddCssRequests
import typings.treat.anon.Browsers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcWebpackPluginMod {
  
  @JSImport("treat/dist/declarations/src/webpack-plugin", "TreatPlugin")
  @js.native
  open class TreatPlugin () extends StObject {
    def this(options: js.Object) = this()
    
    @JSName("apply")
    def apply(compiler: Any): Unit = js.native
    
    var loaderOptions: Browsers = js.native
    
    var localIdentName: Any = js.native
    
    var minify: Any = js.native
    
    var store: AddCssRequests = js.native
    
    var test: Any = js.native
    
    var themeIdentName: Any = js.native
  }
}
