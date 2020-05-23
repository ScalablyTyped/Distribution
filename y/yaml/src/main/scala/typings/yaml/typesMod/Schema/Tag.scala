package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.Instantiable0
import typings.std.RegExp
import typings.yaml.mod.Document
import typings.yaml.parseCstMod.CST.Node
import typings.yaml.typesMod.Scalar
import typings.yaml.typesMod.YAMLMap
import typings.yaml.typesMod.YAMLSeq
import typings.yaml.yamlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yaml.typesMod.Schema.CustomTag
  - typings.yaml.typesMod.Schema.DefaultTag
*/
trait Tag extends js.Object

object Tag {
  @scala.inline
  def CustomTag(
    identify: js.Any => Boolean,
    resolve: (Document, Node) => typings.yaml.typesMod.Node | js.Any,
    tag: String,
    `class`: Instantiable0[js.Any] = null,
    createNode: (/* schema */ typings.yaml.typesMod.Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar = null,
    format: String = null,
    nodeClass: Instantiable0[js.Any] = null,
    options: js.Object = null,
    stringify: (/* item */ typings.yaml.typesMod.Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String = null
  ): Tag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction3(createNode))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (nodeClass != null) __obj.updateDynamic("nodeClass")(nodeClass.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction4(stringify))
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  def DefaultTag(
    default: `true`,
    identify: js.Any => Boolean,
    resolve: /* repeated */ String => typings.yaml.typesMod.Node | js.Any,
    tag: String,
    test: RegExp,
    createNode: (/* schema */ typings.yaml.typesMod.Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar = null,
    format: String = null,
    nodeClass: Instantiable0[js.Any] = null,
    options: js.Object = null,
    stringify: (/* item */ typings.yaml.typesMod.Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String = null
  ): Tag = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction3(createNode))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (nodeClass != null) __obj.updateDynamic("nodeClass")(nodeClass.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction4(stringify))
    __obj.asInstanceOf[Tag]
  }
}

