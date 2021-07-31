package typings.vegaLite

import typings.std.Partial
import typings.std.Record
import typings.vegaLite.channelMod.NonPositionScaleChannel
import typings.vegaLite.channelMod.ScaleChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcResolveMod {
  
  /* Inlined std.Partial<std.Record<vega-lite.vega-lite/build/src/channel.PositionScaleChannel, vega-lite.vega-lite/build/src/resolve.ResolveMode>> */
  trait AxisResolveMap extends StObject {
    
    var x: js.UndefOr[ResolveMode] = js.undefined
    
    var y: js.UndefOr[ResolveMode] = js.undefined
  }
  object AxisResolveMap {
    
    @scala.inline
    def apply(): AxisResolveMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisResolveMap]
    }
    
    @scala.inline
    implicit class AxisResolveMapMutableBuilder[Self <: AxisResolveMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: ResolveMode): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: ResolveMode): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type LegendResolveMap = Partial[Record[NonPositionScaleChannel, ResolveMode]]
  
  trait Resolve extends StObject {
    
    var axis: js.UndefOr[AxisResolveMap] = js.undefined
    
    var legend: js.UndefOr[LegendResolveMap] = js.undefined
    
    var scale: js.UndefOr[ScaleResolveMap] = js.undefined
  }
  object Resolve {
    
    @scala.inline
    def apply(): Resolve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resolve]
    }
    
    @scala.inline
    implicit class ResolveMutableBuilder[Self <: Resolve] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: AxisResolveMap): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setLegend(value: LegendResolveMap): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setScale(value: ScaleResolveMap): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.independent
    - typings.vegaLite.vegaLiteStrings.shared
  */
  trait ResolveMode extends StObject
  object ResolveMode {
    
    @scala.inline
    def independent: typings.vegaLite.vegaLiteStrings.independent = "independent".asInstanceOf[typings.vegaLite.vegaLiteStrings.independent]
    
    @scala.inline
    def shared: typings.vegaLite.vegaLiteStrings.shared = "shared".asInstanceOf[typings.vegaLite.vegaLiteStrings.shared]
  }
  
  type ScaleResolveMap = Partial[Record[ScaleChannel, ResolveMode]]
}
