package typings.webpackbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait File extends StObject {
    
    val file: Null | String
    
    val loaders: js.Array[String]
  }
  object File {
    
    inline def apply(loaders: js.Array[String]): File = {
      val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any], file = null)
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setLoaders(value: js.Array[String]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersVarargs(value: String*): Self = StObject.set(x, "loaders", js.Array(value*))
    }
  }
}
