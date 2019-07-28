package typings.wikidataDashSdk.defObjectClaimMod

import typings.wikidataDashSdk.Anon_Entitytype
import typings.wikidataDashSdk.wikidataDashSdkStrings.`wikibase-entityid`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WikidataEntityDataValue extends js.Object {
  var `type`: `wikibase-entityid`
  var value: Anon_Entitytype
}

object WikidataEntityDataValue {
  @scala.inline
  def apply(`type`: `wikibase-entityid`, value: Anon_Entitytype): WikidataEntityDataValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WikidataEntityDataValue]
  }
}

