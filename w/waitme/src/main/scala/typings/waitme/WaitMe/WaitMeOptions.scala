package typings.waitme.WaitMe

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

@js.native
trait WaitMeOptions extends js.Object {
  /**
    * background for container (string).
    * Use: 'rgba(255,255,255,0.7)'. You can use color and image.
    */
  var bg: js.UndefOr[String] = js.native
  /**
    * color for background animation and text (string, array).
    * Use: '#000', ['','',...] - you can use multicolor for effect
    */
  var color: js.UndefOr[String | js.Array[String]] = js.native
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
  ] = js.native
  /**
    * change font size (string).
    * Use: '18px'. By default, use empty string.
    */
  var fontSize: js.UndefOr[String] = js.native
  /**
    * set max size for elem animation (string).
    * Use: 40. By default, use empty string.
    */
  var maxSize: js.UndefOr[Double | String] = js.native
  /**
    * code execution after closed (function).
    * Use: function(){ //your code here... } or ()=>{ //your code here... }
    * @returns {void} 
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * url to image (string).
    * Use: 'url'. By default, use empty string. Use with effect: 'img'.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * place text under the effect (string).
    * Use: 'text'.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * change text position (string).
    * Use: 'vertical' - default, 'horizontal'.
    */
  var textPos: js.UndefOr[vertical | horizontal] = js.native
}

object WaitMeOptions {
  @scala.inline
  def apply(): WaitMeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitMeOptions]
  }
  @scala.inline
  implicit class WaitMeOptionsOps[Self <: WaitMeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    @scala.inline
    def setColorVarargs(value: String*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: String | js.Array[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setEffect(
      value: none | bounce | rotateplane | stretch | orbit | roundBounce | win8 | win8_linear | ios | facebook | rotation | timer | pulse | progressBar | bouncePulse | img
    ): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setMaxSize(value: Double | String): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextPos(value: vertical | horizontal): Self = this.set("textPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPos: Self = this.set("textPos", js.undefined)
  }
  
}

