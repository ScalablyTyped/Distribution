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
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WikidataEntityDataValue]
  }
}

