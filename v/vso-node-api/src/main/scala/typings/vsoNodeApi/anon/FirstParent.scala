package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstParent extends js.Object {
  
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
  implicit class FirstParentOps[Self <: FirstParent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirstParent(value: scala.Double): Self = this.set("firstParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullHistory(value: scala.Double): Self = this.set("fullHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullHistorySimplifyMerges(value: scala.Double): Self = this.set("fullHistorySimplifyMerges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplifiedHistory(value: scala.Double): Self = this.set("simplifiedHistory", value.asInstanceOf[js.Any])
  }
}
