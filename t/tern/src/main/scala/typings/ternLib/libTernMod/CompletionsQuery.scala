package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionsQuery extends BaseQueryWithFile {
  /** Whether to use a case-insensitive compare between the current word and potential completions. Default `false` */
  var caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to include the distance (in scopes for variables, in prototypes for properties) between the completions and the origin position in the result data. Default `false` */
  var depths: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to include documentation strings in the result data. Default `false` */
  var docs: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the location to complete at. */
  var end: scala.Double | Position
  /**
    * When disabled, only the text before the given position is considered part of the word. When enabled (the default),
    * the whole variable name that the cursor is on will be included. Default `true`
    */
  var expandWordForward: js.UndefOr[scala.Boolean] = js.undefined
  /** When on, only completions that match the current word at the given point will be returned. Turn this off to get all results, so that you can filter on the client side. Default `true` */
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  /** When completing a property and no completions are found, Tern will use some heuristics to try and return some properties anyway. Set this to `false` to turn that off. Default `true` */
  var guess: js.UndefOr[scala.Boolean] = js.undefined
  /** If completions should be returned when inside a literal. Default `true` */
  var inLiteral: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to include JavaScript keywords when completing something that is not a property. Default `false` */
  var includeKeywords: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to ignore the properties of `Object.prototype` unless they have been spelled out by at least two characters. Default `true` */
  var omitObjectPrototype: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to include origin files (if found) in the result data. Default `false` */
  var origins: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines whether the result set will be sorted. Default `true` */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  /** Asks the server for a set of completions at the given point. */
  @JSName("type")
  var type_CompletionsQuery: ternLib.ternLibStrings.completions
  /** Whether to include the types of the completions in the result data. Default `false` */
  var types: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to include urls in the result data. Default `false` */
  var urls: js.UndefOr[scala.Boolean] = js.undefined
}

object CompletionsQuery {
  @scala.inline
  def apply(
    end: scala.Double | Position,
    file: java.lang.String,
    `type`: ternLib.ternLibStrings.completions,
    caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined,
    depths: js.UndefOr[scala.Boolean] = js.undefined,
    docFormat: ternLib.ternLibStrings.full = null,
    docs: js.UndefOr[scala.Boolean] = js.undefined,
    expandWordForward: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    guess: js.UndefOr[scala.Boolean] = js.undefined,
    inLiteral: js.UndefOr[scala.Boolean] = js.undefined,
    includeKeywords: js.UndefOr[scala.Boolean] = js.undefined,
    lineCharPositions: js.UndefOr[scala.Boolean] = js.undefined,
    omitObjectPrototype: js.UndefOr[scala.Boolean] = js.undefined,
    origins: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.UndefOr[scala.Boolean] = js.undefined,
    types: js.UndefOr[scala.Boolean] = js.undefined,
    urls: js.UndefOr[scala.Boolean] = js.undefined
  ): CompletionsQuery = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("file")(file)
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive)
    if (!js.isUndefined(depths)) __obj.updateDynamic("depths")(depths)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(docs)) __obj.updateDynamic("docs")(docs)
    if (!js.isUndefined(expandWordForward)) __obj.updateDynamic("expandWordForward")(expandWordForward)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(guess)) __obj.updateDynamic("guess")(guess)
    if (!js.isUndefined(inLiteral)) __obj.updateDynamic("inLiteral")(inLiteral)
    if (!js.isUndefined(includeKeywords)) __obj.updateDynamic("includeKeywords")(includeKeywords)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    if (!js.isUndefined(omitObjectPrototype)) __obj.updateDynamic("omitObjectPrototype")(omitObjectPrototype)
    if (!js.isUndefined(origins)) __obj.updateDynamic("origins")(origins)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(types)) __obj.updateDynamic("types")(types)
    if (!js.isUndefined(urls)) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[CompletionsQuery]
  }
}

