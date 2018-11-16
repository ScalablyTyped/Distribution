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
  
  val activeCaption: activeCaption with java.lang.String = js.native
  val background: background with java.lang.String = js.native
  val buttonFace: buttonFace with java.lang.String = js.native
  val buttonText: buttonText with java.lang.String = js.native
  val captionText: captionText with java.lang.String = js.native
  val grayText: grayText with java.lang.String = js.native
  val highlight: highlight with java.lang.String = js.native
  val highlightText: highlightText with java.lang.String = js.native
  val hotlight: hotlight with java.lang.String = js.native
  val inactiveCaption: inactiveCaption with java.lang.String = js.native
  val inactiveCaptionText: inactiveCaptionText with java.lang.String = js.native
  val window: window with java.lang.String = js.native
  val windowText: windowText with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIElementType with java.lang.String
  ] = js.native
}

