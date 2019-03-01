package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontConfigElement extends js.Object {
  /**
    * The name of the font family
    * @example 'Times New Roman'
    */
  var family: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A src value pointing to your custom font file.
    * @example
    * 'url(https://somewebsite.com/path/to/font.woff)'
    * 'url(path/to/font.woff)'
    */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The style of the text
    * @default 'normal'
    */
  var style: js.UndefOr[
    stripejsLib.stripejsLibStrings.normal | stripejsLib.stripejsLibStrings.italic | stripejsLib.stripejsLibStrings.oblique
  ] = js.undefined
  /**
    * A unicode range for the font that should be used
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/@font-face/unicode-range
    */
  var unicodeRange: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The weight of the font
    * NOTE: This cannot be a number!
    */
  var weight: js.UndefOr[
    stripejsLib.stripejsLibStrings.initial | stripejsLib.stripejsLibStrings.inherit | stripejsLib.stripejsLibStrings.bold | stripejsLib.stripejsLibStrings.bolder | stripejsLib.stripejsLibStrings.lighter | stripejsLib.stripejsLibStrings.normal | stripejsLib.stripejsLibStrings.revert | stripejsLib.stripejsLibStrings.unset
  ] = js.undefined
}

object FontConfigElement {
  @scala.inline
  def apply(
    family: java.lang.String = null,
    src: java.lang.String = null,
    style: stripejsLib.stripejsLibStrings.normal | stripejsLib.stripejsLibStrings.italic | stripejsLib.stripejsLibStrings.oblique = null,
    unicodeRange: java.lang.String = null,
    weight: stripejsLib.stripejsLibStrings.initial | stripejsLib.stripejsLibStrings.inherit | stripejsLib.stripejsLibStrings.bold | stripejsLib.stripejsLibStrings.bolder | stripejsLib.stripejsLibStrings.lighter | stripejsLib.stripejsLibStrings.normal | stripejsLib.stripejsLibStrings.revert | stripejsLib.stripejsLibStrings.unset = null
  ): FontConfigElement = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family)
    if (src != null) __obj.updateDynamic("src")(src)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConfigElement]
  }
}

