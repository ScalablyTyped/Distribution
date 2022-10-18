package typings.writeDirSafe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("write-dir-safe/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeDir(path: String): js.Promise[js.UndefOr[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Boolean]]]
  inline def writeDir(path: String, options: Options): js.Promise[js.UndefOr[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Boolean]]]
  
  inline def writeDirSync(path: String): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  inline def writeDirSync(path: String, options: Options): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  trait Options extends StObject {
    
    /**
      * Recursively create parent directories as well. Default: `true`
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
