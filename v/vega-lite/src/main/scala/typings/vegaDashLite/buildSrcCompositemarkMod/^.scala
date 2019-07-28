package typings.vegaDashLite.buildSrcCompositemarkMod

import typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BoxPlotStyle
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcMarkMod.AnyMark
import typings.vegaDashLite.buildSrcSpecMod.GenericUnitSpec
import typings.vegaDashLite.buildSrcSpecMod.NormalizedLayerSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compositemark", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val COMPOSITE_MARK_STYLES: js.Array[BoxPlotStyle] = js.native
  def add(mark: String, normalizer: UnitNormalizer): Unit = js.native
  def normalize(spec: GenericUnitSpec[_, AnyMark], config: Config): NormalizedLayerSpec = js.native
  def remove(mark: String): Unit = js.native
}

