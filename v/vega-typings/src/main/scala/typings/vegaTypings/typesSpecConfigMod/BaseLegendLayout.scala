package typings.vegaTypings.typesSpecConfigMod

import typings.vegaTypings.typesSpecEncodeMod.Orientation
import typings.vegaTypings.typesSpecLayoutMod.LayoutBounds
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecTitleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLegendLayout extends StObject {
  
  /**
    * The anchor point for legend orient group layout.
    */
  var anchor: js.UndefOr[TitleAnchor | SignalRef] = js.undefined
  
  /**
    * The bounds calculation to use for legend orient group layout.
    */
  var bounds: js.UndefOr[LayoutBounds] = js.undefined
  
  /**
    * A flag to center legends within a shared orient group.
    */
  var center: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  /**
    * The layout direction for legend orient group layout.
    */
  var direction: js.UndefOr[Orientation | SignalRef] = js.undefined
  
  /**
    * The pixel margin between legends within a orient group.
    */
  var margin: js.UndefOr[Double | SignalRef] = js.undefined
  
  /**
    * The pixel offset from the chart body for a legend orient group.
    */
  var offset: js.UndefOr[Double | SignalRef] = js.undefined
}
object BaseLegendLayout {
  
  inline def apply(): BaseLegendLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLegendLayout]
  }
  
  extension [Self <: BaseLegendLayout](x: Self) {
    
    inline def setAnchor(value: TitleAnchor | SignalRef): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setBounds(value: LayoutBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCenter(value: Boolean | SignalRef): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setDirection(value: Orientation | SignalRef): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setMargin(value: Double | SignalRef): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
