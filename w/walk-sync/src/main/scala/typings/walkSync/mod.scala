package typings.walkSync

import typings.minimatch.mod.IMinimatch
import typings.minimatch.mod.IOptions
import typings.walkSync.anon.TypeoffsNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(baseDir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(baseDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(baseDir: String, inputOptions: js.Array[String | IMinimatch]): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(baseDir.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(baseDir: String, inputOptions: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(baseDir.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("walk-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("walk-sync", "Entry")
  @js.native
  open class Entry protected () extends StObject {
    def this(relativePath: String, basePath: String, mode: Double, size: Double, mtime: Double) = this()
    
    var basePath: String = js.native
    
    def fullPath: String = js.native
    
    def isDirectory(): Boolean = js.native
    
    var mode: Double = js.native
    
    var mtime: Double = js.native
    
    var relativePath: String = js.native
    
    var size: Double = js.native
  }
  
  inline def entries(baseDir: String): js.Array[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(baseDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[Entry]]
  inline def entries(baseDir: String, inputOptions: js.Array[String | IMinimatch]): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("entries")(baseDir.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  inline def entries(baseDir: String, inputOptions: Options): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("entries")(baseDir.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  
  trait Options extends StObject {
    
    var directories: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[TypeoffsNode] = js.undefined
    
    var globOptions: js.UndefOr[IOptions] = js.undefined
    
    var globs: js.UndefOr[js.Array[String | IMinimatch]] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String | IMinimatch]] = js.undefined
    
    var includeBasePath: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDirectories(value: Boolean): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setFs(value: TypeoffsNode): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      inline def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
      
      inline def setGlobs(value: js.Array[String | IMinimatch]): Self = StObject.set(x, "globs", value.asInstanceOf[js.Any])
      
      inline def setGlobsUndefined: Self = StObject.set(x, "globs", js.undefined)
      
      inline def setGlobsVarargs(value: (String | IMinimatch)*): Self = StObject.set(x, "globs", js.Array(value*))
      
      inline def setIgnore(value: js.Array[String | IMinimatch]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (String | IMinimatch)*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setIncludeBasePath(value: Boolean): Self = StObject.set(x, "includeBasePath", value.asInstanceOf[js.Any])
      
      inline def setIncludeBasePathUndefined: Self = StObject.set(x, "includeBasePath", js.undefined)
    }
  }
}
