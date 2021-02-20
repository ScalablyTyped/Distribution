package typings.vinylFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cwd extends StObject {
    
    /**
      * Specify the working directory the folder is relative to
      * Default is process.cwd()
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Specify the mode the directory should be created with
      * Default is the process mode
      */
    var dirMode: js.UndefOr[Double] = js.native
    
    /** Specify the mode the directory should be created with. Default is the process mode */
    var mode: js.UndefOr[Double | String] = js.native
  }
  object Cwd {
    
    @scala.inline
    def apply(): Cwd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cwd]
    }
    
    @scala.inline
    implicit class CwdMutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDirMode(value: Double): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
      
      @scala.inline
      def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait DirMode extends StObject {
    
    /**
      * Specify the working directory the folder is relative to
      * Default is process.cwd()
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Specify the mode the directory should be created with
      * Default is the process mode
      */
    var dirMode: js.UndefOr[Double] = js.native
  }
  object DirMode {
    
    @scala.inline
    def apply(): DirMode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirMode]
    }
    
    @scala.inline
    implicit class DirModeMutableBuilder[Self <: DirMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDirMode(value: Double): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
    }
  }
}
