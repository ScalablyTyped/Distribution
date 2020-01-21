package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** Analysis results for each requested feature. */
trait AnalysisResults extends js.Object {
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
  def apply(
    analyzed_text: String = null,
    categories: js.Array[CategoriesResult] = null,
    concepts: js.Array[ConceptsResult] = null,
    emotion: EmotionResult = null,
    entities: js.Array[EntitiesResult] = null,
    keywords: js.Array[KeywordsResult] = null,
    language: String = null,
    metadata: AnalysisResultsMetadata = null,
    relations: js.Array[RelationsResult] = null,
    retrieved_url: String = null,
    semantic_roles: js.Array[SemanticRolesResult] = null,
    sentiment: SentimentResult = null,
    syntax: SyntaxResult = null,
    usage: AnalysisResultsUsage = null
  ): AnalysisResults = {
    val __obj = js.Dynamic.literal()
    if (analyzed_text != null) __obj.updateDynamic("analyzed_text")(analyzed_text.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (concepts != null) __obj.updateDynamic("concepts")(concepts.asInstanceOf[js.Any])
    if (emotion != null) __obj.updateDynamic("emotion")(emotion.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    if (retrieved_url != null) __obj.updateDynamic("retrieved_url")(retrieved_url.asInstanceOf[js.Any])
    if (semantic_roles != null) __obj.updateDynamic("semantic_roles")(semantic_roles.asInstanceOf[js.Any])
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisResults]
  }
}

