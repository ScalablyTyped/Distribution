package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Node extends js.Object {
  var axisItems: js.UndefOr[js.Array[Node]] = js.undefined
  var bounds: Bounds
  var `def`: Mark
  var interactive: scala.Boolean
  var items: js.Array[Node]
  var marktype: java.lang.String
  // group members
  var scales: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  def cousin(offset: scala.Double, index: scala.Double): Node
  // mark item members
  def hasPropertySet(name: java.lang.String): scala.Boolean
  def remove(): Node
  def sibling(offset: scala.Double): Node
  def touch(): scala.Unit
}

