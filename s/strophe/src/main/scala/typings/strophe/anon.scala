package typings.strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MatchBare extends StObject {
    
    var matchBare: Boolean
  }
  object MatchBare {
    
    inline def apply(matchBare: Boolean): MatchBare = {
      val __obj = js.Dynamic.literal(matchBare = matchBare.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchBare]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchBare] (val x: Self) extends AnyVal {
      
      inline def setMatchBare(value: Boolean): Self = StObject.set(x, "matchBare", value.asInstanceOf[js.Any])
    }
  }
}
