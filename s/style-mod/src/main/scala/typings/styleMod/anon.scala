package typings.styleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Finish extends StObject {
    
    var finish: js.UndefOr[js.Function1[/* sel */ String, String]] = js.undefined
  }
  object Finish {
    
    inline def apply(): Finish = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Finish]
    }
    
    extension [Self <: Finish](x: Self) {
      
      inline def setFinish(value: /* sel */ String => String): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    }
  }
}
