package typings.walkAsyncgen

import typings.std.AsyncGenerator
import typings.walkAsyncgen.walkAsyncgenBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Walk a directory asynchronously and returns every file found.
    * @param dir The directory to start at. Defaults to the current working directory.
    * @param options Optional settings for the walk.
    */
  inline def apply(): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def apply(dir: String): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def apply(dir: String, options: Options): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def apply(dir: Unit, options: Options): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  
  @JSImport("walk-asyncgen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * A regex of which directories to exclude.
      */
    var excludeDirs: js.UndefOr[`false` | js.RegExp] = js.undefined
    
    /**
      * A regex of which extensions to exclude.
      */
    var excludeExt: js.UndefOr[`false` | js.RegExp] = js.undefined
    
    /**
      * A regex of which files to exclude.
      */
    var excludeFiles: js.UndefOr[`false` | js.RegExp] = js.undefined
    
    /**
      * A regex of which directories to include. If provided, only directories matching this regex will be walked.
      */
    var includeDirs: js.UndefOr[`false` | js.RegExp] = js.undefined
    
    /**
      * A regex of which extensions to include. If provided, only files with extensions matching this regex will be walked.
      */
    var includeExt: js.UndefOr[`false` | js.RegExp] = js.undefined
    
    /**
      * A regex of which files to include. If provided, only files matching this regex will be walked.
      */
    var includeFiles: js.UndefOr[`false` | js.RegExp] = js.undefined
    
    /**
      * Whether to print the directory that is initially walked.
      */
    var printDirs: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExcludeDirs(value: `false` | js.RegExp): Self = StObject.set(x, "excludeDirs", value.asInstanceOf[js.Any])
      
      inline def setExcludeDirsUndefined: Self = StObject.set(x, "excludeDirs", js.undefined)
      
      inline def setExcludeExt(value: `false` | js.RegExp): Self = StObject.set(x, "excludeExt", value.asInstanceOf[js.Any])
      
      inline def setExcludeExtUndefined: Self = StObject.set(x, "excludeExt", js.undefined)
      
      inline def setExcludeFiles(value: `false` | js.RegExp): Self = StObject.set(x, "excludeFiles", value.asInstanceOf[js.Any])
      
      inline def setExcludeFilesUndefined: Self = StObject.set(x, "excludeFiles", js.undefined)
      
      inline def setIncludeDirs(value: `false` | js.RegExp): Self = StObject.set(x, "includeDirs", value.asInstanceOf[js.Any])
      
      inline def setIncludeDirsUndefined: Self = StObject.set(x, "includeDirs", js.undefined)
      
      inline def setIncludeExt(value: `false` | js.RegExp): Self = StObject.set(x, "includeExt", value.asInstanceOf[js.Any])
      
      inline def setIncludeExtUndefined: Self = StObject.set(x, "includeExt", js.undefined)
      
      inline def setIncludeFiles(value: `false` | js.RegExp): Self = StObject.set(x, "includeFiles", value.asInstanceOf[js.Any])
      
      inline def setIncludeFilesUndefined: Self = StObject.set(x, "includeFiles", js.undefined)
      
      inline def setPrintDirs(value: Boolean): Self = StObject.set(x, "printDirs", value.asInstanceOf[js.Any])
      
      inline def setPrintDirsUndefined: Self = StObject.set(x, "printDirs", js.undefined)
    }
  }
}
