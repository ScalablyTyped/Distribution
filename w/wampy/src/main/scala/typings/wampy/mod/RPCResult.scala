package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RPCResult extends Args {
  var options: RPCOptions = js.native
}

object RPCResult {
  @scala.inline
  def apply(argsDict: Dict, argsList: js.Array[_], options: RPCOptions): RPCResult = {
    val __obj = js.Dynamic.literal(argsDict = argsDict.asInstanceOf[js.Any], argsList = argsList.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCResult]
  }
  @scala.inline
  implicit class RPCResultOps[Self <: RPCResult] (val x: Self) extends AnyVal {
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
    def setOptions(value: RPCOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

