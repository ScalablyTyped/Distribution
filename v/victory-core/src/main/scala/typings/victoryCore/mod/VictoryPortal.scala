package typings.victoryCore.mod

import typings.react.mod.Context
import typings.victoryCore.anon.GroupComponent
import typings.victoryCore.anon.GroupComponentElement
import typings.victoryCore.portalContextMod.PortalContextValue
import typings.victoryCore.victoryPortalMod.VictoryPortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/lib", "VictoryPortal")
@js.native
open class VictoryPortal protected ()
  extends typings.victoryCore.victoryPortalMod.VictoryPortal {
  def this(props: VictoryPortalProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: VictoryPortalProps, context: Any) = this()
}
/* static members */
object VictoryPortal {
  
  @JSImport("victory-core/lib", "VictoryPortal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "VictoryPortal.contextType")
  @js.native
  def contextType: Context[PortalContextValue] = js.native
  inline def contextType_=(x: Context[PortalContextValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryPortal.defaultProps")
  @js.native
  def defaultProps: GroupComponentElement = js.native
  inline def defaultProps_=(x: GroupComponentElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryPortal.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryPortal.propTypes")
  @js.native
  def propTypes: GroupComponent = js.native
  inline def propTypes_=(x: GroupComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryPortal.role")
  @js.native
  def role: String = js.native
  inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
}
