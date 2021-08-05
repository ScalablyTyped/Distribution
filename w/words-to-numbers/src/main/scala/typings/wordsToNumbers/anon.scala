package typings.wordsToNumbers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fuzzy extends StObject {
    
    var fuzzy: Boolean
  }
  object Fuzzy {
    
    inline def apply(fuzzy: Boolean): Fuzzy = {
      val __obj = js.Dynamic.literal(fuzzy = fuzzy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fuzzy]
    }
    
    extension [Self <: Fuzzy](x: Self) {
      
      inline def setFuzzy(value: Boolean): Self = StObject.set(x, "fuzzy", value.asInstanceOf[js.Any])
    }
  }
}
