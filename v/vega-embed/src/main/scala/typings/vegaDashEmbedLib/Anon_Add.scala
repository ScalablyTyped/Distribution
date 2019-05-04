package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  val COMPOSITE_MARK_STYLES: js.Array[vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BoxPlotStyle]
  val VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX: Anon_Align
  def add(mark: java.lang.String, normalizer: vegaDashLiteLib.buildSrcCompositemarkMod.UnitNormalizer): scala.Unit
  def normalize(
    spec: vegaDashLiteLib.buildSrcSpecMod.GenericUnitSpec[_, vegaDashLiteLib.buildSrcMarkMod.AnyMark],
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): vegaDashLiteLib.buildSrcSpecMod.NormalizedLayerSpec
  def remove(mark: java.lang.String): scala.Unit
}

object Anon_Add {
  @scala.inline
  def apply(
    COMPOSITE_MARK_STYLES: js.Array[vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BoxPlotStyle],
    VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX: Anon_Align,
    add: (java.lang.String, vegaDashLiteLib.buildSrcCompositemarkMod.UnitNormalizer) => scala.Unit,
    normalize: (vegaDashLiteLib.buildSrcSpecMod.GenericUnitSpec[_, vegaDashLiteLib.buildSrcMarkMod.AnyMark], vegaDashLiteLib.buildSrcConfigMod.Config) => vegaDashLiteLib.buildSrcSpecMod.NormalizedLayerSpec,
    remove: java.lang.String => scala.Unit
  ): Anon_Add = {
    val __obj = js.Dynamic.literal(COMPOSITE_MARK_STYLES = COMPOSITE_MARK_STYLES, VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX = VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX, add = js.Any.fromFunction2(add), normalize = js.Any.fromFunction2(normalize), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[Anon_Add]
  }
}

