package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.LabelLineSpacing
import typings.titanium.Point
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.link
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A text label, with an optional background image.
  */
@js.native
trait Label extends View {
  
  @JSName("addEventListener")
  def addEventListener_link(name: link, callback: js.ThisFunction1[/* this */ this.type, /* event */ LabelLinkEvent, Unit]): Unit = js.native
  
  /**
    * Specify an attributed string for the label.
    */
  var attributedString: AttributedString = js.native
  
  /**
    * Automatically convert certain text items in the label to clickable links.
    */
  var autoLink: Double = js.native
  
  /**
    * Number of pixels to extend the background image past the label on the bottom.
    */
  var backgroundPaddingBottom: Double = js.native
  
  /**
    * Number of pixels to extend the background image past the label on the left.
    */
  var backgroundPaddingLeft: Double = js.native
  
  /**
    * Number of pixels to extend the background image past the label on the right.
    */
  var backgroundPaddingRight: Double = js.native
  
  /**
    * Number of pixels to extend the background image past the label on the top.
    */
  var backgroundPaddingTop: Double = js.native
  
  /**
    * Color of the label text, as a color name or hex triplet.
    */
  var color: String | Color = js.native
  
  /**
    * Causes words in the text that are longer than the view is wide to be ellipsized instead of broken in the middle.
    */
  var ellipsize: Double = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: LabelClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: LabelDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: LabelDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: LabelFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: LabelKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_link(name: link): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_link(name: link, event: LabelLinkEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: LabelLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: LabelLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: LabelPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: LabelPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: LabelSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: LabelSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: LabelTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: LabelTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: LabelTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: LabelTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: LabelTwofingertapEvent): Unit = js.native
  
