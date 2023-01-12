package typings.workboxPrecaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInstallResultMod {
  
  trait InstallResult extends StObject {
    
    var notUpdatedURLs: js.Array[String]
    
    var updatedURLs: js.Array[String]
  }
  object InstallResult {
    
    inline def apply(notUpdatedURLs: js.Array[String], updatedURLs: js.Array[String]): InstallResult = {
      val __obj = js.Dynamic.literal(notUpdatedURLs = notUpdatedURLs.asInstanceOf[js.Any], updatedURLs = updatedURLs.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstallResult] (val x: Self) extends AnyVal {
      
      inline def setNotUpdatedURLs(value: js.Array[String]): Self = StObject.set(x, "notUpdatedURLs", value.asInstanceOf[js.Any])
      
      inline def setNotUpdatedURLsVarargs(value: String*): Self = StObject.set(x, "notUpdatedURLs", js.Array(value*))
      
      inline def setUpdatedURLs(value: js.Array[String]): Self = StObject.set(x, "updatedURLs", value.asInstanceOf[js.Any])
      
      inline def setUpdatedURLsVarargs(value: String*): Self = StObject.set(x, "updatedURLs", js.Array(value*))
    }
  }
}
