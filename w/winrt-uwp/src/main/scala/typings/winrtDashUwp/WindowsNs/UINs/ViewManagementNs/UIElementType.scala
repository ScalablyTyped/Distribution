package typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIElementType extends js.Object

/** Defines the set of user interface element types. */
@JSGlobal("Windows.UI.ViewManagement.UIElementType")
@js.native
object UIElementType extends js.Object {
  /** An active caption element. */
  @js.native
  sealed trait activeCaption extends UIElementType
  
  /** A background element. */
  @js.native
  sealed trait background extends UIElementType
  
  /** A button face element. */
  @js.native
  sealed trait buttonFace extends UIElementType
  
  /** The text displayed on a button. */
  @js.native
  sealed trait buttonText extends UIElementType
  
  /** The text displayed in a caption. */
  @js.native
  sealed trait captionText extends UIElementType
  
  /** Greyed text. */
  @js.native
  sealed trait grayText extends UIElementType
  
  /** A highlighted user interface (UI) element. */
  @js.native
  sealed trait highlight extends UIElementType
  
  /** Highlighted text. */
  @js.native
  sealed trait highlightText extends UIElementType
  
  /** A hotlighted UI element. */
  @js.native
  sealed trait hotlight extends UIElementType
  
  /** An inactive caption element. */
  @js.native
  sealed trait inactiveCaption extends UIElementType
  
  /** The text displayed in an inactive caption element. */
  @js.native
  sealed trait inactiveCaptionText extends UIElementType
  
  /** A window. */
  @js.native
  sealed trait window extends UIElementType
  
  /** The text displayed in a window's UI decoration. */
  @js.native
  sealed trait windowText extends UIElementType
  
  /* 0 */ val activeCaption: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.activeCaption with Double = js.native
  /* 1 */ val background: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.background with Double = js.native
  /* 2 */ val buttonFace: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.buttonFace with Double = js.native
  /* 3 */ val buttonText: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.buttonText with Double = js.native
  /* 4 */ val captionText: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.captionText with Double = js.native
  /* 5 */ val grayText: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.grayText with Double = js.native
  /* 6 */ val highlight: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.highlight with Double = js.native
  /* 7 */ val highlightText: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.highlightText with Double = js.native
  /* 8 */ val hotlight: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.hotlight with Double = js.native
  /* 9 */ val inactiveCaption: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.inactiveCaption with Double = js.native
  /* 10 */ val inactiveCaptionText: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.inactiveCaptionText with Double = js.native
  /* 11 */ val window: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.window with Double = js.native
  /* 12 */ val windowText: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UIElementType.windowText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIElementType with Double] = js.native
}