  /**
    * Font to use for the label text.
    */
  var font: Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.attributedString> property.
    * @deprecated Access <Titanium.UI.Label.attributedString> instead.
    */
  def getAttributedString(): AttributedString = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.autoLink> property.
    * @deprecated Access <Titanium.UI.Label.autoLink> instead.
    */
  def getAutoLink(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.backgroundPaddingBottom> property.
    * @deprecated Access <Titanium.UI.Label.backgroundPaddingBottom> instead.
    */
  def getBackgroundPaddingBottom(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.backgroundPaddingLeft> property.
    * @deprecated Access <Titanium.UI.Label.backgroundPaddingLeft> instead.
    */
  def getBackgroundPaddingLeft(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.backgroundPaddingRight> property.
    * @deprecated Access <Titanium.UI.Label.backgroundPaddingRight> instead.
    */
  def getBackgroundPaddingRight(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.backgroundPaddingTop> property.
    * @deprecated Access <Titanium.UI.Label.backgroundPaddingTop> instead.
    */
  def getBackgroundPaddingTop(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.color> property.
    * @deprecated Access <Titanium.UI.Label.color> instead.
    */
  def getColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.ellipsize> property.
    * @deprecated Access <Titanium.UI.Label.ellipsize> instead.
    */
  def getEllipsize(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.font> property.
    * @deprecated Access <Titanium.UI.Label.font> instead.
    */
  def getFont(): Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.highlightedColor> property.
    * @deprecated Access <Titanium.UI.Label.highlightedColor> instead.
    */
  def getHighlightedColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.html> property.
    * @deprecated Access <Titanium.UI.Label.html> instead.
    */
  def getHtml(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.includeFontPadding> property.
    * @deprecated Access <Titanium.UI.Label.includeFontPadding> instead.
    */
  def getIncludeFontPadding(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.lineSpacing> property.
    * @deprecated Access <Titanium.UI.Label.lineSpacing> instead.
    */
  def getLineSpacing(): LabelLineSpacing = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.lines> property.
    * @deprecated Access <Titanium.UI.Label.lines> instead.
    */
  def getLines(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.maxLines> property.
    * @deprecated Access <Titanium.UI.Label.maxLines> instead.
    */
  def getMaxLines(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.minimumFontSize> property.
    * @deprecated Access <Titanium.UI.Label.minimumFontSize> instead.
    */
  def getMinimumFontSize(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.shadowColor> property.
    * @deprecated Access <Titanium.UI.Label.shadowColor> instead.
    */
  def getShadowColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.shadowOffset> property.
    * @deprecated Access <Titanium.UI.Label.shadowOffset> instead.
    */
  def getShadowOffset(): Point = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.shadowRadius> property.
    * @deprecated Access <Titanium.UI.Label.shadowRadius> instead.
    */
  def getShadowRadius(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.text> property.
    * @deprecated Access <Titanium.UI.Label.text> instead.
    */
  def getText(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.textAlign> property.
    * @deprecated Access <Titanium.UI.Label.textAlign> instead.
    */
  def getTextAlign(): String | Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.textid> property.
    * @deprecated Access <Titanium.UI.Label.textid> instead.
    */
  def getTextid(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.verticalAlign> property.
    * @deprecated Access <Titanium.UI.Label.verticalAlign> instead.
    */
  def getVerticalAlign(): Double | String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Label.wordWrap> property.
    * @deprecated If you want to disable wrapping, then set [Titanium.UI.Label.maxLines](Titanium.UI.Label.maxLines) to 1 instead.
    */
  def getWordWrap(): Boolean = js.native
  
  /**
    * Color of the label when in the highlighted state, as a color name or hex triplet.
    */
  var highlightedColor: String | Color = js.native
  
  /**
    * Simple HTML formatting.
    */
  var html: String = js.native
  
  /**
    * Includes extra top and bottom padding to make room for accents that go above normal ascent and descent.
    */
  var includeFontPadding: Boolean = js.native
  
  /**
    * Line spacing of the [text](Titanium.UI.Label.text), as a dictionary with the properties `add` and `multiply`.
    */
  var lineSpacing: LabelLineSpacing = js.native
  
  /**
    * Makes the label be exactly this many lines tall.
    */
  var lines: Double = js.native
  
  /**
    * Makes the label at most this many lines tall.
    */
  var maxLines: Double = js.native
  
  /**
    * Minimum font size when the font is sized based on the contents.
    */
  var minimumFontSize: Double = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_link(name: link, callback: js.ThisFunction1[/* this */ this.type, /* event */ LabelLinkEvent, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.attributedString> property.
    * @deprecated Set the value using <Titanium.UI.Label.attributedString> instead.
    */
  def setAttributedString(attributedString: AttributedString): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.autoLink> property.
    * @deprecated Set the value using <Titanium.UI.Label.autoLink> instead.
    */
  def setAutoLink(autoLink: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.backgroundPaddingBottom> property.
    * @deprecated Set the value using <Titanium.UI.Label.backgroundPaddingBottom> instead.
    */
  def setBackgroundPaddingBottom(backgroundPaddingBottom: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.backgroundPaddingLeft> property.
    * @deprecated Set the value using <Titanium.UI.Label.backgroundPaddingLeft> instead.
    */
  def setBackgroundPaddingLeft(backgroundPaddingLeft: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.backgroundPaddingRight> property.
    * @deprecated Set the value using <Titanium.UI.Label.backgroundPaddingRight> instead.
    */
  def setBackgroundPaddingRight(backgroundPaddingRight: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.backgroundPaddingTop> property.
    * @deprecated Set the value using <Titanium.UI.Label.backgroundPaddingTop> instead.
    */
  def setBackgroundPaddingTop(backgroundPaddingTop: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.color> property.
    * @deprecated Set the value using <Titanium.UI.Label.color> instead.
    */
  def setColor(color: String): Unit = js.native
  def setColor(color: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.ellipsize> property.
    * @deprecated Set the value using <Titanium.UI.Label.ellipsize> instead.
    */
  def setEllipsize(ellipsize: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.font> property.
    * @deprecated Set the value using <Titanium.UI.Label.font> instead.
    */
  def setFont(font: Font): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.highlightedColor> property.
    * @deprecated Set the value using <Titanium.UI.Label.highlightedColor> instead.
    */
  def setHighlightedColor(highlightedColor: String): Unit = js.native
  def setHighlightedColor(highlightedColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.html> property.
    * @deprecated Set the value using <Titanium.UI.Label.html> instead.
    */
  def setHtml(html: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.includeFontPadding> property.
    * @deprecated Set the value using <Titanium.UI.Label.includeFontPadding> instead.
    */
  def setIncludeFontPadding(includeFontPadding: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.lineSpacing> property.
    * @deprecated Set the value using <Titanium.UI.Label.lineSpacing> instead.
    */
  def setLineSpacing(lineSpacing: LabelLineSpacing): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.lines> property.
    * @deprecated Set the value using <Titanium.UI.Label.lines> instead.
    */
  def setLines(lines: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.maxLines> property.
    * @deprecated Set the value using <Titanium.UI.Label.maxLines> instead.
    */
  def setMaxLines(maxLines: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.minimumFontSize> property.
    * @deprecated Set the value using <Titanium.UI.Label.minimumFontSize> instead.
    */
  def setMinimumFontSize(minimumFontSize: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.shadowColor> property.
    * @deprecated Set the value using <Titanium.UI.Label.shadowColor> instead.
    */
  def setShadowColor(shadowColor: String): Unit = js.native
  def setShadowColor(shadowColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.shadowOffset> property.
    * @deprecated Set the value using <Titanium.UI.Label.shadowOffset> instead.
    */
  def setShadowOffset(shadowOffset: Point): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.shadowRadius> property.
    * @deprecated Set the value using <Titanium.UI.Label.shadowRadius> instead.
    */
  def setShadowRadius(shadowRadius: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.text> property.
    * @deprecated Set the value using <Titanium.UI.Label.text> instead.
    */
  def setText(text: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.textAlign> property.
    * @deprecated Set the value using <Titanium.UI.Label.textAlign> instead.
    */
  def setTextAlign(textAlign: String): Unit = js.native
  def setTextAlign(textAlign: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.textid> property.
    * @deprecated Set the value using <Titanium.UI.Label.textid> instead.
    */
  def setTextid(textid: String): Unit = js.native
  
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.Label.verticalAlign> property.
    * @deprecated Set the value using <Titanium.UI.Label.verticalAlign> instead.
    */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.Label.wordWrap> property.
    * @deprecated If you want to disable wrapping, then set [Titanium.UI.Label.maxLines](Titanium.UI.Label.maxLines) to 1 instead.
    */
  def setWordWrap(wordWrap: Boolean): Unit = js.native
  
  /**
    * Shadow color of the [text](Titanium.UI.Label.text), as a color name or hex triplet.
    */
  var shadowColor: String | Color = js.native
  
  /**
    * Shadow offset of the [text](Titanium.UI.Label.text), as a dictionary with the properties `x` and `y`.
    */
  var shadowOffset: Point = js.native
  
  /**
    * Shadow radius of the [text](Titanium.UI.Label.text).
    */
  var shadowRadius: Double = js.native
  
  /**
    * Label text.
    */
  var text: String = js.native
  
  /**
    * Text alignment.
    */
  var textAlign: String | Double = js.native
  
  /**
    * Key identifying a string from the locale file to use for the label text.
    */
  var textid: String = js.native
  
  /**
    * Vertical text alignment, specified using one of the  vertical alignment constants
    * from <Titanium.UI>.
    */
  var verticalAlign: Double | String = js.native
  
  /**
    * Enable or disable word wrapping in the label.
    * @deprecated If you want to disable wrapping, then set [Titanium.UI.Label.maxLines](Titanium.UI.Label.maxLines) to 1 instead.
    */
  var wordWrap: Boolean = js.native
}
