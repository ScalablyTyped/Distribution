package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** Analysis results for each requested feature. */
@js.native
trait AnalysisResults extends js.Object {
  /** Text that was used in the analysis. */
  var analyzed_text: js.UndefOr[String] = js.native
  /** The categories that the service assigned to the analyzed text. */
  var categories: js.UndefOr[js.Array[CategoriesResult]] = js.native
  /** The general concepts referenced or alluded to in the analyzed text. */
  var concepts: js.UndefOr[js.Array[ConceptsResult]] = js.native
  /** The anger, disgust, fear, joy, or sadness conveyed by the content. */
  var emotion: js.UndefOr[EmotionResult] = js.native
  /** The entities detected in the analyzed text. */
  var entities: js.UndefOr[js.Array[EntitiesResult]] = js.native
  /** The keywords from the analyzed text. */
  var keywords: js.UndefOr[js.Array[KeywordsResult]] = js.native
  /** Language used to analyze the text. */
  var language: js.UndefOr[String] = js.native
  /** Webpage metadata, such as the author and the title of the page. */
  var metadata: js.UndefOr[AnalysisResultsMetadata] = js.native
  /** The relationships between entities in the content. */
  var relations: js.UndefOr[js.Array[RelationsResult]] = js.native
  /** URL of the webpage that was analyzed. */
  var retrieved_url: js.UndefOr[String] = js.native
  /** Sentences parsed into `subject`, `action`, and `object` form. */
  var semantic_roles: js.UndefOr[js.Array[SemanticRolesResult]] = js.native
  /** The sentiment of the content. */
  var sentiment: js.UndefOr[SentimentResult] = js.native
  /** Tokens and sentences returned from syntax analysis. */
  var syntax: js.UndefOr[SyntaxResult] = js.native
  /** API usage information for the request. */
  var usage: js.UndefOr[AnalysisResultsUsage] = js.native
}

object AnalysisResults {
  @scala.inline
  def apply(): AnalysisResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResults]
  }
  @scala.inline
  implicit class AnalysisResultsOps[Self <: AnalysisResults] (val x: Self) extends AnyVal {
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
    def setAnalyzed_text(value: String): Self = this.set("analyzed_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyzed_text: Self = this.set("analyzed_text", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: CategoriesResult*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[CategoriesResult]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setConceptsVarargs(value: ConceptsResult*): Self = this.set("concepts", js.Array(value :_*))
    @scala.inline
    def setConcepts(value: js.Array[ConceptsResult]): Self = this.set("concepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcepts: Self = this.set("concepts", js.undefined)
    @scala.inline
    def setEmotion(value: EmotionResult): Self = this.set("emotion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmotion: Self = this.set("emotion", js.undefined)
    @scala.inline
    def setEntitiesVarargs(value: EntitiesResult*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[EntitiesResult]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setKeywordsVarargs(value: KeywordsResult*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[KeywordsResult]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMetadata(value: AnalysisResultsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setRelationsVarargs(value: RelationsResult*): Self = this.set("relations", js.Array(value :_*))
    @scala.inline
    def setRelations(value: js.Array[RelationsResult]): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
    @scala.inline
    def setRetrieved_url(value: String): Self = this.set("retrieved_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrieved_url: Self = this.set("retrieved_url", js.undefined)
    @scala.inline
    def setSemantic_rolesVarargs(value: SemanticRolesResult*): Self = this.set("semantic_roles", js.Array(value :_*))
    @scala.inline
    def setSemantic_roles(value: js.Array[SemanticRolesResult]): Self = this.set("semantic_roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemantic_roles: Self = this.set("semantic_roles", js.undefined)
    @scala.inline
    def setSentiment(value: SentimentResult): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
    @scala.inline
    def setSyntax(value: SyntaxResult): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
    @scala.inline
    def setUsage(value: AnalysisResultsUsage): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
  
}

