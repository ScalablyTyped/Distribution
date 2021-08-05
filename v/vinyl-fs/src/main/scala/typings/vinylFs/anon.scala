package typings.vinylFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cwd extends StObject {
    
    /**
      * Specify the working directory the folder is relative to
      * Default is process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the mode the directory should be created with
      * Default is the process mode
      */
    var dirMode: js.UndefOr[Double] = js.undefined
    
    /** Specify the mode the directory should be created with. Default is the process mode */
    var mode: js.UndefOr[Double | String] = js.undefined
  }
  object Cwd {
    
    inline def apply(): Cwd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cwd]
    }
    
    extension [Self <: Cwd](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDirMode(value: Double): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      inline def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
      
      inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait DirMode extends StObject {
    
    /**
      * Specify the working directory the folder is relative to
      * Default is process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the mode the directory should be created with
      * Default is the process mode
      */
    var dirMode: js.UndefOr[Double] = js.undefined
  }
  object DirMode {
    
    inline def apply(): DirMode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirMode]
    }
    
    extension [Self <: DirMode](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDirMode(value: Double): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      inline def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
    }
  }
}
