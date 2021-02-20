package typings.tesseractJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CorePath extends StObject {
    
    var corePath: String = js.native
    
    var langPath: String = js.native
    
    var workerPath: String = js.native
  }
  object CorePath {
    
    @scala.inline
    def apply(corePath: String, langPath: String, workerPath: String): CorePath = {
      val __obj = js.Dynamic.literal(corePath = corePath.asInstanceOf[js.Any], langPath = langPath.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorePath]
    }
    
    @scala.inline
    implicit class CorePathMutableBuilder[Self <: CorePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorePath(value: String): Self = StObject.set(x, "corePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangPath(value: String): Self = StObject.set(x, "langPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
    }
  }
}
