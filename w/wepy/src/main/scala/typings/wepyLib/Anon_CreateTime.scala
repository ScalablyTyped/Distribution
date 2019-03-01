package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateTime extends js.Object {
  var createTime: scala.Double
  var errMsg: java.lang.String
  var size: scala.Double
}

object Anon_CreateTime {
  @scala.inline
  def apply(createTime: scala.Double, errMsg: java.lang.String, size: scala.Double): Anon_CreateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createTime")(createTime)
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_CreateTime]
  }
}

