package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.Instantiable0
import typings.yaml.typesMod.Node
import typings.yaml.typesMod.Scalar
import typings.yaml.typesMod.YAMLMap
import typings.yaml.typesMod.YAMLSeq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTag extends js.Object {
  /**
    * An optional factory function, used e.g. by collections when wrapping JS objects as AST nodes.
    */
  var createNode: js.UndefOr[
    js.Function3[
      /* schema */ typings.yaml.typesMod.Schema, 
      /* value */ js.Any, 
      /* ctx */ CreateNodeContext, 
      YAMLMap | YAMLSeq | Scalar
    ]
  ] = js.native
  /**
    * If a tag has multiple forms that should be parsed and/or stringified differently, use `format` to identify them.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The `Node` child class that implements this tag. Required for collections and tags that have overlapping JS representations.
    */
  var nodeClass: js.UndefOr[Instantiable0[js.Any]] = js.native
  /**
    * Used by some tags to configure their stringification, where applicable.
    */
  var options: js.UndefOr[js.Object] = js.native
  /**
    * Optional function stringifying the AST node in the current context. If your
    * data includes a suitable `.toString()` method, you can probably leave this
    * undefined and use the default stringifier.
    *
    * @param item The node being stringified.
    * @param ctx Contains the stringifying context variables.
    * @param onComment Callback to signal that the stringifier includes the
    *   item's comment in its output.
    * @param onChompKeep Callback to signal that the output uses a block scalar
    *   type with the `+` chomping indicator.
    */
  var stringify: js.UndefOr[
    js.Function4[
      /* item */ Node, 
      /* ctx */ StringifyContext, 
      /* onComment */ js.UndefOr[js.Function0[Unit]], 
      /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
      String
    ]
  ] = js.native
  /**
    * The identifier for your data type, with which its stringified form will be
    * prefixed. Should either be a !-prefixed local `!tag`, or a fully qualified
    * `tag:domain,date:foo`.
    */
  var tag: String = js.native
  /**
    * Used by `YAML.createNode` to detect your data type, e.g. using `typeof` or
    * `instanceof`.
    */
  def identify(value: js.Any): Boolean = js.native
}

object BaseTag {
  @scala.inline
  def apply(identify: js.Any => Boolean, tag: String): BaseTag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTag]
  }
  @scala.inline
  implicit class BaseTagOps[Self <: BaseTag] (val x: Self) extends AnyVal {
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
    def setIdentify(value: js.Any => Boolean): Self = this.set("identify", js.Any.fromFunction1(value))
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateNode(
      value: (/* schema */ typings.yaml.typesMod.Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar
    ): Self = this.set("createNode", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCreateNode: Self = this.set("createNode", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setNodeClass(value: Instantiable0[js.Any]): Self = this.set("nodeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeClass: Self = this.set("nodeClass", js.undefined)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setStringify(
      value: (/* item */ Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String
    ): Self = this.set("stringify", js.Any.fromFunction4(value))
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
  }
  
}

