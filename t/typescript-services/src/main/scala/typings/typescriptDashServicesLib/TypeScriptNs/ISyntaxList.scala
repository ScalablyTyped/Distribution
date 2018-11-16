package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISyntaxList extends ISyntaxElement {
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: scala.Double): scala.Unit
  def toArray(): js.Array[ISyntaxNodeOrToken]
}

