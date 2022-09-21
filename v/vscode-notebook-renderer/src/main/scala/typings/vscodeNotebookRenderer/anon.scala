package typings.vscodeNotebookRenderer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsTrusted extends StObject {
    
    /**
      * When true, the user has explicitly trusted the contents of the workspace.
      */
    val isTrusted: Boolean
  }
  object IsTrusted {
    
    inline def apply(isTrusted: Boolean): IsTrusted = {
      val __obj = js.Dynamic.literal(isTrusted = isTrusted.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsTrusted]
    }
    
    extension [Self <: IsTrusted](x: Self) {
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    }
  }
}
