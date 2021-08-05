package typings.writeGood

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Explanation extends StObject {
    
    var explanation: String
    
    var fn: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WriteGood */ js.Any
  }
  object Explanation {
    
    inline def apply(
      explanation: String,
      fn: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WriteGood */ js.Any
    ): Explanation = {
      val __obj = js.Dynamic.literal(explanation = explanation.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Explanation]
    }
    
    extension [Self <: Explanation](x: Self) {
      
      inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
      
      inline def setFn(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WriteGood */ js.Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
}
