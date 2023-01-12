package typings.strongGlobalize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  trait Process extends StObject {
    
    var browser: Boolean
  }
  object Process {
    
    inline def apply(browser: Boolean): Process = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[Process]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Process] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    }
  }
}
