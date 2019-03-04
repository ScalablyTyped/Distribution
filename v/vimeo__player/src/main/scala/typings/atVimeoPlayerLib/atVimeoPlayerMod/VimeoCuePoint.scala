package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VimeoCuePoint extends js.Object {
  var data: VimeoCuePointData
  var id: java.lang.String
  var time: scala.Double
}

object VimeoCuePoint {
  @scala.inline
  def apply(data: VimeoCuePointData, id: java.lang.String, time: scala.Double): VimeoCuePoint = {
    val __obj = js.Dynamic.literal(data = data, id = id, time = time)
  
    __obj.asInstanceOf[VimeoCuePoint]
  }
}

