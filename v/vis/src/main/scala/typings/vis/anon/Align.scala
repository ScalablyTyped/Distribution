package typings.vis.anon

import typings.vis.mod.FontOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Align extends js.Object {
  var align: js.UndefOr[String] = js.native
  var background: js.UndefOr[String] = js.native
  var bold: js.UndefOr[String | FontOptions] = js.native
  var boldital: js.UndefOr[String | FontOptions] = js.native
  var color: js.UndefOr[String] = js.native
   // px
  var face: js.UndefOr[String] = js.native
  var ital: js.UndefOr[String | FontOptions] = js.native
  var mono: js.UndefOr[String | FontOptions] = js.native
  var multi: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
   // px
  var strokeColor: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var vadjust: js.UndefOr[String] = js.native
}

object Align {
  @scala.inline
  def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBold(value: String | FontOptions): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setBoldital(value: String | FontOptions): Self = this.set("boldital", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoldital: Self = this.set("boldital", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFace(value: String): Self = this.set("face", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFace: Self = this.set("face", js.undefined)
    @scala.inline
    def setItal(value: String | FontOptions): Self = this.set("ital", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItal: Self = this.set("ital", js.undefined)
    @scala.inline
    def setMono(value: String | FontOptions): Self = this.set("mono", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMono: Self = this.set("mono", js.undefined)
    @scala.inline
    def setMulti(value: String): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setVadjust(value: String): Self = this.set("vadjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVadjust: Self = this.set("vadjust", js.undefined)
  }
  
}

