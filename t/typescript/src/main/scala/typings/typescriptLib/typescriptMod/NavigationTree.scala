package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node in a tree of nested declarations in a file.
  * The top node is always a script or module node.
  */
trait NavigationTree extends js.Object {
  /** Present if non-empty */
  var childItems: js.UndefOr[js.Array[NavigationTree]] = js.undefined
  var kind: ScriptElementKind
  /** ScriptElementKindModifier separated by commas, e.g. "public,abstract" */
  var kindModifiers: java.lang.String
  var nameSpan: js.UndefOr[TextSpan]
  /**
    * Spans of the nodes that generated this declaration.
    * There will be more than one if this is the result of merging.
    */
  var spans: js.Array[TextSpan]
  /** Name of the declaration, or a short description, e.g. "<class>". */
  var text: java.lang.String
}

object NavigationTree {
  @scala.inline
  def apply(
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String,
    childItems: js.Array[NavigationTree] = null,
    nameSpan: TextSpan = null
  ): NavigationTree = {
    val __obj = js.Dynamic.literal(kind = kind, kindModifiers = kindModifiers, spans = spans, text = text)
    if (childItems != null) __obj.updateDynamic("childItems")(childItems)
    if (nameSpan != null) __obj.updateDynamic("nameSpan")(nameSpan)
    __obj.asInstanceOf[NavigationTree]
  }
}

