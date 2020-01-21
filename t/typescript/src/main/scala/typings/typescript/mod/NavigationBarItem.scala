package typings.typescript.mod

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
  var bolded: Boolean
  var childItems: js.Array[NavigationBarItem]
  var grayed: Boolean
  var indent: Double
  var kind: ScriptElementKind
  var kindModifiers: java.lang.String
  var spans: js.Array[TextSpan]
  var text: java.lang.String
}

object NavigationBarItem {
  @scala.inline
  def apply(
    bolded: Boolean,
    childItems: js.Array[NavigationBarItem],
    grayed: Boolean,
    indent: Double,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String
  ): NavigationBarItem = {
    val __obj = js.Dynamic.literal(bolded = bolded.asInstanceOf[js.Any], childItems = childItems.asInstanceOf[js.Any], grayed = grayed.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationBarItem]
  }
}

