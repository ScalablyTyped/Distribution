package typings.wiredep.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  /**
    *  match the beginning-to-end of a bower block in this type of file
    */
  var block: RegExp = js.native
  var detect: TypeOfBowerFile = js.native
  var replace: AnotherTypeOfBowerFile = js.native
}

object Block {
  @scala.inline
  def apply(block: RegExp, detect: TypeOfBowerFile, replace: AnotherTypeOfBowerFile): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
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
    def setBlock(value: RegExp): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetect(value: TypeOfBowerFile): Self = this.set("detect", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplace(value: AnotherTypeOfBowerFile): Self = this.set("replace", value.asInstanceOf[js.Any])
  }
  
}

