package typings.ttiPolyfill

import typings.ttiPolyfill.mod.GetFirstConsistentlyInteractiveOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ttiPolyfill {
    
    @JSGlobal("ttiPolyfill")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFirstConsistentlyInteractive(): js.Promise[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstConsistentlyInteractive")().asInstanceOf[js.Promise[Double | Null]]
    inline def getFirstConsistentlyInteractive(opts: GetFirstConsistentlyInteractiveOpts): js.Promise[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstConsistentlyInteractive")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double | Null]]
  }
}
