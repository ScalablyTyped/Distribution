package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.Instantiable0
import typings.yaml.typesMod.Node
import typings.yaml.typesMod.Scalar
import typings.yaml.typesMod.YAMLMap
import typings.yaml.typesMod.YAMLSeq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
  /**
    * If a tag has multiple forms that should be parsed and/or stringified differently, use `format` to identify them.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * The `Node` child class that implements this tag. Required for collections and tags that have overlapping JS representations.
    */
  var nodeClass: js.UndefOr[Instantiable0[js.Any]] = js.undefined
  /**
    * Used by some tags to configure their stringification, where applicable.
    */
  var options: js.UndefOr[js.Object] = js.undefined
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
  ] = js.undefined
  /**
    * The identifier for your data type, with which its stringified form will be
    * prefixed. Should either be a !-prefixed local `!tag`, or a fully qualified
    * `tag:domain,date:foo`.
    */
  var tag: String
  /**
    * Used by `YAML.createNode` to detect your data type, e.g. using `typeof` or
    * `instanceof`.
    */
  def identify(value: js.Any): Boolean
}

object BaseTag {
  @scala.inline
  def apply(
    identify: js.Any => Boolean,
    tag: String,
    createNode: (/* schema */ typings.yaml.typesMod.Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar = null,
    format: String = null,
    nodeClass: Instantiable0[js.Any] = null,
    options: js.Object = null,
    stringify: (/* item */ Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String = null
  ): BaseTag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), tag = tag.asInstanceOf[js.Any])
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction3(createNode))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (nodeClass != null) __obj.updateDynamic("nodeClass")(nodeClass.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction4(stringify))
    __obj.asInstanceOf[BaseTag]
  }
}

