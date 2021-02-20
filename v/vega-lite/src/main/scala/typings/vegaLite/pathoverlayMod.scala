package typings.vegaLite

import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.normalizeBaseMod.ExtraNormalizer
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
import typings.vegaLite.vegaLiteStrings.area
import typings.vegaLite.vegaLiteStrings.line
import typings.vegaLite.vegaLiteStrings.rule
import typings.vegaLite.vegaLiteStrings.trail
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathoverlayMod {
  
  @JSImport("vega-lite/build/src/normalize/pathoverlay", "PathOverlayNormalizer")
  @js.native
  class PathOverlayNormalizer ()
    extends ExtraNormalizer[
          UnitSpecWithPathOverlay, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    
    def hasMatchingType(
      spec: GenericUnitSpec[_, Mark | (MarkDef[Mark, ExprRef | SignalRef])],
      config: Config[ExprRef | SignalRef]
    ): /* is vega-lite.vega-lite/build/src/normalize/pathoverlay.UnitSpecWithPathOverlay */ Boolean = js.native
  }
  
  type UnitSpecWithPathOverlay = GenericUnitSpec[
    Encoding[String], 
    Mark | (MarkDef[line | area | rule | trail, ExprRef | SignalRef])
  ]
}
