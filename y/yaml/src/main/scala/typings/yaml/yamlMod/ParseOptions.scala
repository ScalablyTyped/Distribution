package typings.yaml.yamlMod

import typings.yaml.yamlStrings.`yaml-1DOT1`
import typings.yaml.yamlStrings.core
import typings.yaml.yamlStrings.failsafe
import typings.yaml.yamlStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
    * Allow non-JSON JavaScript objects to remain in the `toJSON` output.
    * Relevant with the YAML 1.1 `!!timestamp` and `!!binary` tags. By default `true`.
    */
  var keepBlobsInJSON: js.UndefOr[Boolean] = js.undefined
  /**
    * Include references in the AST to each node's corresponding CST node. By default `false`.
    */
  var keepCstNodes: js.UndefOr[Boolean] = js.undefined
  /**
    * Store the original node type when parsing documents. By default `true`.
    */
  var keepNodeTypes: js.UndefOr[Boolean] = js.undefined
  /**
    * When outputting JS, use Map rather than Object to represent mappings. By default `false`.
    */
  var mapAsMap: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable support for `<<` merge keys.
    */
  var merge: js.UndefOr[Boolean] = js.undefined
  /**
    * The base schema to use. By default `"core"` for YAML 1.2 and `"yaml-1.1"` for earlier versions.
    */
  var schema: js.UndefOr[core | failsafe | json | `yaml-1DOT1`] = js.undefined
  /**
    * Array of additional (custom) tags to include in the schema.
    */
  var tags: js.UndefOr[js.Array[Tag] | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])] = js.undefined
  /**
    * The YAML version used by documents without a `%YAML` directive. By default `"1.2"`.
    */
  var version: js.UndefOr[String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    keepBlobsInJSON: js.UndefOr[Boolean] = js.undefined,
    keepCstNodes: js.UndefOr[Boolean] = js.undefined,
    keepNodeTypes: js.UndefOr[Boolean] = js.undefined,
    mapAsMap: js.UndefOr[Boolean] = js.undefined,
    merge: js.UndefOr[Boolean] = js.undefined,
    schema: core | failsafe | json | `yaml-1DOT1` = null,
    tags: js.Array[Tag] | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]]) = null,
    version: String = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepBlobsInJSON)) __obj.updateDynamic("keepBlobsInJSON")(keepBlobsInJSON)
    if (!js.isUndefined(keepCstNodes)) __obj.updateDynamic("keepCstNodes")(keepCstNodes)
    if (!js.isUndefined(keepNodeTypes)) __obj.updateDynamic("keepNodeTypes")(keepNodeTypes)
    if (!js.isUndefined(mapAsMap)) __obj.updateDynamic("mapAsMap")(mapAsMap)
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ParseOptions]
  }
}

