package typings
package webcolaLib.distSrcPowergraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/powergraph", "Configuration")
@js.native
class Configuration[Link] protected () extends js.Object {
  def this(n: scala.Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
  def this(n: scala.Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[_]) = this()
  var R: scala.Double = js.native
  var linkAccessor: js.Any = js.native
  var modules: js.Array[Module] = js.native
  var roots: js.Array[ModuleSet] = js.native
  def allEdges(): js.Array[PowerEdge] = js.native
  def getGroupHierarchy(retargetedEdges: js.Array[PowerEdge]): js.Array[_] = js.native
  def greedyMerge(): scala.Boolean = js.native
  /* private */ def initModulesFromGroup(group: js.Any): js.Any = js.native
  def merge(a: Module, b: Module): Module = js.native
  def merge(a: Module, b: Module, k: scala.Double): Module = js.native
  /* private */ def nEdges(a: js.Any, b: js.Any): js.Any = js.native
  /* private */ def rootMerges(): js.Any = js.native
  /* private */ def rootMerges(k: js.Any): js.Any = js.native
}

@JSImport("webcola/dist/src/powergraph", "Configuration")
@js.native
object Configuration extends js.Object {
  def getEdges(
    modules: webcolaLib.distSrcPowergraphMod.ModuleSet,
    es: js.Array[webcolaLib.distSrcPowergraphMod.PowerEdge]
  ): scala.Unit = js.native
}

