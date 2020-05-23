package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.Instantiable0
import typings.std.RegExp
import typings.yaml.typesMod.Node
import typings.yaml.typesMod.Scalar
import typings.yaml.typesMod.YAMLMap
import typings.yaml.typesMod.YAMLSeq
import typings.yaml.yamlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultTag
  extends BaseTag
     with Tag {
  /**
    * If `true`, together with `test` allows for values to be stringified without
    * an explicit tag. For most cases, it's unlikely that you'll actually want to
    * use this, even if you first think you do.
    */
  var default: `true`
  /**
    * Together with `default` allows for values to be stringified without an
    * explicit tag and detected using a regular expression. For most cases, it's
    * unlikely that you'll actually want to use these, even if you first think
    * you do.
    */
  var test: RegExp
  /**
    * Alternative form used by default tags; called with `test` match results.
    */
  def resolve(`match`: String*): Node | js.Any
}

object DefaultTag {
  @scala.inline
  def apply(
    default: `true`,
    identify: js.Any => Boolean,
    resolve: /* repeated */ String => Node | js.Any,
    tag: String,
    test: RegExp,
    createNode: (/* schema */ typings.yaml.typesMod.Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar = null,
    format: String = null,
    nodeClass: Instantiable0[js.Any] = null,
    options: js.Object = null,
    stringify: (/* item */ Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String = null
  ): DefaultTag = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction3(createNode))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (nodeClass != null) __obj.updateDynamic("nodeClass")(nodeClass.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction4(stringify))
    __obj.asInstanceOf[DefaultTag]
  }
}

