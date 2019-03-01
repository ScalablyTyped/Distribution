package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result extends js.Object {
  /**
    * 是否建议用户休息
    */
  var result: scala.Boolean
}

object Anon_Result {
  @scala.inline
  def apply(result: scala.Boolean): Anon_Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_Result]
  }
}

