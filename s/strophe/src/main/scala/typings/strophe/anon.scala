package typings.strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MatchBare extends StObject {
    
    var matchBare: Boolean
  }
  object MatchBare {
    
    @scala.inline
    def apply(matchBare: Boolean): MatchBare = {
      val __obj = js.Dynamic.literal(matchBare = matchBare.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchBare]
    }
    
    @scala.inline
    implicit class MatchBareMutableBuilder[Self <: MatchBare] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchBare(value: Boolean): Self = StObject.set(x, "matchBare", value.asInstanceOf[js.Any])
    }
  }
}
