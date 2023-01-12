package typings.tsconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tsconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(dir: String): js.Promise[String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Unit]]
  
  inline def findSync(dir: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(dir.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def load(cwd: String): js.Promise[LoadResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LoadResult]]
  inline def load(cwd: String, filename: String): js.Promise[LoadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(cwd.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LoadResult]]
  
  inline def loadSync(cwd: String): LoadResult = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(cwd.asInstanceOf[js.Any]).asInstanceOf[LoadResult]
  inline def loadSync(cwd: String, filename: String): LoadResult = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(cwd.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[LoadResult]
  
  inline def parse(contents: String, filename: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(contents.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def readFile(filename: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def readFileSync(filename: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def resolve(cwd: String): js.Promise[String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Unit]]
  inline def resolve(cwd: String, filename: String): js.Promise[String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(cwd.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Unit]]
  
  inline def resolveSync(cwd: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSync")(cwd.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  inline def resolveSync(cwd: String, filename: String): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSync")(cwd.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  
  trait LoadResult extends StObject {
    
    var config: Any
    
    var path: js.UndefOr[String] = js.undefined
  }
  object LoadResult {
    
    inline def apply(config: Any): LoadResult = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadResult] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
