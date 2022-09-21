package typings.synchronousAutocomplete

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Fast, simple [autocompletion](https://en.wikipedia.org/wiki/Autocomplete). Also supports
    * [Levenshtein](https://en.wikipedia.org/wiki/Levenshtein_distance)-based fuzzy search.
    * Uses precomputed indexes to be fast.
    *
    * Let's understand the terminology used by this tool:
    *
    * - *item*: A thing to search for. In our example, apple, banana and pomegranate each are an *item*.
    * - *weight*: How important an *item* is.
    * - *token*: A word from the fully normalized item name. For example, to find an item named `Hey There!`,
    *   you may process its name into the *tokens* `hey` & `there`.
    * - *fragment*: A word from the normalized search query, which may partially match a *token*. E.g. the
    *   *fragment* `ther` (from the search query `Hey Ther`) partially matches the *token* `there`.
    * - *relevance*: How well an item fits to the search query.
    * - *score*: A combination of an item's *weight* and *relevance*. Used to rank search results.
    *
    * @param tokens Must be an object with an array of internal *item* IDs per *token*.
    * @param scores Must be an object with a *token* score per *token*.
    * @param weights Must be an array with an *item* weight per internal *item* ID.
    * @param nrOfTokens Must be an array with the number of *tokens* per internal *item* ID.
    * @param originalIds Must be an array with the (real) *item* ID per internal *item* ID.
    * @param tokenizerFn Must be a function that, given a search query, returns an array of *fragments*.
    *
    * @example
    * import createAutocomplete = require('synchronous-autocomplete');
    * import normalize = require('normalize-for-search');
    *
    * const items = [ {
    *   id: 'apple',
    *   name: 'Juicy sour Apple.',
    *   weight: 3
    * }, {
    *   id: 'banana',
    *   name: 'Sweet juicy Banana!',
    *   weight: 2
    * }, {
    *   id: 'pome',
    *   name: 'Sour Pomegranate',
    *   weight: 5
    * } ];
    *
    * const tokens = { // internal item IDs, by token
    *   juicy: [0, 1],
    *   sour: [0, 3],
    *   apple: [0],
    *   sweet: [1],
    *   banana: [1],
    *   pomegranate: [3]
    * };
    * const weights = [ // item weights, by internal item ID
    *   3, // apple
    *   2, // banana
    *   5 // pome
    * ];
    * const nrOfTokens = [ // nr of tokens, by internal item ID
    *   3, // apple
    *   3, // banana
    *   2 // pome
    * ];
    * const scores = { // "uniqueness" of each token, by token
    *   juicy: 2 / 3, // 2 out of 3 items have the token "juicy"
    *   sour: 2 / 3,
    *   apple: 1 / 3,
    *   sweet: 1 / 3,
    *   banana: 1 / 3,
    *   pomegranate: 1 / 3
    * };
    * // In order to create smaller search indexes, we use numerical item IDs
    * // internally and maintain a mapping to their "real"/original IDs.
    * const originalIds = [
    *   'apple',
    *   'banana',
    *   'pome'
    * ];
    * const tokenize = (str: string) => {
    *   return normalize(str).replace(/[^\w\s]/g, '').split(/\s+/g);
    * }
    *
    * const autocomplete = createAutocomplete(tokens, scores, weights, nrOfTokens, originalIds, tokenize);
    *
    * autocomplete('bana');
    * // [ {
    * //   id: 'banana',
    * //   relevance: 0.66667,
    * //   score: 0.83995
    * // } ]
    *
    * autocomplete('sour');
    * // [ {
    * //   id: 'pomegranate',
    * //   relevance: 1.83333,
    * //   score: 3.13496
    * // }, {
    * //   id: 'apple',
    * //   relevance: 1.22222,
    * //   score: 1.76275
    * // } ]
    *
    * autocomplete('aplle', 3, true); // note the typo
    * // [ {
    * //   id: 'apple',
    * //   relevance: 0.22222,
    * //   score: 0.3205
    * // } ]
    */
  inline def apply[TId /* <: String */](
    tokens: Tokens,
    scores: Scores,
    weights: Weights,
    nrOfTokens: NrOfTokens,
    originalIds: OriginalIds[TId],
    tokenizerFn: TokenizerFn
  ): AutocompleteFn[TId] = (^.asInstanceOf[js.Dynamic].apply(tokens.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], nrOfTokens.asInstanceOf[js.Any], originalIds.asInstanceOf[js.Any], tokenizerFn.asInstanceOf[js.Any])).asInstanceOf[AutocompleteFn[TId]]
  
  @JSImport("synchronous-autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait AutocompleteFn[TId /* <: String */] extends StObject {
    
    def apply(query: String): js.Array[AutocompleteResult[TId]] = js.native
    def apply(query: String, /** @default 6 */
    limit: Double): js.Array[AutocompleteResult[TId]] = js.native
    def apply(query: String, /** @default 6 */
    limit: Double, /** @default false */
    fuzzy: Boolean): js.Array[AutocompleteResult[TId]] = js.native
    def apply(
      query: String,
      /** @default 6 */
    limit: Double,
      /** @default false */
    fuzzy: Boolean,
      /** @default true */
    completion: Boolean
    ): js.Array[AutocompleteResult[TId]] = js.native
    def apply(
      query: String,
      /** @default 6 */
    limit: Double,
      /** @default false */
    fuzzy: Unit,
      /** @default true */
    completion: Boolean
    ): js.Array[AutocompleteResult[TId]] = js.native
    def apply(query: String, /** @default 6 */
    limit: Unit, /** @default false */
    fuzzy: Boolean): js.Array[AutocompleteResult[TId]] = js.native
    def apply(
      query: String,
      /** @default 6 */
    limit: Unit,
      /** @default false */
    fuzzy: Boolean,
      /** @default true */
    completion: Boolean
    ): js.Array[AutocompleteResult[TId]] = js.native
    def apply(
      query: String,
      /** @default 6 */
    limit: Unit,
      /** @default false */
    fuzzy: Unit,
      /** @default true */
    completion: Boolean
    ): js.Array[AutocompleteResult[TId]] = js.native
    
    def byFragment(fragment: String): js.Array[Double] = js.native
    def byFragment(fragment: String, completion: Boolean): js.Array[Double] = js.native
    def byFragment(fragment: String, completion: Boolean, fuzzy: Boolean): js.Array[Double] = js.native
    def byFragment(fragment: String, completion: Unit, fuzzy: Boolean): js.Array[Double] = js.native
    
    val internalId: js.Symbol = js.native
  }
  
  @js.native
  trait AutocompleteResult[TId /* <: String */] extends StObject {
    
    var id: TId = js.native
    
    var relevance: Double = js.native
    
    var score: Double = js.native
    
    var weight: Double = js.native
  }
  
  type NrOfTokens = js.Array[Double]
  
  type OriginalIds[TId /* <: String */] = js.Array[TId]
  
  type Scores = StringDictionary[Double]
  
  type TokenizerFn = js.Function1[/* str */ String, js.Array[String]]
  
  type Tokens = StringDictionary[js.Array[Double]]
  
  type Weights = js.Array[Double]
}
