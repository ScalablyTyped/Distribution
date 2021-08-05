package typings.walkSync.anon

import typings.minimatch.mod.IMinimatch
import typings.minimatch.mod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined walk-sync.walk-sync.Optionalize<walk-sync.walk-sync.Options, 'fs'> */
trait OptionalizeOptionsfs extends StObject {
  
  var directories: js.UndefOr[Boolean] = js.undefined
  
  var fs: js.UndefOr[TypeoffsNode] = js.undefined
  
  var globOptions: js.UndefOr[IOptions] = js.undefined
  
  var globs: js.UndefOr[js.Array[String | IMinimatch]] = js.undefined
  
  var ignore: js.UndefOr[js.Array[String | IMinimatch]] = js.undefined
  
  var includeBasePath: js.UndefOr[Boolean] = js.undefined
}
object OptionalizeOptionsfs {
  
  inline def apply(): OptionalizeOptionsfs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalizeOptionsfs]
  }
  
  extension [Self <: OptionalizeOptionsfs](x: Self) {
    
    inline def setDirectories(value: Boolean): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setFs(value: TypeoffsNode): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
    
    inline def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
    
    inline def setGlobs(value: js.Array[String | IMinimatch]): Self = StObject.set(x, "globs", value.asInstanceOf[js.Any])
    
    inline def setGlobsUndefined: Self = StObject.set(x, "globs", js.undefined)
    
    inline def setGlobsVarargs(value: (String | IMinimatch)*): Self = StObject.set(x, "globs", js.Array(value :_*))
    
    inline def setIgnore(value: js.Array[String | IMinimatch]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: (String | IMinimatch)*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    
    inline def setIncludeBasePath(value: Boolean): Self = StObject.set(x, "includeBasePath", value.asInstanceOf[js.Any])
    
    inline def setIncludeBasePathUndefined: Self = StObject.set(x, "includeBasePath", js.undefined)
  }
}
