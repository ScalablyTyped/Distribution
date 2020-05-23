package typings.yaml.mod

import typings.yaml.typesMod.Pair
import typings.yaml.typesMod.Schema.Name
import typings.yaml.typesMod.Schema.Tag
import typings.yaml.typesMod.Schema.TagId
import typings.yaml.yamlStrings.`1Dot0`
import typings.yaml.yamlStrings.`1Dot1`
import typings.yaml.yamlStrings.`1Dot2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.yaml.typesMod.Schema.Options {
  /**
    * Default prefix for anchors.
    *
    * Default: `'a'`, resulting in anchors `a1`, `a2`, etc.
    */
  var anchorPrefix: js.UndefOr[String] = js.undefined
  /**
    * The number of spaces to use when indenting code.
    *
    * Default: `2`
    */
  var indent: js.UndefOr[Double] = js.undefined
  /**
    * Whether block sequences should be indented.
    *
    * Default: `true`
    */
  var indentSeq: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow non-JSON JavaScript objects to remain in the `toJSON` output.
    * Relevant with the YAML 1.1 `!!timestamp` and `!!binary` tags as well as BigInts.
    *
    * Default: `true`
    */
  var keepBlobsInJSON: js.UndefOr[Boolean] = js.undefined
  /**
    * Include references in the AST to each node's corresponding CST node.
    *
    * Default: `false`
    */
  var keepCstNodes: js.UndefOr[Boolean] = js.undefined
  /**
    * Store the original node type when parsing documents.
    *
    * Default: `true`
    */
  var keepNodeTypes: js.UndefOr[Boolean] = js.undefined
  /**
    * When outputting JS, use Map rather than Object to represent mappings.
    *
    * Default: `false`
    */
  var mapAsMap: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent exponential entity expansion attacks by limiting data aliasing count;
    * set to `-1` to disable checks; `0` disallows all alias nodes.
    *
    * Default: `100`
    */
  var maxAliasCount: js.UndefOr[Double] = js.undefined
  /**
    * Include line position & node type directly in errors; drop their verbose source and context.
    *
    * Default: `false`
    */
  var prettyErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * When stringifying, require keys to be scalars and to use implicit rather than explicit notation.
    *
    * Default: `false`
    */
  var simpleKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * The YAML version used by documents without a `%YAML` directive.
    *
    * Default: `"1.2"`
    */
  var version: js.UndefOr[`1Dot0` | `1Dot1` | `1Dot2`] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    anchorPrefix: String = null,
    customTags: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]]) = null,
    indent: js.UndefOr[Double] = js.undefined,
    indentSeq: js.UndefOr[Boolean] = js.undefined,
    keepBlobsInJSON: js.UndefOr[Boolean] = js.undefined,
    keepCstNodes: js.UndefOr[Boolean] = js.undefined,
    keepNodeTypes: js.UndefOr[Boolean] = js.undefined,
    mapAsMap: js.UndefOr[Boolean] = js.undefined,
    maxAliasCount: js.UndefOr[Double] = js.undefined,
    merge: js.UndefOr[Boolean] = js.undefined,
    prettyErrors: js.UndefOr[Boolean] = js.undefined,
    schema: Name = null,
    simpleKeys: js.UndefOr[Boolean] = js.undefined,
    sortMapEntries: Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double]) = null,
    tags: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]]) = null,
    version: `1Dot0` | `1Dot1` | `1Dot2` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (anchorPrefix != null) __obj.updateDynamic("anchorPrefix")(anchorPrefix.asInstanceOf[js.Any])
    if (customTags != null) __obj.updateDynamic("customTags")(customTags.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentSeq)) __obj.updateDynamic("indentSeq")(indentSeq.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepBlobsInJSON)) __obj.updateDynamic("keepBlobsInJSON")(keepBlobsInJSON.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepCstNodes)) __obj.updateDynamic("keepCstNodes")(keepCstNodes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepNodeTypes)) __obj.updateDynamic("keepNodeTypes")(keepNodeTypes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mapAsMap)) __obj.updateDynamic("mapAsMap")(mapAsMap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAliasCount)) __obj.updateDynamic("maxAliasCount")(maxAliasCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyErrors)) __obj.updateDynamic("prettyErrors")(prettyErrors.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleKeys)) __obj.updateDynamic("simpleKeys")(simpleKeys.get.asInstanceOf[js.Any])
    if (sortMapEntries != null) __obj.updateDynamic("sortMapEntries")(sortMapEntries.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

