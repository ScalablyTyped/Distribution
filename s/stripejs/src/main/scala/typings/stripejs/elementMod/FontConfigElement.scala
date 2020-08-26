package typings.stripejs.elementMod

import typings.stripejs.stripejsStrings.bold
import typings.stripejs.stripejsStrings.bolder
import typings.stripejs.stripejsStrings.inherit
import typings.stripejs.stripejsStrings.initial
import typings.stripejs.stripejsStrings.italic
import typings.stripejs.stripejsStrings.lighter
import typings.stripejs.stripejsStrings.normal
import typings.stripejs.stripejsStrings.oblique
import typings.stripejs.stripejsStrings.revert
import typings.stripejs.stripejsStrings.unset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontConfigElement extends js.Object {
  /**
    * The name of the font family
    * @example 'Times New Roman'
    */
  var family: js.UndefOr[String] = js.native
  /**
    * A src value pointing to your custom font file.
    * @example
    * 'url(https://somewebsite.com/path/to/font.woff)'
    * 'url(path/to/font.woff)'
    */
  var src: js.UndefOr[String] = js.native
  /**
    * The style of the text
    * @default 'normal'
    */
  var style: js.UndefOr[normal | italic | oblique] = js.native
  /**
    * A unicode range for the font that should be used
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/@font-face/unicode-range
    */
  var unicodeRange: js.UndefOr[String] = js.native
  /**
    * The weight of the font
    * NOTE: This cannot be a number!
    */
  var weight: js.UndefOr[initial | inherit | bold | bolder | lighter | normal | revert | unset] = js.native
}

object FontConfigElement {
  @scala.inline
  def apply(): FontConfigElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontConfigElement]
  }
  @scala.inline
  implicit class FontConfigElementOps[Self <: FontConfigElement] (val x: Self) extends AnyVal {
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStyle(value: normal | italic | oblique): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUnicodeRange(value: String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
    @scala.inline
    def setWeight(value: initial | inherit | bold | bolder | lighter | normal | revert | unset): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

