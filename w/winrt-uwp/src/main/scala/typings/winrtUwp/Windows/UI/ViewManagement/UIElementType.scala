package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIElementType with Double] = js.native
  /* 0 */ @js.native
  object activeCaption extends TopLevel[activeCaption with Double]
  
  /* 1 */ @js.native
  object background extends TopLevel[background with Double]
  
  /* 2 */ @js.native
  object buttonFace extends TopLevel[buttonFace with Double]
  
  /* 3 */ @js.native
  object buttonText extends TopLevel[buttonText with Double]
  
  /* 4 */ @js.native
  object captionText extends TopLevel[captionText with Double]
  
  /* 5 */ @js.native
  object grayText extends TopLevel[grayText with Double]
  
  /* 6 */ @js.native
  object highlight extends TopLevel[highlight with Double]
  
  /* 7 */ @js.native
  object highlightText extends TopLevel[highlightText with Double]
  
  /* 8 */ @js.native
  object hotlight extends TopLevel[hotlight with Double]
  
  /* 9 */ @js.native
  object inactiveCaption extends TopLevel[inactiveCaption with Double]
  
  /* 10 */ @js.native
  object inactiveCaptionText extends TopLevel[inactiveCaptionText with Double]
  
  /* 11 */ @js.native
  object window extends TopLevel[window with Double]
  
  /* 12 */ @js.native
  object windowText extends TopLevel[windowText with Double]
  
}

