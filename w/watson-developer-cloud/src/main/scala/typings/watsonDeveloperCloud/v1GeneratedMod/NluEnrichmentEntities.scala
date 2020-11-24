package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object speficying the Entities enrichment and related parameters. */
@js.native
trait NluEnrichmentEntities extends js.Object {
  
  /** When `true`, emotion detection of entities will be performed on the specified field. */
  var emotion: js.UndefOr[Boolean] = js.native
  
  /** The maximum number of entities to extract for each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
  
  /** When `true`, the types of mentions for each idetifieid entity is recorded. The default is `false`. */
  var mention_types: js.UndefOr[Boolean] = js.native
  
  /** When `true`, the number of mentions of each identified entity is recorded. The default is `false`. */
  var mentions: js.UndefOr[Boolean] = js.native
  
  /** The enrichement model to use with entity extraction. May be a custom model provided by Watson Knowledge Studio, the public model for use with Knowledge Graph `en-news`, or the default public model `alchemy`. */
  var model: js.UndefOr[String] = js.native
  
  /** When `true`, a list of sentence locations for each instance of each identified entity is recorded. The default is `false`. */
  var sentence_locations: js.UndefOr[Boolean] = js.native
  
  /** When `true`, sentiment analysis of entities will be performed on the specified field. */
  var sentiment: js.UndefOr[Boolean] = js.native
}
object NluEnrichmentEntities {
  
  @scala.inline
  def apply(): NluEnrichmentEntities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentEntities]
  }
  
  @scala.inline
  implicit class NluEnrichmentEntitiesOps[Self <: NluEnrichmentEntities] (val x: Self) extends AnyVal {
    
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
    def setMention_types(value: Boolean): Self = this.set("mention_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMention_types: Self = this.set("mention_types", js.undefined)
    
    @scala.inline
    def setMentions(value: Boolean): Self = this.set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSentence_locations(value: Boolean): Self = this.set("sentence_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentence_locations: Self = this.set("sentence_locations", js.undefined)
    
    @scala.inline
    def setSentiment(value: Boolean): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
  }
}
