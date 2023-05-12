package typings.vinylFs

import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cwd extends StObject {
    
    /**
      * Specify the working directory the folder is relative to
      * Default is process.cwd()
      */
    var cwd: js.UndefOr[String | (js.Function1[/* file */ File, String])] = js.undefined
    
    /**
      * Specify the mode the directory should be created with
      * Default is the process mode
      */
    var dirMode: js.UndefOr[Double | (js.Function1[/* file */ File, Double])] = js.undefined
    
    /** Specify if existing files with the same path should be overwritten or not. Default is true, to always overwrite existing files */
    var overwrite: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
    
    /**
      * Specify whether the symlink should be relative or absolute.
      * Default is false.
      */
    var relativeSymlinks: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
    
    /* When creating a symlink, whether or not a directory symlink should be created as a junction. */
    var useJunctions: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
  }
  object Cwd {
    
    inline def apply(): Cwd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cwd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String | (js.Function1[/* file */ File, String])): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdFunction1(value: /* file */ File => String): Self = StObject.set(x, "cwd", js.Any.fromFunction1(value))
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDirMode(value: Double | (js.Function1[/* file */ File, Double])): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      inline def setDirModeFunction1(value: /* file */ File => Double): Self = StObject.set(x, "dirMode", js.Any.fromFunction1(value))
      
      inline def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
      
      inline def setOverwrite(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "overwrite", js.Any.fromFunction1(value))
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setRelativeSymlinks(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "relativeSymlinks", value.asInstanceOf[js.Any])
      
      inline def setRelativeSymlinksFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "relativeSymlinks", js.Any.fromFunction1(value))
      
      inline def setRelativeSymlinksUndefined: Self = StObject.set(x, "relativeSymlinks", js.undefined)
      
      inline def setUseJunctions(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "useJunctions", value.asInstanceOf[js.Any])
      
      inline def setUseJunctionsFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "useJunctions", js.Any.fromFunction1(value))
      
      inline def setUseJunctionsUndefined: Self = StObject.set(x, "useJunctions", js.undefined)
    }
  }
}
