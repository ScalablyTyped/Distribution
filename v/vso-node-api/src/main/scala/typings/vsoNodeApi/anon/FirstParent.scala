package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstParent extends StObject {
  
  var firstParent: scala.Double = js.native
  
  var fullHistory: scala.Double = js.native
  
  var fullHistorySimplifyMerges: scala.Double = js.native
  
  var simplifiedHistory: scala.Double = js.native
}
object FirstParent {
  
  @scala.inline
  def apply(
    firstParent: scala.Double,
    fullHistory: scala.Double,
    fullHistorySimplifyMerges: scala.Double,
    simplifiedHistory: scala.Double
  ): FirstParent = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], fullHistory = fullHistory.asInstanceOf[js.Any], fullHistorySimplifyMerges = fullHistorySimplifyMerges.asInstanceOf[js.Any], simplifiedHistory = simplifiedHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstParent]
  }
  
  @scala.inline
  implicit class FirstParentMutableBuilder[Self <: FirstParent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstParent(value: scala.Double): Self = StObject.set(x, "firstParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullHistory(value: scala.Double): Self = StObject.set(x, "fullHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullHistorySimplifyMerges(value: scala.Double): Self = StObject.set(x, "fullHistorySimplifyMerges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplifiedHistory(value: scala.Double): Self = StObject.set(x, "simplifiedHistory", value.asInstanceOf[js.Any])
  }
}
