package typings
package wikidataDashSdkLib.defObjectClaimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WikidataClaim extends js.Object {
  var id: java.lang.String
  var mainsnak: WikidataMainSnak
  var rank: java.lang.String
  var `type`: java.lang.String
}

object WikidataClaim {
  @scala.inline
  def apply(id: java.lang.String, mainsnak: WikidataMainSnak, rank: java.lang.String, `type`: java.lang.String): WikidataClaim = {
    val __obj = js.Dynamic.literal(id = id, mainsnak = mainsnak, rank = rank)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WikidataClaim]
  }
}

