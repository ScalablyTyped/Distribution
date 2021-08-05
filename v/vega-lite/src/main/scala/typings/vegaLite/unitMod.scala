package typings.vegaLite

import typings.vegaLite.axisMod.AxisInternal
import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.NonPositionScaleChannel
import typings.vegaLite.channelMod.PositionChannel
import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.channelMod.SingleDefChannel
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.componentMod.AxisInternalIndex
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.legendComponentMod.LegendInternalIndex
import typings.vegaLite.legendMod.LegendInternal
import typings.vegaLite.modelMod.Model
import typings.vegaLite.modelMod.ModelWithField
import typings.vegaLite.projectionMod.Projection
import typings.vegaLite.scaleComponentMod.ScaleIndex
import typings.vegaLite.scaleMod.Domain
import typings.vegaLite.specBaseMod.LayoutSizeMixins
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
import typings.vegaLite.srcSelectionMod.SelectionDef
import typings.vegaLite.srcStackMod.StackProperties
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitMod {
  
  @JSImport("vega-lite/build/src/compile/unit", "UnitModel")
  @js.native
  class UnitModel protected () extends ModelWithField {
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
    
    /* private */ var initAxes: js.Any = js.native
    
    /* private */ var initAxis: js.Any = js.native
    
    /* private */ var initLegends: js.Any = js.native
    
    /* private */ var initScale: js.Any = js.native
    
    /* private */ var initScales: js.Any = js.native
    
    def legend(channel: NonPositionScaleChannel): LegendInternal = js.native
    
    def mark: Mark = js.native
    
    val markDef: MarkDef[Mark, SignalRef] = js.native
    
    /**
      * Return specified Vega-Lite scale domain for a particular channel
      * @param channel
      */
    def scaleDomain(channel: ScaleChannel): Domain = js.native
    
    val selection: Dict[SelectionDef] = js.native
    
    /* protected */ var specifiedAxes: AxisInternalIndex = js.native
    
    /* protected */ var specifiedLegends: LegendInternalIndex = js.native
    
    var specifiedProjection: Projection = js.native
    
    val specifiedScales: ScaleIndex = js.native
    
    val stack: StackProperties = js.native
    
    def typedFieldDef(channel: SingleDefChannel): TypedFieldDef[String, js.Any, Boolean | BinParams | binned] = js.native
  }
}
