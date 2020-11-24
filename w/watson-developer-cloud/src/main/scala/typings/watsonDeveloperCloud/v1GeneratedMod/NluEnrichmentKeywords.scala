package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifying the Keyword enrichment and related parameters. */
@js.native
trait NluEnrichmentKeywords extends js.Object {
  
  /** When `true`, emotion detection of keywords will be performed on the specified field. */
  var emotion: js.UndefOr[Boolean] = js.native
  
  /** The maximum number of keywords to extract for each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
  
  /** When `true`, sentiment analysis of keywords will be performed on the specified field. */
  var sentiment: js.UndefOr[Boolean] = js.native
}
object NluEnrichmentKeywords {
  
  @scala.inline
  def apply(): NluEnrichmentKeywords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentKeywords]
  }
  
  @scala.inline
  implicit class NluEnrichmentKeywordsOps[Self <: NluEnrichmentKeywords] (val x: Self) extends AnyVal {
    
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
    def setEmotion(value: Boolean): Self = this.set("emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmotion: Self = this.set("emotion", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setSentiment(value: Boolean): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
  }
}
