package typings.unusedFilesWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ignore extends StObject {
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Ignore {
    
    inline def apply(): Ignore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ignore]
    }
    
    extension [Self <: Ignore](x: Self) {
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
    }
  }
}
