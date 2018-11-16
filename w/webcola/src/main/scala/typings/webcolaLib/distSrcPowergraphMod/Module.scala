package typings
package webcolaLib.distSrcPowergraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/powergraph", "Module")
@js.native
class Module protected () extends js.Object {
  def this(id: scala.Double) = this()
  def this(id: scala.Double, outgoing: LinkSets) = this()
  def this(id: scala.Double, outgoing: LinkSets, incoming: LinkSets) = this()
  def this(id: scala.Double, outgoing: LinkSets, incoming: LinkSets, children: ModuleSet) = this()
  def this(id: scala.Double, outgoing: LinkSets, incoming: LinkSets, children: ModuleSet, definition: js.Any) = this()
  var children: ModuleSet = js.native
  var definition: js.Any = js.native
  var gid: scala.Double = js.native
  var id: scala.Double = js.native
  var incoming: LinkSets = js.native
  var outgoing: LinkSets = js.native
  def getEdges(es: js.Array[PowerEdge]): scala.Unit = js.native
  def isIsland(): scala.Boolean = js.native
  def isLeaf(): scala.Boolean = js.native
  def isPredefined(): scala.Boolean = js.native
}

