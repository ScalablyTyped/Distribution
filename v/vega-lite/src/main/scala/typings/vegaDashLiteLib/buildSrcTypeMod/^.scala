package typings
package vegaDashLiteLib.buildSrcTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/type", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GEOJSON: vegaDashLiteLib.vegaDashLiteLibStrings.geojson = js.native
  val NOMINAL: vegaDashLiteLib.vegaDashLiteLibStrings.nominal = js.native
  val ORDINAL: vegaDashLiteLib.vegaDashLiteLibStrings.ordinal = js.native
  val QUANTITATIVE: vegaDashLiteLib.vegaDashLiteLibStrings.quantitative = js.native
  val TEMPORAL: vegaDashLiteLib.vegaDashLiteLibStrings.temporal = js.native
  val TYPE_INDEX: vegaDashLiteLib.buildSrcUtilMod.Flag[Type] = js.native
  def getFullName(`type`: java.lang.String): Type = js.native
  def getFullName(`type`: Type): Type = js.native
  def isType(t: js.Any): /* is vega-lite.vega-lite/build/src/type.Type */ scala.Boolean = js.native
}

