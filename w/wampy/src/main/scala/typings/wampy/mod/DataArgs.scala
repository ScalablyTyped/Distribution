package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataArgs extends Args {
  var details: Dict = js.native
}

object DataArgs {
  @scala.inline
  def apply(argsDict: Dict, argsList: js.Array[_], details: Dict): DataArgs = {
    val __obj = js.Dynamic.literal(argsDict = argsDict.asInstanceOf[js.Any], argsList = argsList.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArgs]
  }
  @scala.inline
  implicit class DataArgsOps[Self <: DataArgs] (val x: Self) extends AnyVal {
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
    def setDetails(value: Dict): Self = this.set("details", value.asInstanceOf[js.Any])
  }
  
}

