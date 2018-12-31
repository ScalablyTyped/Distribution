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

