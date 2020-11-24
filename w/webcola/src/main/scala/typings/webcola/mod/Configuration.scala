package typings.webcola.mod

import typings.webcola.powergraphMod.LinkTypeAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Configuration")
@js.native
class Configuration[Link] protected ()
  extends typings.webcola.powergraphMod.Configuration[Link] {
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[_]) = this()
}
/* static members */
@JSImport("webcola", "Configuration")
@js.native
object Configuration extends js.Object {
  
  def getEdges(
    modules: typings.webcola.powergraphMod.ModuleSet,
    es: js.Array[typings.webcola.powergraphMod.PowerEdge]
  ): Unit = js.native
}
