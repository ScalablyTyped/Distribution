package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransparencyChar extends js.Object {
  var attr: Double | Attributes = js.native
  var transparencyChar: String = js.native
  var transparencyType: Double = js.native
}

object TransparencyChar {
  @scala.inline
  def apply(attr: Double | Attributes, transparencyChar: String, transparencyType: Double): TransparencyChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], transparencyChar = transparencyChar.asInstanceOf[js.Any], transparencyType = transparencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransparencyChar]
  }
  @scala.inline
  implicit class TransparencyCharOps[Self <: TransparencyChar] (val x: Self) extends AnyVal {
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
    def setAttr(value: Double | Attributes): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransparencyChar(value: String): Self = this.set("transparencyChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransparencyType(value: Double): Self = this.set("transparencyType", value.asInstanceOf[js.Any])
  }
  
}

