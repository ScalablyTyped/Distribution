package typings.tesseractJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CorePath extends StObject {
    
    var corePath: String
    
    var langPath: String
    
    var workerPath: String
  }
  object CorePath {
    
    inline def apply(corePath: String, langPath: String, workerPath: String): CorePath = {
      val __obj = js.Dynamic.literal(corePath = corePath.asInstanceOf[js.Any], langPath = langPath.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorePath]
    }
    
    extension [Self <: CorePath](x: Self) {
      
      inline def setCorePath(value: String): Self = StObject.set(x, "corePath", value.asInstanceOf[js.Any])
      
      inline def setLangPath(value: String): Self = StObject.set(x, "langPath", value.asInstanceOf[js.Any])
      
      inline def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
    }
  }
}
