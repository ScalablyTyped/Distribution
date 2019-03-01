package typings
package xadesjsLib.xadesjsMod.XAdESNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsNoticeReference extends js.Object {
  var noticeNumbers: js.Array[scala.Double]
  var organization: java.lang.String
}

object OptionsNoticeReference {
  @scala.inline
  def apply(noticeNumbers: js.Array[scala.Double], organization: java.lang.String): OptionsNoticeReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("noticeNumbers")(noticeNumbers)
    __obj.updateDynamic("organization")(organization)
    __obj.asInstanceOf[OptionsNoticeReference]
  }
}

