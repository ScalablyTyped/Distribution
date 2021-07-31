package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** Analysis results for each requested feature. */
trait AnalysisResults extends StObject {
  
  /** Text that was used in the analysis. */
  var analyzed_text: js.UndefOr[String] = js.undefined
  
  /** The categories that the service assigned to the analyzed text. */
  var categories: js.UndefOr[js.Array[CategoriesResult]] = js.undefined
  
  /** The general concepts referenced or alluded to in the analyzed text. */
  var concepts: js.UndefOr[js.Array[ConceptsResult]] = js.undefined
  
  /** The anger, disgust, fear, joy, or sadness conveyed by the content. */
  var emotion: js.UndefOr[EmotionResult] = js.undefined
  
  /** The entities detected in the analyzed text. */
  var entities: js.UndefOr[js.Array[EntitiesResult]] = js.undefined
  
  /** The keywords from the analyzed text. */
  var keywords: js.UndefOr[js.Array[KeywordsResult]] = js.undefined
  
  /** Language used to analyze the text. */
  var language: js.UndefOr[String] = js.undefined
  
  /** Webpage metadata, such as the author and the title of the page. */
  var metadata: js.UndefOr[AnalysisResultsMetadata] = js.undefined
  
  /** The relationships between entities in the content. */
  var relations: js.UndefOr[js.Array[RelationsResult]] = js.undefined
  
  /** URL of the webpage that was analyzed. */
  var retrieved_url: js.UndefOr[String] = js.undefined
  
  /** Sentences parsed into `subject`, `action`, and `object` form. */
  var semantic_roles: js.UndefOr[js.Array[SemanticRolesResult]] = js.undefined
  
  /** The sentiment of the content. */
  var sentiment: js.UndefOr[SentimentResult] = js.undefined
  
  /** Tokens and sentences returned from syntax analysis. */
  var syntax: js.UndefOr[SyntaxResult] = js.undefined
  
  /** API usage information for the request. */
  var usage: js.UndefOr[AnalysisResultsUsage] = js.undefined
}
object AnalysisResults {
  
  @scala.inline
  def apply(): AnalysisResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResults]
  }
  
  @scala.inline
  implicit class AnalysisResultsMutableBuilder[Self <: AnalysisResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzed_text(value: String): Self = StObject.set(x, "analyzed_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzed_textUndefined: Self = StObject.set(x, "analyzed_text", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Array[CategoriesResult]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: CategoriesResult*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setConcepts(value: js.Array[ConceptsResult]): Self = StObject.set(x, "concepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConceptsUndefined: Self = StObject.set(x, "concepts", js.undefined)
    
    @scala.inline
    def setConceptsVarargs(value: ConceptsResult*): Self = StObject.set(x, "concepts", js.Array(value :_*))
    
    @scala.inline
    def setEmotion(value: EmotionResult): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    @scala.inline
    def setEntities(value: js.Array[EntitiesResult]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: EntitiesResult*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[KeywordsResult]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: KeywordsResult*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMetadata(value: AnalysisResultsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setRelations(value: js.Array[RelationsResult]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    @scala.inline
    def setRelationsVarargs(value: RelationsResult*): Self = StObject.set(x, "relations", js.Array(value :_*))
    
    @scala.inline
    def setRetrieved_url(value: String): Self = StObject.set(x, "retrieved_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieved_urlUndefined: Self = StObject.set(x, "retrieved_url", js.undefined)
    
    @scala.inline
    def setSemantic_roles(value: js.Array[SemanticRolesResult]): Self = StObject.set(x, "semantic_roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemantic_rolesUndefined: Self = StObject.set(x, "semantic_roles", js.undefined)
    
    @scala.inline
    def setSemantic_rolesVarargs(value: SemanticRolesResult*): Self = StObject.set(x, "semantic_roles", js.Array(value :_*))
    
    @scala.inline
    def setSentiment(value: SentimentResult): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    @scala.inline
    def setSyntax(value: SyntaxResult): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    @scala.inline
    def setUsage(value: AnalysisResultsUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
