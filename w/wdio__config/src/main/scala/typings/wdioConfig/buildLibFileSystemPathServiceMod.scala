package typings.wdioConfig

import typings.wdioConfig.buildTypesMod.PathService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibFileSystemPathServiceMod {
  
  @JSImport("@wdio/config/build/lib/FileSystemPathService", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FileSystemPathService {
    
    /* CompleteClass */
    override def ensureAbsolutePath(path: String, rootDir: String): String = js.native
    
    /* CompleteClass */
    override def glob(pattern: String, rootDir: String): js.Array[String] = js.native
    
    /* CompleteClass */
    override def isFile(path: String): Boolean = js.native
    
    /* CompleteClass */
    override def loadFile[T](path: String): js.Promise[T] = js.native
    
    /* private */ /* CompleteClass */
    var `private`: Any = js.native
  }
  
  trait FileSystemPathService
    extends StObject
       with PathService {
    
    /* private */ var `private`: Any
  }
  object FileSystemPathService {
    
    inline def apply(
      ensureAbsolutePath: (String, String) => String,
      glob: (String, String) => js.Array[String],
      isFile: String => Boolean,
      loadFile: String => js.Promise[Any],
      `private`: Any
    ): FileSystemPathService = {
      val __obj = js.Dynamic.literal(ensureAbsolutePath = js.Any.fromFunction2(ensureAbsolutePath), glob = js.Any.fromFunction2(glob), isFile = js.Any.fromFunction1(isFile), loadFile = js.Any.fromFunction1(loadFile))
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemPathService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSystemPathService] (val x: Self) extends AnyVal {
      
      inline def setPrivate(value: Any): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    }
  }
}
