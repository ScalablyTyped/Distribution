package typings
package wikidataDashSdkLib.defObjectClaimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WikidataMainSnak extends js.Object {
  var datatype: java.lang.String
  var datavalue: WikidataTimeDataValue | WikidataEntityDataValue
  var hash: java.lang.String
  var property: java.lang.String
  var snaktype: java.lang.String
}

object WikidataMainSnak {
  @scala.inline
  def apply(
    datatype: java.lang.String,
    datavalue: WikidataTimeDataValue | WikidataEntityDataValue,
    hash: java.lang.String,
    property: java.lang.String,
    snaktype: java.lang.String
  ): WikidataMainSnak = {
    val __obj = js.Dynamic.literal(datatype = datatype, datavalue = datavalue.asInstanceOf[js.Any], hash = hash, property = property, snaktype = snaktype)
  
    __obj.asInstanceOf[WikidataMainSnak]
  }
}

