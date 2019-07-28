package typings.wikidataDashSdk.defObjectClaimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WikidataMainSnak extends js.Object {
  var datatype: String
  var datavalue: WikidataTimeDataValue | WikidataEntityDataValue
  var hash: String
  var property: String
  var snaktype: String
}

object WikidataMainSnak {
  @scala.inline
  def apply(
    datatype: String,
    datavalue: WikidataTimeDataValue | WikidataEntityDataValue,
    hash: String,
    property: String,
    snaktype: String
  ): WikidataMainSnak = {
    val __obj = js.Dynamic.literal(datatype = datatype, datavalue = datavalue.asInstanceOf[js.Any], hash = hash, property = property, snaktype = snaktype)
  
    __obj.asInstanceOf[WikidataMainSnak]
  }
}

