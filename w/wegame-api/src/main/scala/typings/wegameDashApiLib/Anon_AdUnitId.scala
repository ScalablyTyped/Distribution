package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdUnitId extends js.Object {
  /**
    * 广告单元 id
    */
  var adUnitId: java.lang.String
  /**
    * banner 广告组件的样式
    */
  var style: wegameDashApiLib.wxNs.typesNs.AdStyle
}

object Anon_AdUnitId {
  @scala.inline
  def apply(adUnitId: java.lang.String, style: wegameDashApiLib.wxNs.typesNs.AdStyle): Anon_AdUnitId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adUnitId")(adUnitId)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_AdUnitId]
  }
}

