package typings.wdioConfig

import typings.wdioConfig.anon.Paths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  @js.native
  trait ModuleRequireService extends StObject {
    
    def require[T](module: String): T = js.native
    
    def resolve(request: String): String = js.native
    def resolve(request: String, options: Paths): String = js.native
  }
  
  trait PathService extends StObject {
    
    def ensureAbsolutePath(path: String): String
    
    def getcwd(): String
    
    def glob(pattern: String): js.Array[String]
    
    def isFile(path: String): Boolean
    
    def loadFile[T](path: String): T
  }
  object PathService {
    
    inline def apply(
      ensureAbsolutePath: String => String,
      getcwd: () => String,
      glob: String => js.Array[String],
      isFile: String => Boolean,
      loadFile: String => Any
    ): PathService = {
      val __obj = js.Dynamic.literal(ensureAbsolutePath = js.Any.fromFunction1(ensureAbsolutePath), getcwd = js.Any.fromFunction0(getcwd), glob = js.Any.fromFunction1(glob), isFile = js.Any.fromFunction1(isFile), loadFile = js.Any.fromFunction1(loadFile))
      __obj.asInstanceOf[PathService]
    }
    
    extension [Self <: PathService](x: Self) {
      
      inline def setEnsureAbsolutePath(value: String => String): Self = StObject.set(x, "ensureAbsolutePath", js.Any.fromFunction1(value))
      
      inline def setGetcwd(value: () => String): Self = StObject.set(x, "getcwd", js.Any.fromFunction0(value))
      
      inline def setGlob(value: String => js.Array[String]): Self = StObject.set(x, "glob", js.Any.fromFunction1(value))
      
      inline def setIsFile(value: String => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
      
      inline def setLoadFile(value: String => Any): Self = StObject.set(x, "loadFile", js.Any.fromFunction1(value))
    }
  }
}
