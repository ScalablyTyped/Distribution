package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlockData extends js.Object {
  var blockData: Double
  var functions: Double
  var modules: Double
}

object AnonBlockData {
  @scala.inline
  def apply(blockData: Double, functions: Double, modules: Double): AnonBlockData = {
    val __obj = js.Dynamic.literal(blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlockData]
  }
}

