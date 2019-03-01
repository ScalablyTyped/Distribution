package typings
package wikidataDashSdkLib.defObjectClaimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WikidataTimeDataValue extends js.Object {
  var `type`: wikidataDashSdkLib.wikidataDashSdkLibStrings.time
  var value: wikidataDashSdkLib.Anon_After
}

object WikidataTimeDataValue {
  @scala.inline
  def apply(`type`: wikidataDashSdkLib.wikidataDashSdkLibStrings.time, value: wikidataDashSdkLib.Anon_After): WikidataTimeDataValue = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[WikidataTimeDataValue]
  }
}

