package typings.victoryCore.mod

import typings.victoryCore.anon.Arialabel
import typings.victoryCore.anon.CircleComponent
import typings.victoryCore.victoryClipContainerMod.VictoryClipContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/lib", "VictoryClipContainer")
@js.native
open class VictoryClipContainer protected ()
  extends typings.victoryCore.victoryClipContainerMod.VictoryClipContainer {
  def this(props: VictoryClipContainerProps) = this()
}
/* static members */
object VictoryClipContainer {
  
  @JSImport("victory-core/lib", "VictoryClipContainer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "VictoryClipContainer.defaultProps")
  @js.native
  def defaultProps: CircleComponent = js.native
  inline def defaultProps_=(x: CircleComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryClipContainer.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryClipContainer.propTypes")
  @js.native
  def propTypes: Arialabel = js.native
  inline def propTypes_=(x: Arialabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryClipContainer.role")
  @js.native
  def role: String = js.native
  inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
}
