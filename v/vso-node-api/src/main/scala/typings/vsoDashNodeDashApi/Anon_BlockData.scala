package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockData extends js.Object {
  var blockData: Double
  var functions: Double
  var modules: Double
}

object Anon_BlockData {
  @scala.inline
  def apply(blockData: Double, functions: Double, modules: Double): Anon_BlockData = {
    val __obj = js.Dynamic.literal(blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlockData]
  }
}

