package typings.waitme.WaitMeNs

import typings.waitme.waitmeStrings.bounce
import typings.waitme.waitmeStrings.bouncePulse
import typings.waitme.waitmeStrings.facebook
import typings.waitme.waitmeStrings.horizontal
import typings.waitme.waitmeStrings.img
import typings.waitme.waitmeStrings.ios
import typings.waitme.waitmeStrings.none
import typings.waitme.waitmeStrings.orbit
import typings.waitme.waitmeStrings.progressBar
import typings.waitme.waitmeStrings.pulse
import typings.waitme.waitmeStrings.rotateplane
import typings.waitme.waitmeStrings.rotation
import typings.waitme.waitmeStrings.roundBounce
import typings.waitme.waitmeStrings.stretch
import typings.waitme.waitmeStrings.timer
import typings.waitme.waitmeStrings.vertical
import typings.waitme.waitmeStrings.win8
import typings.waitme.waitmeStrings.win8_linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitMeOptions extends js.Object {
  /**
    * background for container (string).
    * Use: 'rgba(255,255,255,0.7)'. You can use color and image.
    */
  var bg: js.UndefOr[String] = js.undefined
  /**
    * color for background animation and text (string, array).
    * Use: '#000', ['','',...] - you can use multicolor for effect
    */
  var color: js.UndefOr[String | js.Array[String]] = js.undefined
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
    none | bounce | rotateplane | stretch | orbit | roundBounce | win8 | win8_linear | ios | facebook | rotation | timer | pulse | progressBar | bouncePulse | img
  ] = js.undefined
  /**
    * change font size (string).
    * Use: '18px'. By default, use empty string.
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /**
    * set max size for elem animation (string).
    * Use: 40. By default, use empty string.
    */
  var maxSize: js.UndefOr[Double | String] = js.undefined
  /**
    * code execution after closed (function).
    * Use: function(){ //your code here... } or ()=>{ //your code here... }
    * @returns {void} 
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * url to image (string).
    * Use: 'url'. By default, use empty string. Use with effect: 'img'.
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * place text under the effect (string).
    * Use: 'text'.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * change text position (string).
    * Use: 'vertical' - default, 'horizontal'.
    */
  var textPos: js.UndefOr[vertical | horizontal] = js.undefined
}

object WaitMeOptions {
  @scala.inline
  def apply(
    bg: String = null,
    color: String | js.Array[String] = null,
    effect: none | bounce | rotateplane | stretch | orbit | roundBounce | win8 | win8_linear | ios | facebook | rotation | timer | pulse | progressBar | bouncePulse | img = null,
    fontSize: String = null,
    maxSize: Double | String = null,
    onClose: () => Unit = null,
    source: String = null,
    text: String = null,
    textPos: vertical | horizontal = null
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

