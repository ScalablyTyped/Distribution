package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePathMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/base-path", "BasePath")
  @js.native
  class BasePath () extends StObject {
    
    def add(fileName: String): Unit = js.native
    
    /* private */ var basePaths: js.Any = js.native
    
    def reset(): Unit = js.native
    
    def trim(fileName: String): String = js.native
  }
  /* static members */
  object BasePath {
    
    @JSImport("typedoc/dist/lib/converter/utils/base-path", "BasePath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def normalize(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
