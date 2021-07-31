package typings.writeFileWebpackPlugin

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @JSImport("write-file-webpack-plugin", JSImport.Default)
  @js.native
  class default () extends StObject {
    def this(userOptions: UserOptionsType) = this()
  }
  
  trait UserOptionsType extends StObject {
    
    /**
      * Atomically replace files content (i.e., to prevent programs like test watchers from seeing partial files).
      * @default true
      */
    var atomicReplace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stop writing files on webpack errors
      * @default true
      */
    var exitOnErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Forces the execution of the plugin regardless of being using `webpack-dev-server` or not
      * @default false
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Logs names of the files that are being written (or skipped because they have not changed)
      * @default true
      */
    var log: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A regular expression or function used to test if file should be written.
      * When not present, all bundle will be written.
      */
    var test: js.UndefOr[RegExp] = js.undefined
    
    /**
      * Use hash index to write only files that have changed since the last iteration.
      * @default true
      */
    var useHashIndex: js.UndefOr[Boolean] = js.undefined
  }
  object UserOptionsType {
    
    @scala.inline
    def apply(): UserOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOptionsType]
    }
    
    @scala.inline
    implicit class UserOptionsTypeMutableBuilder[Self <: UserOptionsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtomicReplace(value: Boolean): Self = StObject.set(x, "atomicReplace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtomicReplaceUndefined: Self = StObject.set(x, "atomicReplace", js.undefined)
      
      @scala.inline
      def setExitOnErrors(value: Boolean): Self = StObject.set(x, "exitOnErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnErrorsUndefined: Self = StObject.set(x, "exitOnErrors", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setTest(value: RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setUseHashIndex(value: Boolean): Self = StObject.set(x, "useHashIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHashIndexUndefined: Self = StObject.set(x, "useHashIndex", js.undefined)
    }
  }
  
  type WriteFilePlugin = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin */ js.Any
}
