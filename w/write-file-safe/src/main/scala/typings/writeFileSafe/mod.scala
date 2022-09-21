package typings.writeFileSafe

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("write-file-safe/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeFile(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def writeFile(path: String, content: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeFile(path: String, content: String, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeFile(path: String, content: Unit, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeFile(path: String, content: Buffer): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def writeFile(path: String, content: Buffer, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def writeFileSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def writeFileSync(path: String, content: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def writeFileSync(path: String, content: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def writeFileSync(path: String, content: Unit, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def writeFileSync(path: String, content: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def writeFileSync(path: String, content: Buffer, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    /**
      * Ensure file ends with a newline. Default: `true`
      */
    var appendNewline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Write even if file already exists. Default: `true`
      */
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Recursively create parent directories if needed. Default: `true`
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppendNewline(value: Boolean): Self = StObject.set(x, "appendNewline", value.asInstanceOf[js.Any])
      
      inline def setAppendNewlineUndefined: Self = StObject.set(x, "appendNewline", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
