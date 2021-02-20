package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.Point
import typings.titanium.Titanium.Blob
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A button widget that has four states: normal, disabled, focused and selected.
  */
@js.native
trait Button extends View {
  
  /**
    * Specify an attributed string for the label.
    */
  var attributedString: AttributedString = js.native
  
  /**
    * Default button text color, as a color name or hex triplet.
    */
  var color: String | Color = js.native
  
  /**
    * Text color of the button in its disabled state, as a color name or hex triplet.
    */
  var disabledColor: String | Color = js.native
  
  /**
    * Set to `true` to enable the button, `false` to disable the button.
    */
  var enabled: Boolean = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ButtonClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ButtonDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ButtonDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ButtonFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ButtonKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ButtonLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ButtonLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ButtonPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ButtonPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ButtonSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ButtonSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ButtonTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ButtonTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ButtonTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ButtonTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ButtonTwofingertapEvent): Unit = js.native
  
  /**
    * Font to use for the button text.
    */
  var font: Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.attributedString> property.
    * @deprecated Access <Titanium.UI.Button.attributedString> instead.
    */
  def getAttributedString(): AttributedString = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.color> property.
    * @deprecated Access <Titanium.UI.Button.color> instead.
    */
  def getColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.disabledColor> property.
    * @deprecated Access <Titanium.UI.Button.disabledColor> instead.
    */
  def getDisabledColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.enabled> property.
    * @deprecated Access <Titanium.UI.Button.enabled> instead.
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.font> property.
    * @deprecated Access <Titanium.UI.Button.font> instead.
    */
  def getFont(): Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.image> property.
    * @deprecated Access <Titanium.UI.Button.image> instead.
    */
  def getImage(): String | Blob = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.selectedColor> property.
    * @deprecated Access <Titanium.UI.Button.selectedColor> instead.
    */
  def getSelectedColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.shadowColor> property.
    * @deprecated Access <Titanium.UI.Button.shadowColor> instead.
    */
  def getShadowColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.shadowOffset> property.
    * @deprecated Access <Titanium.UI.Button.shadowOffset> instead.
    */
  def getShadowOffset(): Point = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.shadowRadius> property.
    * @deprecated Access <Titanium.UI.Button.shadowRadius> instead.
    */
  def getShadowRadius(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.style> property.
    * @deprecated Access <Titanium.UI.Button.style> instead.
    */
  def getStyle(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.systemButton> property.
    * @deprecated Access <Titanium.UI.Button.systemButton> instead.
    */
  def getSystemButton(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.textAlign> property.
    * @deprecated Access <Titanium.UI.Button.textAlign> instead.
    */
  def getTextAlign(): String | Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.title> property.
    * @deprecated Access <Titanium.UI.Button.title> instead.
    */
  def getTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.titleid> property.
    * @deprecated Access <Titanium.UI.Button.titleid> instead.
    */
  def getTitleid(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Button.verticalAlign> property.
    * @deprecated Access <Titanium.UI.Button.verticalAlign> instead.
    */
  def getVerticalAlign(): Double | String = js.native
  
  /**
    * Image to display on the button, specified as a local path, URL or a `Blob`.
    */
  var image: String | Blob = js.native
  
  /**
    * Button text color used to indicate the selected state, as a color name or hex triplet.
    */
  var selectedColor: String | Color = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.attributedString> property.
    * @deprecated Set the value using <Titanium.UI.Button.attributedString> instead.
    */
  def setAttributedString(attributedString: AttributedString): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.color> property.
    * @deprecated Set the value using <Titanium.UI.Button.color> instead.
    */
  def setColor(color: String): Unit = js.native
  def setColor(color: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.disabledColor> property.
    * @deprecated Set the value using <Titanium.UI.Button.disabledColor> instead.
    */
  def setDisabledColor(disabledColor: String): Unit = js.native
  def setDisabledColor(disabledColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.enabled> property.
    * @deprecated Set the value using <Titanium.UI.Button.enabled> instead.
    */
  def setEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.font> property.
    * @deprecated Set the value using <Titanium.UI.Button.font> instead.
    */
  def setFont(font: Font): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.image> property.
    * @deprecated Set the value using <Titanium.UI.Button.image> instead.
    */
  def setImage(image: String): Unit = js.native
  def setImage(image: Blob): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.selectedColor> property.
    * @deprecated Set the value using <Titanium.UI.Button.selectedColor> instead.
    */
  def setSelectedColor(selectedColor: String): Unit = js.native
  def setSelectedColor(selectedColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.shadowColor> property.
    * @deprecated Set the value using <Titanium.UI.Button.shadowColor> instead.
    */
  def setShadowColor(shadowColor: String): Unit = js.native
  def setShadowColor(shadowColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.shadowOffset> property.
    * @deprecated Set the value using <Titanium.UI.Button.shadowOffset> instead.
    */
  def setShadowOffset(shadowOffset: Point): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.shadowRadius> property.
    * @deprecated Set the value using <Titanium.UI.Button.shadowRadius> instead.
    */
  def setShadowRadius(shadowRadius: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.style> property.
    * @deprecated Set the value using <Titanium.UI.Button.style> instead.
    */
  def setStyle(style: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.systemButton> property.
    * @deprecated Set the value using <Titanium.UI.Button.systemButton> instead.
    */
  def setSystemButton(systemButton: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.textAlign> property.
    * @deprecated Set the value using <Titanium.UI.Button.textAlign> instead.
    */
  def setTextAlign(textAlign: String): Unit = js.native
  def setTextAlign(textAlign: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.title> property.
    * @deprecated Set the value using <Titanium.UI.Button.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Button.titleid> property.
    * @deprecated Set the value using <Titanium.UI.Button.titleid> instead.
    */
  def setTitleid(titleid: String): Unit = js.native
  
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Button.verticalAlign> property.
    * @deprecated Set the value using <Titanium.UI.Button.verticalAlign> instead.
    */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
  
  /**
    * Shadow color of the [title](Titanium.UI.Button.title), as a color name or hex triplet.
    */
  var shadowColor: String | Color = js.native
  
  /**
    * Shadow offset of the [title](Titanium.UI.Button.title), as a dictionary with the properties `x` and `y`.
    */
  var shadowOffset: Point = js.native
  
  /**
    * Shadow radius of the [title](Titanium.UI.Button.title).
    */
  var shadowRadius: Double = js.native
  
  /**
    * Style constant for the button, as defined in <Titanium.UI.iOS.SystemButtonStyle>.
    */
  var style: Double = js.native
  
  /**
    * Specifies an iOS system button appearance, as defined in <Titanium.UI.iOS.SystemButton>.
    */
  var systemButton: Double = js.native
  
  /**
    * Text alignment, specified using one of the <Titanium.UI> text alignment constants.
    */
  var textAlign: String | Double = js.native
  
  /**
    * Button tint color.
    */
  @JSName("tintColor")
  var tintColor_Button: String = js.native
  
  /**
    * Button title.
    */
  var title: String = js.native
  
  /**
    * Key identifying a string from the locale file to use for the button title.
    */
  var titleid: String = js.native
  
  /**
    * Vertical alignment for the text field, specified using one of the
    * vertical alignment constants from <Titanium.UI>.
    */
  var verticalAlign: Double | String = js.native
}
