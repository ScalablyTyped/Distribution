package typings.yaml.mod

import typings.yaml.yamlStrings.`1Dot0`
import typings.yaml.yamlStrings.`1Dot1`
import typings.yaml.yamlStrings.`1Dot2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.yaml.typesMod.Schema.Options {
  /**
    * Default prefix for anchors.
    *
    * Default: `'a'`, resulting in anchors `a1`, `a2`, etc.
    */
  var anchorPrefix: js.UndefOr[String] = js.native
  /**
    * The number of spaces to use when indenting code.
    *
    * Default: `2`
    */
  var indent: js.UndefOr[Double] = js.native
  /**
    * Whether block sequences should be indented.
    *
    * Default: `true`
    */
  var indentSeq: js.UndefOr[Boolean] = js.native
  /**
    * Allow non-JSON JavaScript objects to remain in the `toJSON` output.
    * Relevant with the YAML 1.1 `!!timestamp` and `!!binary` tags as well as BigInts.
    *
    * Default: `true`
    */
  var keepBlobsInJSON: js.UndefOr[Boolean] = js.native
  /**
    * Include references in the AST to each node's corresponding CST node.
    *
    * Default: `false`
    */
  var keepCstNodes: js.UndefOr[Boolean] = js.native
  /**
    * Store the original node type when parsing documents.
    *
    * Default: `true`
    */
  var keepNodeTypes: js.UndefOr[Boolean] = js.native
  /**
    * When outputting JS, use Map rather than Object to represent mappings.
    *
    * Default: `false`
    */
  var mapAsMap: js.UndefOr[Boolean] = js.native
  /**
    * Prevent exponential entity expansion attacks by limiting data aliasing count;
    * set to `-1` to disable checks; `0` disallows all alias nodes.
    *
    * Default: `100`
    */
  var maxAliasCount: js.UndefOr[Double] = js.native
  /**
    * Include line position & node type directly in errors; drop their verbose source and context.
    *
    * Default: `false`
    */
  var prettyErrors: js.UndefOr[Boolean] = js.native
  /**
    * When stringifying, require keys to be scalars and to use implicit rather than explicit notation.
    *
    * Default: `false`
    */
  var simpleKeys: js.UndefOr[Boolean] = js.native
  /**
    * The YAML version used by documents without a `%YAML` directive.
    *
    * Default: `"1.2"`
    */
  var version: js.UndefOr[`1Dot0` | `1Dot1` | `1Dot2`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchorPrefix(value: String): Self = this.set("anchorPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorPrefix: Self = this.set("anchorPrefix", js.undefined)
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setIndentSeq(value: Boolean): Self = this.set("indentSeq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentSeq: Self = this.set("indentSeq", js.undefined)
    @scala.inline
    def setKeepBlobsInJSON(value: Boolean): Self = this.set("keepBlobsInJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepBlobsInJSON: Self = this.set("keepBlobsInJSON", js.undefined)
    @scala.inline
    def setKeepCstNodes(value: Boolean): Self = this.set("keepCstNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepCstNodes: Self = this.set("keepCstNodes", js.undefined)
    @scala.inline
    def setKeepNodeTypes(value: Boolean): Self = this.set("keepNodeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepNodeTypes: Self = this.set("keepNodeTypes", js.undefined)
    @scala.inline
    def setMapAsMap(value: Boolean): Self = this.set("mapAsMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapAsMap: Self = this.set("mapAsMap", js.undefined)
    @scala.inline
    def setMaxAliasCount(value: Double): Self = this.set("maxAliasCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAliasCount: Self = this.set("maxAliasCount", js.undefined)
    @scala.inline
    def setPrettyErrors(value: Boolean): Self = this.set("prettyErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyErrors: Self = this.set("prettyErrors", js.undefined)
    @scala.inline
    def setSimpleKeys(value: Boolean): Self = this.set("simpleKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleKeys: Self = this.set("simpleKeys", js.undefined)
    @scala.inline
    def setVersion(value: `1Dot0` | `1Dot1` | `1Dot2`): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

