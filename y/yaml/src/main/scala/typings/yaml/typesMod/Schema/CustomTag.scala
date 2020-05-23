package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.Instantiable0
import typings.yaml.mod.Document
import typings.yaml.parseCstMod.CST.Node
import typings.yaml.typesMod.Scalar
import typings.yaml.typesMod.YAMLMap
import typings.yaml.typesMod.YAMLSeq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTag
  extends BaseTag
     with Tag {
  /**
    * A JavaScript class that should be matched to this tag, e.g. `Date` for `!!timestamp`.
    * @deprecated Use `Tag.identify` instead
    */
  var `class`: js.UndefOr[Instantiable0[js.Any]] = js.undefined
  /**
    * Turns a CST node into an AST node. If returning a non-`Node` value, the
    * output will be wrapped as a `Scalar`.
    */
  def resolve(doc: Document, cstNode: Node): typings.yaml.typesMod.Node | js.Any
}

object CustomTag {
  @scala.inline
  def apply(
    identify: js.Any => Boolean,
    resolve: (Document, Node) => typings.yaml.typesMod.Node | js.Any,
    tag: String,
    `class`: Instantiable0[js.Any] = null,
    createNode: (/* schema */ typings.yaml.typesMod.Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar = null,
    format: String = null,
    nodeClass: Instantiable0[js.Any] = null,
    options: js.Object = null,
    stringify: (/* item */ typings.yaml.typesMod.Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String = null
  ): CustomTag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction3(createNode))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (nodeClass != null) __obj.updateDynamic("nodeClass")(nodeClass.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction4(stringify))
    __obj.asInstanceOf[CustomTag]
  }
}

