package typings.useSidecar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5EnvMod {
  
  object env {
    
    @JSImport("use-sidecar/dist/es5/env", "env")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("use-sidecar/dist/es5/env", "env.forceCache")
    @js.native
    def forceCache: Boolean = js.native
    inline def forceCache_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceCache")(x.asInstanceOf[js.Any])
    
    @JSImport("use-sidecar/dist/es5/env", "env.isNode")
    @js.native
    def isNode: Boolean = js.native
    inline def isNode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNode")(x.asInstanceOf[js.Any])
  }
}
