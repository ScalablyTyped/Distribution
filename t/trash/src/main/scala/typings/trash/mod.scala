package typings.trash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Move files and folders to the trash.
  @param input - Accepts paths and [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  @example
  ```
  import trash = require('trash');
  (async () => {
  	await trash(['*.png', '!rainbow.png']);
  })();
  ```
  */
  inline def apply(input: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(input: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(input: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(input: js.Array[String], options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("trash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Enable globbing when matching file paths.
    		@default true
    		*/
    val glob: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGlob(value: Boolean): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    }
  }
}
