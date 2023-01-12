package typings.stylableBuildTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config[T] extends StObject {
    
    var config: T
    
    var path: String
  }
  object Config {
    
    inline def apply[T](config: T, path: String): Config[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config[?], T] (val x: Self & Config[T]) extends AnyVal {
      
      inline def setConfig(value: T): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
