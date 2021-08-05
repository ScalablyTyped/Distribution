package typings.wixUiCore.standaloneSrcMod

import typings.wixUiCore.anon.TabIndex
import typings.wixUiCore.componentsToggleSwitchToggleSwitchMod.ToggleSwitchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/standalone/src", "ToggleSwitch")
@js.native
class ToggleSwitch protected ()
  extends typings.wixUiCore.componentsToggleSwitchMod.ToggleSwitch {
  def this(props: ToggleSwitchProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ToggleSwitchProps, context: js.Any) = this()
}
/* static members */
object ToggleSwitch {
  
  @JSImport("wix-ui-core/dist/standalone/src", "ToggleSwitch")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src", "ToggleSwitch.defaultProps")
  @js.native
  def defaultProps: TabIndex = js.native
  inline def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/standalone/src", "ToggleSwitch.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
