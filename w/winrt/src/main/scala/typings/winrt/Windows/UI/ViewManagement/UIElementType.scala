package typings.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIElementType extends js.Object

@JSGlobal("Windows.UI.ViewManagement.UIElementType")
@js.native
object UIElementType extends js.Object {
  @js.native
  sealed trait activeCaption extends UIElementType
  
  @js.native
  sealed trait background extends UIElementType
  
  @js.native
  sealed trait buttonFace extends UIElementType
  
  @js.native
  sealed trait buttonText extends UIElementType
  
  @js.native
  sealed trait captionText extends UIElementType
  
  @js.native
  sealed trait grayText extends UIElementType
  
  @js.native
  sealed trait highlight extends UIElementType
  
  @js.native
  sealed trait highlightText extends UIElementType
  
  @js.native
  sealed trait hotlight extends UIElementType
  
  @js.native
  sealed trait inactiveCaption extends UIElementType
  
  @js.native
  sealed trait inactiveCaptionText extends UIElementType
  
  @js.native
  sealed trait window extends UIElementType
  
  @js.native
  sealed trait windowText extends UIElementType
  
  /* 0 */ val activeCaption: typings.winrt.Windows.UI.ViewManagement.UIElementType.activeCaption with Double = js.native
  /* 1 */ val background: typings.winrt.Windows.UI.ViewManagement.UIElementType.background with Double = js.native
  /* 2 */ val buttonFace: typings.winrt.Windows.UI.ViewManagement.UIElementType.buttonFace with Double = js.native
  /* 3 */ val buttonText: typings.winrt.Windows.UI.ViewManagement.UIElementType.buttonText with Double = js.native
  /* 4 */ val captionText: typings.winrt.Windows.UI.ViewManagement.UIElementType.captionText with Double = js.native
  /* 5 */ val grayText: typings.winrt.Windows.UI.ViewManagement.UIElementType.grayText with Double = js.native
  /* 6 */ val highlight: typings.winrt.Windows.UI.ViewManagement.UIElementType.highlight with Double = js.native
  /* 7 */ val highlightText: typings.winrt.Windows.UI.ViewManagement.UIElementType.highlightText with Double = js.native
  /* 8 */ val hotlight: typings.winrt.Windows.UI.ViewManagement.UIElementType.hotlight with Double = js.native
  /* 9 */ val inactiveCaption: typings.winrt.Windows.UI.ViewManagement.UIElementType.inactiveCaption with Double = js.native
  /* 10 */ val inactiveCaptionText: typings.winrt.Windows.UI.ViewManagement.UIElementType.inactiveCaptionText with Double = js.native
  /* 11 */ val window: typings.winrt.Windows.UI.ViewManagement.UIElementType.window with Double = js.native
  /* 12 */ val windowText: typings.winrt.Windows.UI.ViewManagement.UIElementType.windowText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIElementType with Double] = js.native
}

