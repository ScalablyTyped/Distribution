package typings
package titaniumLib.TitaniumNs.UINs

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
  var autoLink: scala.Double = js.native
  /**
  			 * Number of pixels to extend the background image past the label on the bottom.
  			 */
  var backgroundPaddingBottom: scala.Double = js.native
  /**
  			 * Number of pixels to extend the background image past the label on the left.
  			 */
  var backgroundPaddingLeft: scala.Double = js.native
  /**
  			 * Number of pixels to extend the background image past the label on the right.
  			 */
  var backgroundPaddingRight: scala.Double = js.native
  /**
  			 * Number of pixels to extend the background image past the label on the top.
  			 */
  var backgroundPaddingTop: scala.Double = js.native
  /**
  			 * Color of the label text, as a color name or hex triplet.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * Causes words in the text that are longer than the view is wide to be ellipsized instead of broken in the middle.
  			 */
  var ellipsize: scala.Double = js.native
  /**
  			 * Font to use for the label text.
  			 */
  var font: titaniumLib.Font = js.native
  /**
  			 * Color of the label when in the highlighted state, as a color name or hex triplet.
  			 */
  var highlightedColor: java.lang.String = js.native
  /**
  			 * Simple HTML formatting.
  			 */
  var html: java.lang.String = js.native
  /**
  			 * Includes extra top and bottom padding to make room for accents that go above normal ascent and descent.
  			 */
  var includeFontPadding: scala.Boolean = js.native
  /**
  			 * Line spacing of the [text](Titanium.UI.Label.text), as a dictionary with the properties `add` and `multiply`.
  			 */
  var lineSpacing: js.Any = js.native
  /**
  			 * Makes the label be exactly this many lines tall.
  			 */
  var lines: scala.Double = js.native
  /**
  			 * Makes the label at most this many lines tall.
  			 */
  var maxLines: scala.Double = js.native
  /**
  			 * Minimum font size when the font is sized based on the contents.
  			 */
  var minimumFontSize: scala.Double = js.native
  /**
  			 * Shadow color of the [text](Titanium.UI.Label.text), as a color name or hex triplet.
  			 */
  var shadowColor: java.lang.String = js.native
  /**
  			 * Shadow offset of the [text](Titanium.UI.Label.text), as a dictionary with the properties `x` and `y`.
  			 */
  var shadowOffset: js.Any = js.native
  /**
  			 * Shadow radius of the [text](Titanium.UI.Label.text).
  			 */
  var shadowRadius: scala.Double = js.native
  /**
  			 * Label text.
  			 */
  var text: java.lang.String = js.native
  /**
  			 * Text alignment.
  			 */
  var textAlign: java.lang.String | scala.Double = js.native
  /**
  			 * Key identifying a string from the locale file to use for the label text.
  			 */
  var textid: java.lang.String = js.native
  /**
  			 * Vertical text alignment, specified using one of the  vertical alignment constants
  			 * from <Titanium.UI>.
  			 */
  var verticalAlign: scala.Double | java.lang.String = js.native
  /**
  			 * Enable or disable word wrapping in the label.
  			 */
  var wordWrap: scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.attributedString> property.
  			 */
  def getAttributedString(): AttributedString = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.autoLink> property.
  			 */
  def getAutoLink(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.backgroundPaddingBottom> property.
  			 */
  def getBackgroundPaddingBottom(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.backgroundPaddingLeft> property.
  			 */
  def getBackgroundPaddingLeft(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.backgroundPaddingRight> property.
  			 */
  def getBackgroundPaddingRight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.backgroundPaddingTop> property.
  			 */
  def getBackgroundPaddingTop(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.ellipsize> property.
  			 */
  def getEllipsize(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.highlightedColor> property.
  			 */
  def getHighlightedColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.html> property.
  			 */
  def getHtml(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.includeFontPadding> property.
  			 */
  def getIncludeFontPadding(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.lineSpacing> property.
  			 */
  def getLineSpacing(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.lines> property.
  			 */
  def getLines(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.maxLines> property.
  			 */
  def getMaxLines(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.minimumFontSize> property.
  			 */
  def getMinimumFontSize(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.shadowColor> property.
  			 */
  def getShadowColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.shadowOffset> property.
  			 */
  def getShadowOffset(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.shadowRadius> property.
  			 */
  def getShadowRadius(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.text> property.
  			 */
  def getText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.textAlign> property.
  			 */
  def getTextAlign(): java.lang.String | scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.textid> property.
  			 */
  def getTextid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.verticalAlign> property.
  			 */
  def getVerticalAlign(): scala.Double | java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Label.wordWrap> property.
  			 */
  def getWordWrap(): scala.Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.attributedString> property.
  			 */
  def setAttributedString(attributedString: AttributedString): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.autoLink> property.
  			 */
  def setAutoLink(autoLink: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.backgroundPaddingBottom> property.
  			 */
  def setBackgroundPaddingBottom(backgroundPaddingBottom: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.backgroundPaddingLeft> property.
  			 */
  def setBackgroundPaddingLeft(backgroundPaddingLeft: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.backgroundPaddingRight> property.
  			 */
  def setBackgroundPaddingRight(backgroundPaddingRight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.backgroundPaddingTop> property.
  			 */
  def setBackgroundPaddingTop(backgroundPaddingTop: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.ellipsize> property.
  			 */
  def setEllipsize(ellipsize: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.highlightedColor> property.
  			 */
  def setHighlightedColor(highlightedColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.html> property.
  			 */
  def setHtml(html: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.includeFontPadding> property.
  			 */
  def setIncludeFontPadding(includeFontPadding: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.lineSpacing> property.
  			 */
  def setLineSpacing(lineSpacing: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.lines> property.
  			 */
  def setLines(lines: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.maxLines> property.
  			 */
  def setMaxLines(maxLines: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.minimumFontSize> property.
  			 */
  def setMinimumFontSize(minimumFontSize: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.shadowColor> property.
  			 */
  def setShadowColor(shadowColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.shadowOffset> property.
  			 */
  def setShadowOffset(shadowOffset: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.shadowRadius> property.
  			 */
  def setShadowRadius(shadowRadius: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.text> property.
  			 */
  def setText(text: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.textAlign> property.
  			 */
  def setTextAlign(textAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.textAlign> property.
  			 */
  def setTextAlign(textAlign: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.textid> property.
  			 */
  def setTextid(textid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Label.wordWrap> property.
  			 */
  def setWordWrap(wordWrap: scala.Boolean): scala.Unit = js.native
}

