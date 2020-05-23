package typings.winrtUwp.Windows.UI.ViewManagement

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
  
}

