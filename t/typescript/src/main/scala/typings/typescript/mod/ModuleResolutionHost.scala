package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleResolutionHost extends StObject {
  
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.native
  
  def fileExists(fileName: java.lang.String): Boolean = js.native
  
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  var getDirectories: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.native
  
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String] = js.native
  
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
}
object ModuleResolutionHost {
  
  @scala.inline
  def apply(
    fileExists: java.lang.String => Boolean,
    readFile: java.lang.String => js.UndefOr[java.lang.String]
  ): ModuleResolutionHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), readFile = js.Any.fromFunction1(readFile))
    __obj.asInstanceOf[ModuleResolutionHost]
  }
  
  @scala.inline
  implicit class ModuleResolutionHostMutableBuilder[Self <: ModuleResolutionHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryExists(value: /* directoryName */ java.lang.String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDirectoryExistsUndefined: Self = StObject.set(x, "directoryExists", js.undefined)
    
    @scala.inline
    def setFileExists(value: java.lang.String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentDirectoryUndefined: Self = StObject.set(x, "getCurrentDirectory", js.undefined)
    
    @scala.inline
    def setGetDirectories(value: /* path */ java.lang.String => js.Array[java.lang.String]): Self = StObject.set(x, "getDirectories", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDirectoriesUndefined: Self = StObject.set(x, "getDirectories", js.undefined)
    
    @scala.inline
    def setReadFile(value: java.lang.String => js.UndefOr[java.lang.String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRealpath(value: /* path */ java.lang.String => java.lang.String): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    
    @scala.inline
    def setTrace(value: /* s */ java.lang.String => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
