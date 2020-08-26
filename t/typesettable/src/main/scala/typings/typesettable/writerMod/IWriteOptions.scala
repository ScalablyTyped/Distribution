package typings.typesettable.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWriteOptions extends js.Object {
  /**
    * An optional cardinal-direction rotation for the whole text block.
    *
    * Supported rotations are -90, 0, 180, and 90.
    *
    * @default 0
    */
  var textRotation: js.UndefOr[Double] = js.native
  /**
    * An optional shear angle. Shearing allows the rotation and re-alignment of
    * individual lines as opposed to the whole text block.
    *
    * Supported shears are between -80 and 80 degrees.
    *
    * @default 0
    */
  var textShear: js.UndefOr[Double] = js.native
  /**
    * The x-alignment of text.
    *
    * @default "left"
    */
  var xAlign: js.UndefOr[IXAlign] = js.native
  /**
    * The y-alignment of text.
    *
    * @default "top"
    */
  var yAlign: js.UndefOr[IYAlign] = js.native
}

object IWriteOptions {
  @scala.inline
  def apply(): IWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriteOptions]
  }
  @scala.inline
  implicit class IWriteOptionsOps[Self <: IWriteOptions] (val x: Self) extends AnyVal {
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
    def setTextRotation(value: Double): Self = this.set("textRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextRotation: Self = this.set("textRotation", js.undefined)
    @scala.inline
    def setTextShear(value: Double): Self = this.set("textShear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextShear: Self = this.set("textShear", js.undefined)
    @scala.inline
    def setXAlign(value: IXAlign): Self = this.set("xAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAlign: Self = this.set("xAlign", js.undefined)
    @scala.inline
    def setYAlign(value: IYAlign): Self = this.set("yAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAlign: Self = this.set("yAlign", js.undefined)
  }
  
}

