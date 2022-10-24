package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.FC
import typings.wixStyleReact.distTypesSegmentedToggleMod.SegmentedToggleButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "SegmentedToggle")
@js.native
open class SegmentedToggle ()
  extends typings.wixStyleReact.distTypesSegmentedToggleMod.default
/* static members */
object SegmentedToggle {
  
  @JSImport("wix-style-react", "SegmentedToggle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "SegmentedToggle.Button")
  @js.native
  def Button: FC[SegmentedToggleButtonProps] = js.native
  inline def Button_=(x: FC[SegmentedToggleButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "SegmentedToggle.Icon")
  @js.native
  def Icon: Instantiable0[typings.wixStyleReact.distTypesSegmentedToggleMod.SegmentedToggleIcon] = js.native
  inline def Icon_=(x: Instantiable0[typings.wixStyleReact.distTypesSegmentedToggleMod.SegmentedToggleIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
}
