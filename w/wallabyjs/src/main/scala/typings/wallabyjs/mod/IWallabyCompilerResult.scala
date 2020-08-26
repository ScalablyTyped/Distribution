package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWallabyCompilerResult extends js.Object {
  var code: String = js.native
  var map: String = js.native
  var ranges: js.Any = js.native
}

object IWallabyCompilerResult {
  @scala.inline
  def apply(code: String, map: String, ranges: js.Any): IWallabyCompilerResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyCompilerResult]
  }
  @scala.inline
  implicit class IWallabyCompilerResultOps[Self <: IWallabyCompilerResult] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setRanges(value: js.Any): Self = this.set("ranges", value.asInstanceOf[js.Any])
  }
  
}

