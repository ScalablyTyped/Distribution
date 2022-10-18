package typings.victoryCore.libMod

import typings.react.mod.Context
import typings.victoryCore.anon.Animate
import typings.victoryCore.anon.AnimationTimer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/lib", "VictoryTransition")
@js.native
open class VictoryTransition protected ()
  extends typings.victoryCore.libVictoryTransitionVictoryTransitionMod.VictoryTransition {
  def this(props: Any, context: Any) = this()
}
/* static members */
object VictoryTransition {
  
  @JSImport("victory-core/lib", "VictoryTransition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "VictoryTransition.contextType")
  @js.native
  def contextType: Context[AnimationTimer] = js.native
  inline def contextType_=(x: Context[AnimationTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryTransition.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryTransition.propTypes")
  @js.native
  def propTypes: Animate = js.native
  inline def propTypes_=(x: Animate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
