package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePathMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/base-path", "BasePath")
  @js.native
  open class BasePath () extends StObject {
    
    /**
      * Add the given file path to this set of base paths.
      *
      * @param fileName  The absolute filename that should be added to the base path.
      */
    def add(fileName: String): Unit = js.native
    
    /**
      * List of known base paths.
      */
    /* private */ var basePaths: Any = js.native
    
    /**
      * Reset this instance, ignore all paths already passed to {@link add}.
      */
    def reset(): Unit = js.native
    
    /**
      * Trim the given filename by the determined base paths.
      *
      * @param fileName  The absolute filename that should be trimmed.
      * @returns The trimmed version of the filename.
      */
    def trim(fileName: String): String = js.native
  }
  /* static members */
  object BasePath {
    
    @JSImport("typedoc/dist/lib/converter/utils/base-path", "BasePath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Normalize the given path.
      *
      * @param path  The path that should be normalized.
      * @returns Normalized version of the given path.
      */
    inline def normalize(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
