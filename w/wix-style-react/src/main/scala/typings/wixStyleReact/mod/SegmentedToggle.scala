package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.SFC
import typings.wixStyleReact.segmentedToggleMod.SegmentedToggleButtonProps
import typings.wixStyleReact.segmentedToggleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "SegmentedToggle")
@js.native
class SegmentedToggle () extends default
/* static members */
object SegmentedToggle {
  
  @JSImport("wix-style-react", "SegmentedToggle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "SegmentedToggle.Button")
  @js.native
  def Button: SFC[SegmentedToggleButtonProps] = js.native
  @scala.inline
  def Button_=(x: SFC[SegmentedToggleButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "SegmentedToggle.Icon")
  @js.native
  def Icon: Instantiable0[typings.wixStyleReact.segmentedToggleMod.SegmentedToggleIcon] = js.native
  @scala.inline
  def Icon_=(x: Instantiable0[typings.wixStyleReact.segmentedToggleMod.SegmentedToggleIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
}
