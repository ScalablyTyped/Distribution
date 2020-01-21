package typings.webcola.powergraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/powergraph", "Module")
@js.native
class Module protected () extends js.Object {
  def this(id: Double) = this()
  def this(id: Double, outgoing: LinkSets) = this()
  def this(id: Double, outgoing: LinkSets, incoming: LinkSets) = this()
  def this(id: Double, outgoing: LinkSets, incoming: LinkSets, children: ModuleSet) = this()
  def this(id: Double, outgoing: LinkSets, incoming: LinkSets, children: ModuleSet, definition: js.Any) = this()
  var children: ModuleSet = js.native
  var definition: js.UndefOr[js.Any] = js.native
  var gid: Double = js.native
  var id: Double = js.native
  var incoming: LinkSets = js.native
  var outgoing: LinkSets = js.native
  def getEdges(es: js.Array[PowerEdge]): Unit = js.native
  def isIsland(): Boolean = js.native
  def isLeaf(): Boolean = js.native
  def isPredefined(): Boolean = js.native
}

