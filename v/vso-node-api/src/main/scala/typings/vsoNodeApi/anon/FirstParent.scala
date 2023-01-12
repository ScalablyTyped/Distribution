package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstParent extends StObject {
  
  var firstParent: scala.Double
  
  var fullHistory: scala.Double
  
  var fullHistorySimplifyMerges: scala.Double
  
  var simplifiedHistory: scala.Double
}
object FirstParent {
  
  inline def apply(
    firstParent: scala.Double,
    fullHistory: scala.Double,
    fullHistorySimplifyMerges: scala.Double,
    simplifiedHistory: scala.Double
  ): FirstParent = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], fullHistory = fullHistory.asInstanceOf[js.Any], fullHistorySimplifyMerges = fullHistorySimplifyMerges.asInstanceOf[js.Any], simplifiedHistory = simplifiedHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstParent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstParent] (val x: Self) extends AnyVal {
    
    inline def setFirstParent(value: scala.Double): Self = StObject.set(x, "firstParent", value.asInstanceOf[js.Any])
    
    inline def setFullHistory(value: scala.Double): Self = StObject.set(x, "fullHistory", value.asInstanceOf[js.Any])
    
    inline def setFullHistorySimplifyMerges(value: scala.Double): Self = StObject.set(x, "fullHistorySimplifyMerges", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedHistory(value: scala.Double): Self = StObject.set(x, "simplifiedHistory", value.asInstanceOf[js.Any])
  }
}
