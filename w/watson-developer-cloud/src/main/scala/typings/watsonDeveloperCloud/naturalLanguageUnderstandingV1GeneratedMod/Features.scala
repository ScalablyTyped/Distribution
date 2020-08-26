package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Analysis features and options. */
@js.native
trait Features extends js.Object {
  /** Returns a five-level taxonomy of the content. The top three categories are returned. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
  var categories: js.UndefOr[CategoriesOptions] = js.native
  /** Returns high-level concepts in the content. For example, a research paper about deep learning might return the concept, "Artificial Intelligence" although the term is not mentioned. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
  var concepts: js.UndefOr[ConceptsOptions] = js.native
  /** Detects anger, disgust, fear, joy, or sadness that is conveyed in the content or by the context around target phrases specified in the targets parameter. You can analyze emotion for detected entities with `entities.emotion` and for keywords with `keywords.emotion`. Supported languages: English. */
  var emotion: js.UndefOr[EmotionOptions] = js.native
  /** Identifies people, cities, organizations, and other entities in the content. See [Entity types and subtypes](https://cloud.ibm.com/docs/services/natural-language-understanding/entity-types.html). Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. Arabic, Chinese, and Dutch are supported only through custom models. */
  var entities: js.UndefOr[EntitiesOptions] = js.native
  /** Returns important keywords in the content. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. */
  var keywords: js.UndefOr[KeywordsOptions] = js.native
  /** Returns information from the document, including author name, title, RSS/ATOM feeds, prominent page image, and publication date. Supports URL and HTML input types only. */
  var metadata: js.UndefOr[MetadataOptions] = js.native
  /** Recognizes when two entities are related and identifies the type of relation. For example, an `awardedTo` relation might connect the entities "Nobel Prize" and "Albert Einstein". See [Relation types](https://cloud.ibm.com/docs/services/natural-language-understanding/relations.html). Supported languages: Arabic, English, German, Japanese, Korean, Spanish. Chinese, Dutch, French, Italian, and Portuguese custom models are also supported. */
  var relations: js.UndefOr[RelationsOptions] = js.native
  /** Parses sentences into subject, action, and object form. Supported languages: English, German, Japanese, Korean, Spanish. */
  var semantic_roles: js.UndefOr[SemanticRolesOptions] = js.native
  /** Analyzes the general sentiment of your content or the sentiment toward specific target phrases. You can analyze sentiment for detected entities with `entities.sentiment` and for keywords with `keywords.sentiment`. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish. */
  var sentiment: js.UndefOr[SentimentOptions] = js.native
  /** Returns tokens and sentences from the input text. */
  var syntax: js.UndefOr[SyntaxOptions] = js.native
}

object Features {
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
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
    def setCategories(value: CategoriesOptions): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setConcepts(value: ConceptsOptions): Self = this.set("concepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcepts: Self = this.set("concepts", js.undefined)
    @scala.inline
    def setEmotion(value: EmotionOptions): Self = this.set("emotion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmotion: Self = this.set("emotion", js.undefined)
    @scala.inline
    def setEntities(value: EntitiesOptions): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setKeywords(value: KeywordsOptions): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setMetadata(value: MetadataOptions): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setRelations(value: RelationsOptions): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
    @scala.inline
    def setSemantic_roles(value: SemanticRolesOptions): Self = this.set("semantic_roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemantic_roles: Self = this.set("semantic_roles", js.undefined)
    @scala.inline
    def setSentiment(value: SentimentOptions): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
    @scala.inline
    def setSyntax(value: SyntaxOptions): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
  
}

