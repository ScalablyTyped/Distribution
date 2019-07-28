package typings.wikidataDashSdk.defObjectClaimMod

import typings.wikidataDashSdk.Anon_After
import typings.wikidataDashSdk.wikidataDashSdkStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WikidataTimeDataValue extends js.Object {
  var `type`: time
  var value: Anon_After
}

object WikidataTimeDataValue {
  @scala.inline
  def apply(`type`: time, value: Anon_After): WikidataTimeDataValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WikidataTimeDataValue]
  }
}

