package typings.vegaLite

import typings.vegaLite.buildSrcAxisMod.AxisInternal
import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChannelMod.NonPositionScaleChannel
import typings.vegaLite.buildSrcChannelMod.PositionChannel
import typings.vegaLite.buildSrcChannelMod.ScaleChannel
import typings.vegaLite.buildSrcChannelMod.SingleDefChannel
import typings.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typings.vegaLite.buildSrcCompileAxisComponentMod.AxisInternalIndex
import typings.vegaLite.buildSrcCompileLegendComponentMod.LegendInternalIndex
import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcCompileModelMod.ModelWithField
import typings.vegaLite.buildSrcCompileScaleComponentMod.ScaleIndex
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcLegendMod.LegendInternal
import typings.vegaLite.buildSrcMarkMod.Mark
import typings.vegaLite.buildSrcMarkMod.MarkDef
import typings.vegaLite.buildSrcProjectionMod.Projection
import typings.vegaLite.buildSrcScaleMod.Domain
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecBaseMod.LayoutSizeMixins
import typings.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typings.vegaLite.buildSrcStackMod.StackProperties
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileUnitMod {
  
  @JSImport("vega-lite/build/src/compile/unit", "UnitModel")
  @js.native
  open class UnitModel protected () extends ModelWithField {
    def this(
      spec: NormalizedUnitSpec,
      parent: Model,
      parentGivenName: String,
      parentGivenSize: LayoutSizeMixins,
      config: Config[SignalRef]
    ) = this()
    
    def axis(channel: PositionChannel): AxisInternal = js.native
    
    val encoding: Encoding[String] = js.native
    
    def hasProjection: Boolean = js.native
    
    /* private */ var initAxes: Any = js.native
    
    /* private */ var initAxis: Any = js.native
    
    /* private */ var initLegends: Any = js.native
    
    /* private */ var initScale: Any = js.native
    
    /* private */ var initScales: Any = js.native
    
    def legend(channel: NonPositionScaleChannel): LegendInternal = js.native
    
    def mark: Mark = js.native
    
    val markDef: MarkDef[Mark, SignalRef] = js.native
    
    /**
      * Return specified Vega-Lite scale domain for a particular channel
      * @param channel
      */
    def scaleDomain(channel: ScaleChannel): Domain = js.native
    
    val selection: js.Array[SelectionParameter[SelectionType]] = js.native
    
    /* protected */ var specifiedAxes: AxisInternalIndex = js.native
    
    /* protected */ var specifiedLegends: LegendInternalIndex = js.native
    
    var specifiedProjection: Projection[ExprRef | SignalRef] = js.native
    
    val specifiedScales: ScaleIndex = js.native
    
    val stack: StackProperties = js.native
    
    def typedFieldDef(channel: SingleDefChannel): TypedFieldDef[String, Any, Boolean | BinParams | binned] = js.native
  }
}
