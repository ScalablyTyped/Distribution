package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

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
  sealed trait activeCaption
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** A background element. */
  @js.native
  sealed trait background
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** A button face element. */
  @js.native
  sealed trait buttonFace
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** The text displayed on a button. */
  @js.native
  sealed trait buttonText
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** The text displayed in a caption. */
  @js.native
  sealed trait captionText
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** Greyed text. */
  @js.native
  sealed trait grayText
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** A highlighted user interface (UI) element. */
  @js.native
  sealed trait highlight
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** Highlighted text. */
  @js.native
  sealed trait highlightText
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** A hotlighted UI element. */
  @js.native
  sealed trait hotlight
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** An inactive caption element. */
  @js.native
  sealed trait inactiveCaption
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** The text displayed in an inactive caption element. */
  @js.native
  sealed trait inactiveCaptionText
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** A window. */
  @js.native
  sealed trait window
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /** The text displayed in a window's UI decoration. */
  @js.native
  sealed trait windowText
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType
  
  /* 0 */ val activeCaption: activeCaption with scala.Double = js.native
  /* 1 */ val background: background with scala.Double = js.native
  /* 2 */ val buttonFace: buttonFace with scala.Double = js.native
  /* 3 */ val buttonText: buttonText with scala.Double = js.native
  /* 4 */ val captionText: captionText with scala.Double = js.native
  /* 5 */ val grayText: grayText with scala.Double = js.native
  /* 6 */ val highlight: highlight with scala.Double = js.native
  /* 7 */ val highlightText: highlightText with scala.Double = js.native
  /* 8 */ val hotlight: hotlight with scala.Double = js.native
  /* 9 */ val inactiveCaption: inactiveCaption with scala.Double = js.native
  /* 10 */ val inactiveCaptionText: inactiveCaptionText with scala.Double = js.native
  /* 11 */ val window: window with scala.Double = js.native
  /* 12 */ val windowText: windowText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType with scala.Double] = js.native
}

