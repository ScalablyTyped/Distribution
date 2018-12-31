package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeparatedSyntaxList extends ISyntaxElement {
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: scala.Double): scala.Unit
  def nonSeparatorAt(index: scala.Double): ISyntaxNodeOrToken
  def nonSeparatorCount(): scala.Double
  def separatorAt(index: scala.Double): ISyntaxToken
  def separatorCount(): scala.Double
  def toArray(): js.Array[ISyntaxNodeOrToken]
  def toNonSeparatorArray(): js.Array[ISyntaxNodeOrToken]
}

