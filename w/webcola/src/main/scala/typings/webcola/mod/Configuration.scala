package typings.webcola.mod

import typings.webcola.powergraphMod.LinkTypeAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Configuration")
@js.native
open class Configuration[Link] protected ()
  extends typings.webcola.powergraphMod.Configuration[Link] {
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[Any]) = this()
}
/* static members */
object Configuration {
  
  @JSImport("webcola", "Configuration")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEdges(
    modules: typings.webcola.powergraphMod.ModuleSet,
    es: js.Array[typings.webcola.powergraphMod.PowerEdge]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdges")(modules.asInstanceOf[js.Any], es.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
