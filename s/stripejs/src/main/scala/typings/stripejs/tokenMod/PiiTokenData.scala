package typings.stripejs.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiiTokenData extends js.Object {
  /**
    * The personal ID number
    */
  var personal_id_number: String
}

object PiiTokenData {
  @scala.inline
  def apply(personal_id_number: String): PiiTokenData = {
    val __obj = js.Dynamic.literal(personal_id_number = personal_id_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiiTokenData]
  }
}

