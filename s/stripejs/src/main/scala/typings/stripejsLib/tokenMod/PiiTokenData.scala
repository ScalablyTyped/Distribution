package typings
package stripejsLib.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiiTokenData extends js.Object {
  /**
    * The personal ID number
    */
  var personal_id_number: java.lang.String
}

object PiiTokenData {
  @scala.inline
  def apply(personal_id_number: java.lang.String): PiiTokenData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("personal_id_number")(personal_id_number)
    __obj.asInstanceOf[PiiTokenData]
  }
}

