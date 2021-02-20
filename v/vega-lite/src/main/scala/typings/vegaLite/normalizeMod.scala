package typings.vegaLite

import typings.vegaLite.anon.autosizeAutosizeTypeAutoS
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.specBaseMod.LayoutSizeMixins
import typings.vegaLite.specMod.NormalizedSpec
import typings.vegaLite.specMod.TopLevelSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.toplevelMod.AutoSizeParams
import typings.vegaLite.toplevelMod.TopLevel
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeMod {
  
  @JSImport("vega-lite/build/src/normalize", "normalize")
  @js.native
  def normalize(spec: TopLevelSpec with LayoutSizeMixins): TopLevel[NormalizedSpec] with LayoutSizeMixins = js.native
  @JSImport("vega-lite/build/src/normalize", "normalize")
  @js.native
  def normalize(spec: TopLevelSpec with LayoutSizeMixins, config: Config[SignalRef]): TopLevel[NormalizedSpec] with LayoutSizeMixins = js.native
  
  @JSImport("vega-lite/build/src/normalize", "normalizeAutoSize")
  @js.native
  def normalizeAutoSize(spec: TopLevel[NormalizedSpec], sizeInfo: autosizeAutosizeTypeAutoS): AutoSizeParams = js.native
  @JSImport("vega-lite/build/src/normalize", "normalizeAutoSize")
  @js.native
  def normalizeAutoSize(
    spec: TopLevel[NormalizedSpec],
    sizeInfo: autosizeAutosizeTypeAutoS,
    config: Config[ExprRef | SignalRef]
  ): AutoSizeParams = js.native
}
