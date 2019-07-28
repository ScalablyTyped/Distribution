package typings.vegaDashEmbed

import typings.vegaDashEmbed.vegaDashEmbedStrings.geojson
import typings.vegaDashEmbed.vegaDashEmbedStrings.latitude
import typings.vegaDashEmbed.vegaDashEmbedStrings.longitude
import typings.vegaDashEmbed.vegaDashEmbedStrings.nominal
import typings.vegaDashEmbed.vegaDashEmbedStrings.ordinal
import typings.vegaDashEmbed.vegaDashEmbedStrings.quantitative
import typings.vegaDashEmbed.vegaDashEmbedStrings.temporal
import typings.vegaDashLite.buildSrcTypeMod.Type
import typings.vegaDashLite.buildSrcUtilMod.Flag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofType extends js.Object {
  val GEOJSON: geojson
  val LATITUDE: latitude
  val LONGITUDE: longitude
  val NOMINAL: nominal
  val ORDINAL: ordinal
  val QUANTITATIVE: quantitative
  val TEMPORAL: temporal
}

@js.native
trait Typeoftype extends js.Object {
  val GEOJSON: geojson = js.native
  val NOMINAL: nominal = js.native
  val ORDINAL: ordinal = js.native
  val QUANTITATIVE: quantitative = js.native
  val TEMPORAL: temporal = js.native
  val TYPE_INDEX: Flag[Type] = js.native
  val TypeNs: TypeofType = js.native
  def getFullName(`type`: String): Type = js.native
  def getFullName(`type`: Type): Type = js.native
  def isType(t: js.Any): /* is vega-lite.vega-lite/build/src/type.Type */ Boolean = js.native
}

object TypeofType {
  @scala.inline
  def apply(
    GEOJSON: geojson,
    LATITUDE: latitude,
    LONGITUDE: longitude,
    NOMINAL: nominal,
    ORDINAL: ordinal,
    QUANTITATIVE: quantitative,
    TEMPORAL: temporal
  ): TypeofType = {
    val __obj = js.Dynamic.literal(GEOJSON = GEOJSON, LATITUDE = LATITUDE, LONGITUDE = LONGITUDE, NOMINAL = NOMINAL, ORDINAL = ORDINAL, QUANTITATIVE = QUANTITATIVE, TEMPORAL = TEMPORAL)
  
    __obj.asInstanceOf[TypeofType]
  }
}

