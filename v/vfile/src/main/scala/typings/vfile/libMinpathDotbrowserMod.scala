package typings.vfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMinpathDotbrowserMod {
  
  object path {
    
    @JSImport("vfile/lib/minpath.browser", "path")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vfile/lib/minpath.browser", "path.sep")
    @js.native
    def sep: String = js.native
    inline def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  }
}
