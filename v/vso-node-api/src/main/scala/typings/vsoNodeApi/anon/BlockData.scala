package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockData extends js.Object {
  var blockData: scala.Double
  var functions: scala.Double
  var modules: scala.Double
}

object BlockData {
  @scala.inline
  def apply(blockData: scala.Double, functions: scala.Double, modules: scala.Double): BlockData = {
    val __obj = js.Dynamic.literal(blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockData]
  }
}

