package typings
package vegaDashLiteLib.buildSrcCompositemarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compositemark", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val COMPOSITE_MARK_STYLES: js.Array[vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BoxPlotStyle] = js.native
  def add(mark: java.lang.String, normalizer: UnitNormalizer): scala.Unit = js.native
  def normalize(
    spec: vegaDashLiteLib.buildSrcSpecMod.GenericUnitSpec[_, vegaDashLiteLib.buildSrcMarkMod.AnyMark],
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): vegaDashLiteLib.buildSrcSpecMod.NormalizedLayerSpec = js.native
  def remove(mark: java.lang.String): scala.Unit = js.native
}

