package typings.xadesjs.xadesjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsNoticeReference extends js.Object {
  var noticeNumbers: js.Array[Double]
  var organization: String
}

object OptionsNoticeReference {
  @scala.inline
  def apply(noticeNumbers: js.Array[Double], organization: String): OptionsNoticeReference = {
    val __obj = js.Dynamic.literal(noticeNumbers = noticeNumbers.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionsNoticeReference]
  }
}

