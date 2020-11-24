package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The important people, places, geopolitical entities and other types of entities in your content. */
@js.native
trait EntitiesResult extends js.Object {
  
  /** How many times the entity was mentioned in the text. */
  var count: js.UndefOr[Double] = js.native
  
  /** Disambiguation information for the entity. */
  var disambiguation: js.UndefOr[DisambiguationResult] = js.native
  
  /** Emotion analysis results for the entity, enabled with the `emotion` option. */
  var emotion: js.UndefOr[EmotionScores] = js.native
  
  /** Entity mentions and locations. */
  var mentions: js.UndefOr[js.Array[EntityMention]] = js.native
  
  /** Relevance score from 0 to 1. Higher values indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.native
  
  /** Sentiment analysis results for the entity, enabled with the `sentiment` option. */
  var sentiment: js.UndefOr[FeatureSentimentResults] = js.native
  
  /** The name of the entity. */
  var text: js.UndefOr[String] = js.native
  
  /** Entity type. */
  var `type`: js.UndefOr[String] = js.native
}
object EntitiesResult {
  
  @scala.inline
  def apply(): EntitiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitiesResult]
  }
  
  @scala.inline
  implicit class EntitiesResultOps[Self <: EntitiesResult] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setDisambiguation(value: DisambiguationResult): Self = this.set("disambiguation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisambiguation: Self = this.set("disambiguation", js.undefined)
    
    @scala.inline
    def setEmotion(value: EmotionScores): Self = this.set("emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmotion: Self = this.set("emotion", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: EntityMention*): Self = this.set("mentions", js.Array(value :_*))
    
    @scala.inline
    def setMentions(value: js.Array[EntityMention]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
    
    @scala.inline
    def setSentiment(value: FeatureSentimentResults): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
