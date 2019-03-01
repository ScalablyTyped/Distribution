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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("mainsnak")(mainsnak)
    __obj.updateDynamic("rank")(rank)
    __obj.asInstanceOf[WikidataClaim]
  }
}

