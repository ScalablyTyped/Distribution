package typings.tabris.mod

import typings.tabris.AnonChildren
import typings.tabris.OmitTextViewset
import typings.tabris.tabrisStrings.alignment
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.font
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.lineSpacing
import typings.tabris.tabrisStrings.markupEnabled
import typings.tabris.tabrisStrings.maxLines
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.selectable
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.text
import typings.tabris.tabrisStrings.textColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "TextView")
@js.native
class TextView () extends Widget {
  def this(properties: Properties[TextView, OmitTextViewset]) = this()
  /**
    * The horizontal alignment of the text.
    */
  var alignment: centerX | left | right = js.native
  /**
    * The font used for the text.
    */
  var font: FontValue = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_TextView: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with AnonChildren = js.native
  /**
    * The amount of space between each line of text. The `lineSpacing` property is a factor with a default
    * value of `1.0`.
    */
  var lineSpacing: Double = js.native
  /**
    * Allows for a subset of HTML tags in the text. Supported tags are: `a`, `del`, `ins`, `b`, `i`,
    * `strong`, `em`, `big`, `small`, `br`. All tags must be closed (e.g. use `<br/>` instead of `<br>`).
    * Nesting tags is not supported on iOS. A platform might allow to use additional tags but
    * cross-platform compatibility is only guaranteed for the tags listed above. When the text is given as
    * the content of a `<TextView>` JSX element, `markupEnabled` will parse the text more like HTML, i.e.
    * consecutive white spaces will be merged.
    */
  var markupEnabled: Boolean = js.native
  /**
    * Limit the number of lines to be displayed to the given maximum. `null` disables this limit.
    */
  var maxLines: Double | Null = js.native
  /**
    * Fired when the [*alignment*](#alignment) property has changed.
    */
  var onAlignmentChanged: ChangeListeners[this.type, alignment] = js.native
  /**
    * Fired when the [*font*](#font) property has changed.
    */
  var onFontChanged: ChangeListeners[this.type, font] = js.native
  /**
    * Fired when the [*lineSpacing*](#lineSpacing) property has changed.
    */
  var onLineSpacingChanged: ChangeListeners[this.type, lineSpacing] = js.native
  /**
    * Fired when the [*markupEnabled*](#markupEnabled) property has changed.
    */
  var onMarkupEnabledChanged: ChangeListeners[this.type, markupEnabled] = js.native
  /**
    * Fired when the [*maxLines*](#maxLines) property has changed.
    */
  var onMaxLinesChanged: ChangeListeners[this.type, maxLines] = js.native
  /**
    * Fired when the [*selectable*](#selectable) property has changed.
    */
  var onSelectableChanged: ChangeListeners[this.type, selectable] = js.native
  /**
    * Fires when the user clicks on a link in an html text. Requires to set `markupEnabled` to true and to
    * provide a text containing an anchor (`<a>`) with an `href` attribute. Eg. `textView.text = 'Website:
    * <a href="http://example.com>example.com</a>'`. The event object contains a property `url` which
    * provides the anchors `href` url.
    */
  var onTapLink: Listeners[TextViewTapLinkEvent[this.type]] = js.native
  /**
    * Fired when the [*text*](#text) property has changed.
    */
  var onTextChanged: ChangeListeners[this.type, text] = js.native
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    */
  var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
  /**
    * Whether the text can be selected or not.
    */
  var selectable: Boolean = js.native
  /**
    * The text to display.
    */
  var text: String = js.native
  /**
    * The color of the text.
    */
  var textColor: ColorValue = js.native
}

