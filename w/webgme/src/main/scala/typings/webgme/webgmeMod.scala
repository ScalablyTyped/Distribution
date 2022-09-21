package typings.webgme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Based on examination of
// Example: https://github.com/typed-typings/env-node/blob/master/0.12/node.d.ts
// Source: https://raw.githubusercontent.com/phreed/typed-npm-webgme/master/webgme.d.ts
// Documentation: https://editor.webgme.org/docs/source/index.html
// https://github.com/webgme/webgme/tree/master/config
object webgmeMod {
  
  @JSImport("webgme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webgme", "Standalone")
  @js.native
  open class Standalone protected () extends StObject {
    def this(config: Any) = this()
    
    def start(fn: Any): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  inline def addToRequireJsPaths(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addToRequireJsPaths")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def standaloneServer(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("standaloneServer")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
