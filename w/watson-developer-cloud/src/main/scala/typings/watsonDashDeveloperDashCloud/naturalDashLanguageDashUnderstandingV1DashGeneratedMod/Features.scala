package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Analysis features and options. */
trait Features extends js.Object {
  /** Returns a five-level taxonomy of the content. The top three categories are returned. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
  var categories: js.UndefOr[CategoriesOptions] = js.undefined
  /** Returns high-level concepts in the content. For example, a research paper about deep learning might return the concept, "Artificial Intelligence" although the term is not mentioned. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
  var concepts: js.UndefOr[ConceptsOptions] = js.undefined
  /** Detects anger, disgust, fear, joy, or sadness that is conveyed in the content or by the context around target phrases specified in the targets parameter. You can analyze emotion for detected entities with `entities.emotion` and for keywords with `keywords.emotion`. Supported languages: English. */
  var emotion: js.UndefOr[EmotionOptions] = js.undefined
  /** Identifies people, cities, organizations, and other entities in the content. See [Entity types and subtypes](https://cloud.ibm.com/docs/services/natural-language-understanding/entity-types.html). Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. Arabic, Chinese, and Dutch are supported only through custom models. */
  var entities: js.UndefOr[EntitiesOptions] = js.undefined
  /** Returns important keywords in the content. Supported languages: English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish, Swedish. */
  var keywords: js.UndefOr[KeywordsOptions] = js.undefined
  /** Returns information from the document, including author name, title, RSS/ATOM feeds, prominent page image, and publication date. Supports URL and HTML input types only. */
  var metadata: js.UndefOr[MetadataOptions] = js.undefined
  /** Recognizes when two entities are related and identifies the type of relation. For example, an `awardedTo` relation might connect the entities "Nobel Prize" and "Albert Einstein". See [Relation types](https://cloud.ibm.com/docs/services/natural-language-understanding/relations.html). Supported languages: Arabic, English, German, Japanese, Korean, Spanish. Chinese, Dutch, French, Italian, and Portuguese custom models are also supported. */
  var relations: js.UndefOr[RelationsOptions] = js.undefined
  /** Parses sentences into subject, action, and object form. Supported languages: English, German, Japanese, Korean, Spanish. */
  var semantic_roles: js.UndefOr[SemanticRolesOptions] = js.undefined
  /** Analyzes the general sentiment of your content or the sentiment toward specific target phrases. You can analyze sentiment for detected entities with `entities.sentiment` and for keywords with `keywords.sentiment`. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Russian, Spanish. */
  var sentiment: js.UndefOr[SentimentOptions] = js.undefined
  /** Returns tokens and sentences from the input text. */
  var syntax: js.UndefOr[SyntaxOptions] = js.undefined
}

object Features {
  @scala.inline
  def apply(
    categories: CategoriesOptions = null,
    concepts: ConceptsOptions = null,
    emotion: EmotionOptions = null,
    entities: EntitiesOptions = null,
    keywords: KeywordsOptions = null,
    metadata: MetadataOptions = null,
    relations: RelationsOptions = null,
    semantic_roles: SemanticRolesOptions = null,
    sentiment: SentimentOptions = null,
    syntax: SyntaxOptions = null
  ): Features = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (concepts != null) __obj.updateDynamic("concepts")(concepts.asInstanceOf[js.Any])
    if (emotion != null) __obj.updateDynamic("emotion")(emotion.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    if (semantic_roles != null) __obj.updateDynamic("semantic_roles")(semantic_roles.asInstanceOf[js.Any])
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
}

