package typings.wiredep.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replace extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: RegExp = js.native
  var detect: Less = js.native
  var replace: CssLess = js.native
}

object Replace {
  @scala.inline
  def apply(block: RegExp, detect: Less, replace: CssLess): Replace = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
  @scala.inline
  implicit class ReplaceOps[Self <: Replace] (val x: Self) extends AnyVal {
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
    def setDetect(value: Less): Self = this.set("detect", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplace(value: CssLess): Self = this.set("replace", value.asInstanceOf[js.Any])
  }
  
}

