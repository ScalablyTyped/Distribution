package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Configuration")
@js.native
class Configuration[Link] protected ()
  extends webcolaLib.distSrcPowergraphMod.Configuration[Link] {
  def this(n: scala.Double, edges: js.Array[Link], linkAccessor: webcolaLib.distSrcPowergraphMod.LinkTypeAccessor[Link]) = this()
  def this(n: scala.Double, edges: js.Array[Link], linkAccessor: webcolaLib.distSrcPowergraphMod.LinkTypeAccessor[Link], rootGroup: js.Array[_]) = this()
}

@JSImport("webcola", "Configuration")
@js.native
object Configuration extends js.Object {
  def getEdges(
    modules: webcolaLib.distSrcPowergraphMod.ModuleSet,
    es: js.Array[webcolaLib.distSrcPowergraphMod.PowerEdge]
  ): scala.Unit = js.native
}

