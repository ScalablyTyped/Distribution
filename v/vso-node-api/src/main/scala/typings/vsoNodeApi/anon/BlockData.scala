package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockData extends js.Object {
  var blockData: scala.Double = js.native
  var functions: scala.Double = js.native
  var modules: scala.Double = js.native
}

object BlockData {
  @scala.inline
  def apply(blockData: scala.Double, functions: scala.Double, modules: scala.Double): BlockData = {
    val __obj = js.Dynamic.literal(blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockData]
  }
  @scala.inline
  implicit class BlockDataOps[Self <: BlockData] (val x: Self) extends AnyVal {
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
    def setBlockData(value: scala.Double): Self = this.set("blockData", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctions(value: scala.Double): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def setModules(value: scala.Double): Self = this.set("modules", value.asInstanceOf[js.Any])
  }
  
}

