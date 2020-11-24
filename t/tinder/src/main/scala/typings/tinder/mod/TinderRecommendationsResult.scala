package typings.tinder.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When out of recommendations it is set to "out of recs", a possible value is also "recs timeout",
  * otherwise does not seem to be used
  */
@js.native
trait TinderRecommendationsResult extends js.Object {
  
  var message: js.UndefOr[String] = js.native
  
  var results: js.Array[TinderRecommendation] = js.native
  
  var status: Number = js.native
}
object TinderRecommendationsResult {
  
  @scala.inline
  def apply(results: js.Array[TinderRecommendation], status: Number): TinderRecommendationsResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderRecommendationsResult]
  }
  
  @scala.inline
  implicit class TinderRecommendationsResultOps[Self <: TinderRecommendationsResult] (val x: Self) extends AnyVal {
    
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
    def setResultsVarargs(value: TinderRecommendation*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[TinderRecommendation]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Number): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
