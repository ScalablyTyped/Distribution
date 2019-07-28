package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateTime extends js.Object {
  var createTime: Double
  var filePath: String
  var size: Double
}

object Anon_CreateTime {
  @scala.inline
  def apply(createTime: Double, filePath: String, size: Double): Anon_CreateTime = {
    val __obj = js.Dynamic.literal(createTime = createTime, filePath = filePath, size = size)
  
    __obj.asInstanceOf[Anon_CreateTime]
  }
}

