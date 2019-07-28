package typings.vegaDashEmbed

import typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BoxPlotStyle
import typings.vegaDashLite.buildSrcCompositemarkMod.UnitNormalizer
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcMarkMod.AnyMark
import typings.vegaDashLite.buildSrcSpecMod.GenericUnitSpec
import typings.vegaDashLite.buildSrcSpecMod.NormalizedLayerSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcompositeMark extends js.Object {
  val COMPOSITE_MARK_STYLES: js.Array[BoxPlotStyle]
  val VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX: Anon_Align
  def add(mark: String, normalizer: UnitNormalizer): Unit
  def normalize(spec: GenericUnitSpec[_, AnyMark], config: Config): NormalizedLayerSpec
  def remove(mark: String): Unit
}

object TypeofcompositeMark {
  @scala.inline
  def apply(
    COMPOSITE_MARK_STYLES: js.Array[BoxPlotStyle],
    VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX: Anon_Align,
    add: (String, UnitNormalizer) => Unit,
    normalize: (GenericUnitSpec[_, AnyMark], Config) => NormalizedLayerSpec,
    remove: String => Unit
  ): TypeofcompositeMark = {
    val __obj = js.Dynamic.literal(COMPOSITE_MARK_STYLES = COMPOSITE_MARK_STYLES, VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX = VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX, add = js.Any.fromFunction2(add), normalize = js.Any.fromFunction2(normalize), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[TypeofcompositeMark]
  }
}

