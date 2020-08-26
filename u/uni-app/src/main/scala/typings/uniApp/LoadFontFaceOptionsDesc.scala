package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadFontFaceOptionsDesc extends js.Object {
  /**
    * 字体样式，可选值为 normal、italic、oblique
    */
  var style: js.UndefOr[String] = js.native
  /**
    * 设置小型大写字母的字体显示文本，可选值为 normal、small-caps、inherit
    */
  var variant: js.UndefOr[String] = js.native
  /**
    * 字体粗细，可选值为 normal、bold、100、200../ 900
    */
  var weight: js.UndefOr[String] = js.native
}

object LoadFontFaceOptionsDesc {
  @scala.inline
  def apply(): LoadFontFaceOptionsDesc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFontFaceOptionsDesc]
  }
  @scala.inline
  implicit class LoadFontFaceOptionsDescOps[Self <: LoadFontFaceOptionsDesc] (val x: Self) extends AnyVal {
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
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
    @scala.inline
    def setWeight(value: String): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

