package typings.trash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("trash", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Promise[Unit] = js.native
  @JSImport("trash", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): js.Promise[Unit] = js.native
  @JSImport("trash", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("trash", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String], options: Options): js.Promise[Unit] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Enable globbing when matching file paths.
    		@default true
    		*/
    val glob: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlob(value: Boolean): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    }
  }
}
