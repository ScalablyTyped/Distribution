package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifying the sentiment extraction enrichment and related parameters. */
@js.native
trait NluEnrichmentSentiment extends js.Object {
  
  /** When `true`, sentiment analysis is performed on the entire field. */
  var document: js.UndefOr[Boolean] = js.native
  
  /** A comma-separated list of target strings that will have any associated sentiment analyzed. */
  var targets: js.UndefOr[js.Array[String]] = js.native
}
object NluEnrichmentSentiment {
  
  @scala.inline
  def apply(): NluEnrichmentSentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentSentiment]
  }
  
  @scala.inline
  implicit class NluEnrichmentSentimentOps[Self <: NluEnrichmentSentiment] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: Boolean): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Array[String]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
}
