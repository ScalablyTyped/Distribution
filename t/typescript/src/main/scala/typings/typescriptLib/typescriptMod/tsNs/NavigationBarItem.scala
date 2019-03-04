package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigation bar interface designed for visual studio's dual-column layout.
  * This does not form a proper tree.
  * The navbar is returned as a list of top-level items, each of which has a list of child items.
  * Child items always have an empty array for their `childItems`.
  */
trait NavigationBarItem extends js.Object {
  var bolded: scala.Boolean
  var childItems: js.Array[NavigationBarItem]
  var grayed: scala.Boolean
  var indent: scala.Double
  var kind: ScriptElementKind
  var kindModifiers: java.lang.String
  var spans: js.Array[TextSpan]
  var text: java.lang.String
}

object NavigationBarItem {
  @scala.inline
  def apply(
    bolded: scala.Boolean,
    childItems: js.Array[NavigationBarItem],
    grayed: scala.Boolean,
    indent: scala.Double,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String
  ): NavigationBarItem = {
    val __obj = js.Dynamic.literal(bolded = bolded, childItems = childItems, grayed = grayed, indent = indent, kind = kind, kindModifiers = kindModifiers, spans = spans, text = text)
  
    __obj.asInstanceOf[NavigationBarItem]
  }
}

