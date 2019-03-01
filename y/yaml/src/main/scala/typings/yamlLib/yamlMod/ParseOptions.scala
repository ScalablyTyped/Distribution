package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
    * Allow non-JSON JavaScript objects to remain in the `toJSON` output.
    * Relevant with the YAML 1.1 `!!timestamp` and `!!binary` tags. By default `true`.
    */
  var keepBlobsInJSON: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include references in the AST to each node's corresponding CST node. By default `false`.
    */
  var keepCstNodes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Store the original node type when parsing documents. By default `true`.
    */
  var keepNodeTypes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable support for `<<` merge keys.
    */
  var merge: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The base schema to use. By default `"core"` for YAML 1.2 and `"yaml-1.1"` for earlier versions.
    */
  var schema: js.UndefOr[
    yamlLib.yamlLibStrings.core | yamlLib.yamlLibStrings.failsafe | yamlLib.yamlLibStrings.json | yamlLib.yamlLibStrings.`yaml-1DOT1`
  ] = js.undefined
  /**
    * Array of additional (custom) tags to include in the schema.
    */
  var tags: js.UndefOr[js.Array[Tag] | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])] = js.undefined
  /**
    * The YAML version used by documents without a `%YAML` directive. By default `"1.2"`.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    keepBlobsInJSON: js.UndefOr[scala.Boolean] = js.undefined,
    keepCstNodes: js.UndefOr[scala.Boolean] = js.undefined,
    keepNodeTypes: js.UndefOr[scala.Boolean] = js.undefined,
    merge: js.UndefOr[scala.Boolean] = js.undefined,
    schema: yamlLib.yamlLibStrings.core | yamlLib.yamlLibStrings.failsafe | yamlLib.yamlLibStrings.json | yamlLib.yamlLibStrings.`yaml-1DOT1` = null,
    tags: js.Array[Tag] | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]]) = null,
    version: java.lang.String = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepBlobsInJSON)) __obj.updateDynamic("keepBlobsInJSON")(keepBlobsInJSON)
    if (!js.isUndefined(keepCstNodes)) __obj.updateDynamic("keepCstNodes")(keepCstNodes)
    if (!js.isUndefined(keepNodeTypes)) __obj.updateDynamic("keepNodeTypes")(keepNodeTypes)
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ParseOptions]
  }
}

