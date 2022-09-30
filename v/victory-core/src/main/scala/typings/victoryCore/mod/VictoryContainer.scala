package typings.victoryCore.mod

import typings.react.mod.Context
import typings.victoryCore.anon.Arialabelledby
import typings.victoryCore.anon.PortalComponent
import typings.victoryCore.anon.TransitionTimer
import typings.victoryCore.victoryContainerMod.VictoryContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/lib", "VictoryContainer")
@js.native
open class VictoryContainer protected ()
  extends typings.victoryCore.victoryContainerMod.VictoryContainer {
  def this(props: VictoryContainerProps) = this()
}
/* static members */
object VictoryContainer {
  
  @JSImport("victory-core/lib", "VictoryContainer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "VictoryContainer.contextType")
  @js.native
  def contextType: Context[TransitionTimer] = js.native
  inline def contextType_=(x: Context[TransitionTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryContainer.defaultProps")
  @js.native
  def defaultProps: PortalComponent = js.native
  inline def defaultProps_=(x: PortalComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryContainer.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryContainer.propTypes")
  @js.native
  def propTypes: Arialabelledby = js.native
  inline def propTypes_=(x: Arialabelledby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryContainer.role")
  @js.native
  def role: String = js.native
  inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
}
