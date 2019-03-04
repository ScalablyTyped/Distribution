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
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WikidataTimeDataValue]
  }
}

