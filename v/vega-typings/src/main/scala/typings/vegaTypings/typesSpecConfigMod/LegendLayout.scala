package typings.vegaTypings.typesSpecConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendLayout
  extends StObject
     with BaseLegendLayout {
  
  var bottom: js.UndefOr[BaseLegendLayout] = js.undefined
  
  var `bottom-left`: js.UndefOr[BaseLegendLayout] = js.undefined
  
  var `bottom-right`: js.UndefOr[BaseLegendLayout] = js.undefined
  
  var left: js.UndefOr[BaseLegendLayout] = js.undefined
  
  var right: js.UndefOr[BaseLegendLayout] = js.undefined
  
  var top: js.UndefOr[BaseLegendLayout] = js.undefined
  
  var `top-left`: js.UndefOr[BaseLegendLayout] = js.undefined
  
  var `top-right`: js.UndefOr[BaseLegendLayout] = js.undefined
}
object LegendLayout {
  
  inline def apply(): LegendLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendLayout]
  }
  
  extension [Self <: LegendLayout](x: Self) {
    
    inline def setBottom(value: BaseLegendLayout): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def `setBottom-left`(value: BaseLegendLayout): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
    
    inline def `setBottom-leftUndefined`: Self = StObject.set(x, "bottom-left", js.undefined)
    
    inline def `setBottom-right`(value: BaseLegendLayout): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
    
    inline def `setBottom-rightUndefined`: Self = StObject.set(x, "bottom-right", js.undefined)
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: BaseLegendLayout): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: BaseLegendLayout): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: BaseLegendLayout): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def `setTop-left`(value: BaseLegendLayout): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
    
    inline def `setTop-leftUndefined`: Self = StObject.set(x, "top-left", js.undefined)
    
    inline def `setTop-right`(value: BaseLegendLayout): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
    
    inline def `setTop-rightUndefined`: Self = StObject.set(x, "top-right", js.undefined)
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
