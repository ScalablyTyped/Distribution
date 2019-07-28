package typings.titanium.TitaniumNs.UINs

import typings.titanium.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A text label, with an optional background image.
		 */
@js.native
trait Label extends View {
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
  var color: String = js.native
  /**
  			 * Causes words in the text that are longer than the view is wide to be ellipsized instead of broken in the middle.
  			 */
  var ellipsize: Double = js.native
  /**
  			 * Font to use for the label text.
  			 */
  var font: Font = js.native
  /**
  			 * Color of the label when in the highlighted state, as a color name or hex triplet.
  			 */
  var highlightedColor: String = js.native
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
  var lineSpacing: js.Any = js.native
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
  /**
  			 * Shadow color of the [text](Titanium.UI.Label.text), as a color name or hex triplet.
  			 */
  var shadowColor: String = js.native
  /**
  			 * Shadow offset of the [text](Titanium.UI.Label.text), as a dictionary with the properties `x` and `y`.
  			 */
  var shadowOffset: js.Any = js.native
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
  			 */
  var wordWrap: Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.attributedString> property.
  			 */
  def getAttributedString(): AttributedString = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.autoLink> property.
  			 */
  def getAutoLink(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.backgroundPaddingBottom> property.
  			 */
  def getBackgroundPaddingBottom(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.backgroundPaddingLeft> property.
  			 */
  def getBackgroundPaddingLeft(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.backgroundPaddingRight> property.
  			 */
  def getBackgroundPaddingRight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.backgroundPaddingTop> property.
  			 */
  def getBackgroundPaddingTop(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.ellipsize> property.
  			 */
  def getEllipsize(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.highlightedColor> property.
  			 */
  def getHighlightedColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.html> property.
  			 */
  def getHtml(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.includeFontPadding> property.
  			 */
  def getIncludeFontPadding(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.lineSpacing> property.
  			 */
  def getLineSpacing(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.lines> property.
  			 */
  def getLines(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.maxLines> property.
  			 */
  def getMaxLines(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.minimumFontSize> property.
  			 */
  def getMinimumFontSize(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.shadowColor> property.
  			 */
  def getShadowColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.shadowOffset> property.
  			 */
  def getShadowOffset(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.shadowRadius> property.
  			 */
  def getShadowRadius(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.text> property.
  			 */
  def getText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.textAlign> property.
  			 */
  def getTextAlign(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.textid> property.
  			 */
  def getTextid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.verticalAlign> property.
  			 */
  def getVerticalAlign(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.wordWrap> property.
  			 */
  def getWordWrap(): Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.attributedString> property.
  			 */
  def setAttributedString(attributedString: AttributedString): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.autoLink> property.
  			 */
  def setAutoLink(autoLink: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.backgroundPaddingBottom> property.
  			 */
  def setBackgroundPaddingBottom(backgroundPaddingBottom: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.backgroundPaddingLeft> property.
  			 */
  def setBackgroundPaddingLeft(backgroundPaddingLeft: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.backgroundPaddingRight> property.
  			 */
  def setBackgroundPaddingRight(backgroundPaddingRight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.backgroundPaddingTop> property.
  			 */
  def setBackgroundPaddingTop(backgroundPaddingTop: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.ellipsize> property.
  			 */
  def setEllipsize(ellipsize: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.highlightedColor> property.
  			 */
  def setHighlightedColor(highlightedColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.html> property.
  			 */
  def setHtml(html: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.includeFontPadding> property.
  			 */
  def setIncludeFontPadding(includeFontPadding: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.lineSpacing> property.
  			 */
  def setLineSpacing(lineSpacing: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.lines> property.
  			 */
  def setLines(lines: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.maxLines> property.
  			 */
  def setMaxLines(maxLines: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.minimumFontSize> property.
  			 */
  def setMinimumFontSize(minimumFontSize: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.shadowColor> property.
  			 */
  def setShadowColor(shadowColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.shadowOffset> property.
  			 */
  def setShadowOffset(shadowOffset: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.shadowRadius> property.
  			 */
  def setShadowRadius(shadowRadius: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.text> property.
  			 */
  def setText(text: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.textAlign> property.
  			 */
  def setTextAlign(textAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.textAlign> property.
  			 */
  def setTextAlign(textAlign: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.textid> property.
  			 */
  def setTextid(textid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.wordWrap> property.
  			 */
  def setWordWrap(wordWrap: Boolean): Unit = js.native
}

