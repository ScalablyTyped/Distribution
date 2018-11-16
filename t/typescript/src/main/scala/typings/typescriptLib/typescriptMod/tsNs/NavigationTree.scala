package typings
package typescriptLib.typescriptMod.tsNs

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

