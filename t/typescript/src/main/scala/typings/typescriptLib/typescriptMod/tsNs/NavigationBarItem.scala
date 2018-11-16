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

