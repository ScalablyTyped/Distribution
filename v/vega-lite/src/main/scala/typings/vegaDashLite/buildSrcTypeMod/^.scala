package typings.vegaDashLite.buildSrcTypeMod

import typings.vegaDashLite.buildSrcUtilMod.Flag
import typings.vegaDashLite.vegaDashLiteStrings.geojson
import typings.vegaDashLite.vegaDashLiteStrings.nominal
import typings.vegaDashLite.vegaDashLiteStrings.ordinal
import typings.vegaDashLite.vegaDashLiteStrings.quantitative
import typings.vegaDashLite.vegaDashLiteStrings.temporal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/type", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GEOJSON: geojson = js.native
  val NOMINAL: nominal = js.native
  val ORDINAL: ordinal = js.native
  val QUANTITATIVE: quantitative = js.native
  val TEMPORAL: temporal = js.native
  val TYPE_INDEX: Flag[Type] = js.native
  def getFullName(`type`: String): Type = js.native
  def getFullName(`type`: Type): Type = js.native
  def isType(t: js.Any): /* is vega-lite.vega-lite/build/src/type.Type */ Boolean = js.native
}

