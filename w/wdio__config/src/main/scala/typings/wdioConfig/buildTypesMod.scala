package typings.wdioConfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  trait ModuleImportService extends StObject {
    
    def `import`[T](module: String): js.Promise[T]
  }
  object ModuleImportService {
    
    inline def apply(`import`: String => js.Promise[Any]): ModuleImportService = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[ModuleImportService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleImportService] (val x: Self) extends AnyVal {
      
      inline def setImport(value: String => js.Promise[Any]): Self = StObject.set(x, "import", js.Any.fromFunction1(value))
    }
  }
  
  trait PathService extends StObject {
    
    def ensureAbsolutePath(path: String, rootDir: String): String
    
    def glob(pattern: String, rootDir: String): js.Array[String]
    
    def isFile(path: String): Boolean
    
    def loadFile[T](path: String): js.Promise[T]
  }
  object PathService {
    
    inline def apply(
      ensureAbsolutePath: (String, String) => String,
      glob: (String, String) => js.Array[String],
      isFile: String => Boolean,
      loadFile: String => js.Promise[Any]
    ): PathService = {
      val __obj = js.Dynamic.literal(ensureAbsolutePath = js.Any.fromFunction2(ensureAbsolutePath), glob = js.Any.fromFunction2(glob), isFile = js.Any.fromFunction1(isFile), loadFile = js.Any.fromFunction1(loadFile))
      __obj.asInstanceOf[PathService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathService] (val x: Self) extends AnyVal {
      
      inline def setEnsureAbsolutePath(value: (String, String) => String): Self = StObject.set(x, "ensureAbsolutePath", js.Any.fromFunction2(value))
      
      inline def setGlob(value: (String, String) => js.Array[String]): Self = StObject.set(x, "glob", js.Any.fromFunction2(value))
      
      inline def setIsFile(value: String => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
      
      inline def setLoadFile(value: String => js.Promise[Any]): Self = StObject.set(x, "loadFile", js.Any.fromFunction1(value))
    }
  }
}
