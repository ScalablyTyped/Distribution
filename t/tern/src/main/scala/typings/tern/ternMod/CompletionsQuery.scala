package typings.tern.ternMod

import typings.tern.ternStrings.completions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionsQuery
  extends BaseQueryWithFile
     with Query {
  
  /** Whether to use a case-insensitive compare between the current word and potential completions. Default `false` */
  var caseInsensitive: js.UndefOr[Boolean] = js.native
  
  /** Whether to include the distance (in scopes for variables, in prototypes for properties) between the completions and the origin position in the result data. Default `false` */
  var depths: js.UndefOr[Boolean] = js.native
  
  /** Whether to include documentation strings in the result data. Default `false` */
  var docs: js.UndefOr[Boolean] = js.native
  
  /** Specify the location to complete at. */
  var end: Double | Position = js.native
  
  /**
    * When disabled, only the text before the given position is considered part of the word. When enabled (the default),
    * the whole variable name that the cursor is on will be included. Default `true`
    */
  var expandWordForward: js.UndefOr[Boolean] = js.native
  
  /** When on, only completions that match the current word at the given point will be returned. Turn this off to get all results, so that you can filter on the client side. Default `true` */
  var filter: js.UndefOr[Boolean] = js.native
  
  /** When completing a property and no completions are found, Tern will use some heuristics to try and return some properties anyway. Set this to `false` to turn that off. Default `true` */
  var guess: js.UndefOr[Boolean] = js.native
  
  /** If completions should be returned when inside a literal. Default `true` */
  var inLiteral: js.UndefOr[Boolean] = js.native
  
  /** Whether to include JavaScript keywords when completing something that is not a property. Default `false` */
  var includeKeywords: js.UndefOr[Boolean] = js.native
  
  /** Whether to ignore the properties of `Object.prototype` unless they have been spelled out by at least two characters. Default `true` */
  var omitObjectPrototype: js.UndefOr[Boolean] = js.native
  
  /** Whether to include origin files (if found) in the result data. Default `false` */
  var origins: js.UndefOr[Boolean] = js.native
  
  /** Determines whether the result set will be sorted. Default `true` */
  var sort: js.UndefOr[Boolean] = js.native
  
  /** Asks the server for a set of completions at the given point. */
  @JSName("type")
  var type_CompletionsQuery: completions = js.native
  
  /** Whether to include the types of the completions in the result data. Default `false` */
  var types: js.UndefOr[Boolean] = js.native
  
  /** Whether to include urls in the result data. Default `false` */
  var urls: js.UndefOr[Boolean] = js.native
}
object CompletionsQuery {
  
  @scala.inline
  def apply(end: Double | Position, file: String, `type`: completions): CompletionsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionsQuery]
  }
  
  @scala.inline
  implicit class CompletionsQueryMutableBuilder[Self <: CompletionsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
    
    @scala.inline
    def setDepths(value: Boolean): Self = StObject.set(x, "depths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthsUndefined: Self = StObject.set(x, "depths", js.undefined)
    
    @scala.inline
    def setDocs(value: Boolean): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    @scala.inline
    def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandWordForward(value: Boolean): Self = StObject.set(x, "expandWordForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandWordForwardUndefined: Self = StObject.set(x, "expandWordForward", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGuess(value: Boolean): Self = StObject.set(x, "guess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuessUndefined: Self = StObject.set(x, "guess", js.undefined)
    
    @scala.inline
    def setInLiteral(value: Boolean): Self = StObject.set(x, "inLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInLiteralUndefined: Self = StObject.set(x, "inLiteral", js.undefined)
    
    @scala.inline
    def setIncludeKeywords(value: Boolean): Self = StObject.set(x, "includeKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeKeywordsUndefined: Self = StObject.set(x, "includeKeywords", js.undefined)
    
    @scala.inline
    def setOmitObjectPrototype(value: Boolean): Self = StObject.set(x, "omitObjectPrototype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitObjectPrototypeUndefined: Self = StObject.set(x, "omitObjectPrototype", js.undefined)
    
    @scala.inline
    def setOrigins(value: Boolean): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: completions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: Boolean): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setUrls(value: Boolean): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
  }
}
