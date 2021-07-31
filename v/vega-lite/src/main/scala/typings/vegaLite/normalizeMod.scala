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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeMod {
  
  @JSImport("vega-lite/build/src/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def normalize(spec: TopLevelSpec & LayoutSizeMixins): TopLevel[NormalizedSpec] & LayoutSizeMixins = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spec.asInstanceOf[js.Any]).asInstanceOf[TopLevel[NormalizedSpec] & LayoutSizeMixins]
  @scala.inline
  def normalize(spec: TopLevelSpec & LayoutSizeMixins, config: Config[SignalRef]): TopLevel[NormalizedSpec] & LayoutSizeMixins = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[TopLevel[NormalizedSpec] & LayoutSizeMixins]
  
  @scala.inline
  def normalizeAutoSize(spec: TopLevel[NormalizedSpec], sizeInfo: autosizeAutosizeTypeAutoS): AutoSizeParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAutoSize")(spec.asInstanceOf[js.Any], sizeInfo.asInstanceOf[js.Any])).asInstanceOf[AutoSizeParams]
  @scala.inline
  def normalizeAutoSize(
    spec: TopLevel[NormalizedSpec],
    sizeInfo: autosizeAutosizeTypeAutoS,
    config: Config[ExprRef | SignalRef]
  ): AutoSizeParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAutoSize")(spec.asInstanceOf[js.Any], sizeInfo.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AutoSizeParams]
}
