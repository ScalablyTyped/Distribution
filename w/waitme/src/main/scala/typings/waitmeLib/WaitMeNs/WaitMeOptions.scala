package typings
package waitmeLib.WaitMeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitMeOptions extends js.Object {
  /**
    * background for container (string).
    * Use: 'rgba(255,255,255,0.7)'. You can use color and image.
    */
  var bg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * color for background animation and text (string, array).
    * Use: '#000', ['','',...] - you can use multicolor for effect
    */
  var color: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * animation effect (string).
    * Use: 'bounce' - default
    *      | none
    *      | rotateplane
    *      | stretch
    *      | orbit
    *      | roundBounce
    *      | win8
    *      | win8_linear
    *      | ios
    *      | facebook
    *      | rotation
    *      | timer
    *      | pulse
    *      | progressBar
    *      | bouncePulse
    *      | img
    */
  var effect: js.UndefOr[
    waitmeLib.waitmeLibStrings.none | waitmeLib.waitmeLibStrings.bounce | waitmeLib.waitmeLibStrings.rotateplane | waitmeLib.waitmeLibStrings.stretch | waitmeLib.waitmeLibStrings.orbit | waitmeLib.waitmeLibStrings.roundBounce | waitmeLib.waitmeLibStrings.win8 | waitmeLib.waitmeLibStrings.win8_linear | waitmeLib.waitmeLibStrings.ios | waitmeLib.waitmeLibStrings.facebook | waitmeLib.waitmeLibStrings.rotation | waitmeLib.waitmeLibStrings.timer | waitmeLib.waitmeLibStrings.pulse | waitmeLib.waitmeLibStrings.progressBar | waitmeLib.waitmeLibStrings.bouncePulse | waitmeLib.waitmeLibStrings.img
  ] = js.undefined
  /**
    * change font size (string).
    * Use: '18px'. By default, use empty string.
    */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * set max size for elem animation (string).
    * Use: 40. By default, use empty string.
    */
  var maxSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * code execution after closed (function).
    * Use: function(){ //your code here... } or ()=>{ //your code here... }
    * @returns {void} 
    */
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * url to image (string).
    * Use: 'url'. By default, use empty string. Use with effect: 'img'.
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * place text under the effect (string).
    * Use: 'text'.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * change text position (string).
    * Use: 'vertical' - default, 'horizontal'.
    */
  var textPos: js.UndefOr[waitmeLib.waitmeLibStrings.vertical | waitmeLib.waitmeLibStrings.horizontal] = js.undefined
}

object WaitMeOptions {
  @scala.inline
  def apply(
    bg: java.lang.String = null,
    color: java.lang.String | js.Array[java.lang.String] = null,
    effect: waitmeLib.waitmeLibStrings.none | waitmeLib.waitmeLibStrings.bounce | waitmeLib.waitmeLibStrings.rotateplane | waitmeLib.waitmeLibStrings.stretch | waitmeLib.waitmeLibStrings.orbit | waitmeLib.waitmeLibStrings.roundBounce | waitmeLib.waitmeLibStrings.win8 | waitmeLib.waitmeLibStrings.win8_linear | waitmeLib.waitmeLibStrings.ios | waitmeLib.waitmeLibStrings.facebook | waitmeLib.waitmeLibStrings.rotation | waitmeLib.waitmeLibStrings.timer | waitmeLib.waitmeLibStrings.pulse | waitmeLib.waitmeLibStrings.progressBar | waitmeLib.waitmeLibStrings.bouncePulse | waitmeLib.waitmeLibStrings.img = null,
    fontSize: java.lang.String = null,
    maxSize: scala.Double | java.lang.String = null,
    onClose: () => scala.Unit = null,
    source: java.lang.String = null,
    text: java.lang.String = null,
    textPos: waitmeLib.waitmeLibStrings.vertical | waitmeLib.waitmeLibStrings.horizontal = null
  ): WaitMeOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (source != null) __obj.updateDynamic("source")(source)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textPos != null) __obj.updateDynamic("textPos")(textPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitMeOptions]
  }
}

