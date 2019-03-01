package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateTime extends js.Object {
  var createTime: scala.Double
  var filePath: java.lang.String
  var size: scala.Double
}

object Anon_CreateTime {
  @scala.inline
  def apply(createTime: scala.Double, filePath: java.lang.String, size: scala.Double): Anon_CreateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createTime")(createTime)
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_CreateTime]
  }
}

