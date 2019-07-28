package typings.wikidataDashSdk.defObjectClaimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WikidataClaim extends js.Object {
  var id: String
  var mainsnak: WikidataMainSnak
  var rank: String
  var `type`: String
}

object WikidataClaim {
  @scala.inline
  def apply(id: String, mainsnak: WikidataMainSnak, rank: String, `type`: String): WikidataClaim = {
    val __obj = js.Dynamic.literal(id = id, mainsnak = mainsnak, rank = rank)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WikidataClaim]
  }
}

