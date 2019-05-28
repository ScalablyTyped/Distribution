package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofType extends js.Object {
  val GEOJSON: vegaDashEmbedLib.vegaDashEmbedLibStrings.geojson
  val LATITUDE: vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude
  val LONGITUDE: vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude
  val NOMINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.nominal
  val ORDINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.ordinal
  val QUANTITATIVE: vegaDashEmbedLib.vegaDashEmbedLibStrings.quantitative
  val TEMPORAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.temporal
}

@js.native
trait Typeoftype extends js.Object {
  val GEOJSON: vegaDashEmbedLib.vegaDashEmbedLibStrings.geojson = js.native
  val NOMINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.nominal = js.native
  val ORDINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.ordinal = js.native
  val QUANTITATIVE: vegaDashEmbedLib.vegaDashEmbedLibStrings.quantitative = js.native
  val TEMPORAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.temporal = js.native
  val TYPE_INDEX: vegaDashLiteLib.buildSrcUtilMod.Flag[vegaDashLiteLib.buildSrcTypeMod.Type] = js.native
  val TypeNs: TypeofType = js.native
  def getFullName(`type`: java.lang.String): vegaDashLiteLib.buildSrcTypeMod.Type = js.native
  def getFullName(`type`: vegaDashLiteLib.buildSrcTypeMod.Type): vegaDashLiteLib.buildSrcTypeMod.Type = js.native
  def isType(t: js.Any): /* is vega-lite.vega-lite/build/src/type.Type */ scala.Boolean = js.native
}

object TypeofType {
  @scala.inline
  def apply(
    GEOJSON: vegaDashEmbedLib.vegaDashEmbedLibStrings.geojson,
    LATITUDE: vegaDashEmbedLib.vegaDashEmbedLibStrings.latitude,
    LONGITUDE: vegaDashEmbedLib.vegaDashEmbedLibStrings.longitude,
    NOMINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.nominal,
    ORDINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.ordinal,
    QUANTITATIVE: vegaDashEmbedLib.vegaDashEmbedLibStrings.quantitative,
    TEMPORAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.temporal
  ): TypeofType = {
    val __obj = js.Dynamic.literal(GEOJSON = GEOJSON, LATITUDE = LATITUDE, LONGITUDE = LONGITUDE, NOMINAL = NOMINAL, ORDINAL = ORDINAL, QUANTITATIVE = QUANTITATIVE, TEMPORAL = TEMPORAL)
  
    __obj.asInstanceOf[TypeofType]
  }
}

