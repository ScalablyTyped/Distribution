package typings.walkSync.anon

import typings.minimatch.mod.IMinimatch
import typings.minimatch.mod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined walk-sync.walk-sync.Optionalize<walk-sync.walk-sync.Options, 'fs'> */
@js.native
trait OptionalizeOptionsfs extends StObject {
  
  var directories: js.UndefOr[Boolean] = js.native
  
  var fs: js.UndefOr[TypeoffsNode] = js.native
  
  var globOptions: js.UndefOr[IOptions] = js.native
  
  var globs: js.UndefOr[js.Array[String | IMinimatch]] = js.native
  
  var ignore: js.UndefOr[js.Array[String | IMinimatch]] = js.native
  
  var includeBasePath: js.UndefOr[Boolean] = js.native
}
object OptionalizeOptionsfs {
  
  @scala.inline
  def apply(): OptionalizeOptionsfs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalizeOptionsfs]
  }
  
  @scala.inline
  implicit class OptionalizeOptionsfsMutableBuilder[Self <: OptionalizeOptionsfs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectories(value: Boolean): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    @scala.inline
    def setFs(value: TypeoffsNode): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    @scala.inline
    def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
    
    @scala.inline
    def setGlobs(value: js.Array[String | IMinimatch]): Self = StObject.set(x, "globs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobsUndefined: Self = StObject.set(x, "globs", js.undefined)
    
    @scala.inline
    def setGlobsVarargs(value: (String | IMinimatch)*): Self = StObject.set(x, "globs", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String | IMinimatch]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: (String | IMinimatch)*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    
    @scala.inline
    def setIncludeBasePath(value: Boolean): Self = StObject.set(x, "includeBasePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBasePathUndefined: Self = StObject.set(x, "includeBasePath", js.undefined)
  }
}
