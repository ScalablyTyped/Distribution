package typings
package wikidataDashSdkLib.defObjectClaimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WikidataEntityDataValue extends js.Object {
  var `type`: wikidataDashSdkLib.wikidataDashSdkLibStrings.`wikibase-entityid`
  var value: wikidataDashSdkLib.Anon_Entitytype
}

object WikidataEntityDataValue {
  @scala.inline
  def apply(
    `type`: wikidataDashSdkLib.wikidataDashSdkLibStrings.`wikibase-entityid`,
    value: wikidataDashSdkLib.Anon_Entitytype
  ): WikidataEntityDataValue = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[WikidataEntityDataValue]
  }
}

