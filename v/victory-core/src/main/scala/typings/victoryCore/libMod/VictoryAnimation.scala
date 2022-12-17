package typings.victoryCore.libMod

import typings.react.mod.Context
import typings.victoryCore.anon.AnimationTimer
import typings.victoryCore.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/lib", "VictoryAnimation")
@js.native
open class VictoryAnimation protected ()
  extends typings.victoryCore.libVictoryAnimationVictoryAnimationMod.VictoryAnimation {
  def this(props: Any, context: Any) = this()
}
/* static members */
object VictoryAnimation {
  
  @JSImport("victory-core/lib", "VictoryAnimation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "VictoryAnimation.contextType")
  @js.native
  def contextType: Context[AnimationTimer] = js.native
  inline def contextType_=(x: Context[AnimationTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryAnimation.defaultProps")
  @js.native
  def defaultProps: typings.victoryCore.anon.Data = js.native
  inline def defaultProps_=(x: typings.victoryCore.anon.Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryAnimation.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryAnimation.propTypes")
  @js.native
  def propTypes: Children = js.native
  inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
