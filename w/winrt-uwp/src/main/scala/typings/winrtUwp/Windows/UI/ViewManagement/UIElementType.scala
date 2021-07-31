package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UIElementType extends StObject
/** Defines the set of user interface element types. */
@JSGlobal("Windows.UI.ViewManagement.UIElementType")
@js.native
object UIElementType extends StObject {
  
  /** An active caption element. */
  @js.native
  sealed trait activeCaption
    extends StObject
       with UIElementType
  
  /** A background element. */
  @js.native
  sealed trait background
    extends StObject
       with UIElementType
  
  /** A button face element. */
  @js.native
  sealed trait buttonFace
    extends StObject
       with UIElementType
  
  /** The text displayed on a button. */
  @js.native
  sealed trait buttonText
    extends StObject
       with UIElementType
  
  /** The text displayed in a caption. */
  @js.native
  sealed trait captionText
    extends StObject
       with UIElementType
  
  /** Greyed text. */
  @js.native
  sealed trait grayText
    extends StObject
       with UIElementType
  
  /** A highlighted user interface (UI) element. */
  @js.native
  sealed trait highlight
    extends StObject
       with UIElementType
  
  /** Highlighted text. */
  @js.native
  sealed trait highlightText
    extends StObject
       with UIElementType
  
  /** A hotlighted UI element. */
  @js.native
  sealed trait hotlight
    extends StObject
       with UIElementType
  
  /** An inactive caption element. */
  @js.native
  sealed trait inactiveCaption
    extends StObject
       with UIElementType
  
  /** The text displayed in an inactive caption element. */
  @js.native
  sealed trait inactiveCaptionText
    extends StObject
       with UIElementType
  
  /** A window. */
  @js.native
  sealed trait window
    extends StObject
       with UIElementType
  
  /** The text displayed in a window's UI decoration. */
  @js.native
  sealed trait windowText
    extends StObject
       with UIElementType
}
