package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockData extends js.Object {
  var blockData: scala.Double
  var functions: scala.Double
  var modules: scala.Double
}

object Anon_BlockData {
  @scala.inline
  def apply(blockData: scala.Double, functions: scala.Double, modules: scala.Double): Anon_BlockData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockData")(blockData)
    __obj.updateDynamic("functions")(functions)
    __obj.updateDynamic("modules")(modules)
    __obj.asInstanceOf[Anon_BlockData]
  }
}

