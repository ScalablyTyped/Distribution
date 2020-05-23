package typings.tern.ternMod

import typings.tern.ternStrings.`type`
import typings.tern.ternStrings.completions
import typings.tern.ternStrings.definition
import typings.tern.ternStrings.documentation
import typings.tern.ternStrings.files
import typings.tern.ternStrings.full
import typings.tern.ternStrings.properties
import typings.tern.ternStrings.refs
import typings.tern.ternStrings.rename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tern.ternMod.TypeQuery
  - typings.tern.ternMod.FilesQuery
  - typings.tern.ternMod.RefsQuery
  - typings.tern.ternMod.RenameQuery
  - typings.tern.ternMod.DefinitionQuery
  - typings.tern.ternMod.CompletionsQuery
  - typings.tern.ternMod.PropertiesQuery
  - typings.tern.ternMod.DocumentationQuery
*/
trait Query extends js.Object

object Query {
  @scala.inline
  def CompletionsQuery(
    end: Double | Position,
    file: String,
    `type`: completions,
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    depths: js.UndefOr[Boolean] = js.undefined,
    docFormat: full = null,
    docs: js.UndefOr[Boolean] = js.undefined,
    expandWordForward: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    guess: js.UndefOr[Boolean] = js.undefined,
    inLiteral: js.UndefOr[Boolean] = js.undefined,
    includeKeywords: js.UndefOr[Boolean] = js.undefined,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    omitObjectPrototype: js.UndefOr[Boolean] = js.undefined,
    origins: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined,
    types: js.UndefOr[Boolean] = js.undefined,
    urls: js.UndefOr[Boolean] = js.undefined
  ): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depths)) __obj.updateDynamic("depths")(depths.get.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(docs)) __obj.updateDynamic("docs")(docs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandWordForward)) __obj.updateDynamic("expandWordForward")(expandWordForward.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guess)) __obj.updateDynamic("guess")(guess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inLiteral)) __obj.updateDynamic("inLiteral")(inLiteral.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeKeywords)) __obj.updateDynamic("includeKeywords")(includeKeywords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(omitObjectPrototype)) __obj.updateDynamic("omitObjectPrototype")(omitObjectPrototype.get.asInstanceOf[js.Any])
    if (!js.isUndefined(origins)) __obj.updateDynamic("origins")(origins.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(types)) __obj.updateDynamic("types")(types.get.asInstanceOf[js.Any])
    if (!js.isUndefined(urls)) __obj.updateDynamic("urls")(urls.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def DefinitionQuery(
    end: Double | Position,
    file: String,
    `type`: definition,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def RenameQuery(
    end: Double | Position,
    file: String,
    newName: String,
    `type`: rename,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def FilesQuery(`type`: files, docFormat: full = null, lineCharPositions: js.UndefOr[Boolean] = js.undefined): Query = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def TypeQuery(
    end: Double | Position,
    file: String,
    `type`: `type`,
    depth: js.UndefOr[Double] = js.undefined,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    preferFunction: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preferFunction)) __obj.updateDynamic("preferFunction")(preferFunction.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def RefsQuery(
    end: Double | Position,
    file: String,
    `type`: refs,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def PropertiesQuery(
    `type`: properties,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    sort: js.UndefOr[Boolean] = js.undefined
  ): Query = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def DocumentationQuery(
    end: Double | Position,
    file: String,
    `type`: documentation,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

