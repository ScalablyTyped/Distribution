package typings.vegaEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Bottom {
    
    inline def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  CLICK_TO_VIEW_ACTIONS :string,   COMPILED_ACTION :string,   EDITOR_ACTION :string,   PNG_ACTION :string,   SOURCE_ACTION :string,   SVG_ACTION :string}> */
  trait PartialCLICKTOVIEWACTIONS extends StObject {
    
    var CLICK_TO_VIEW_ACTIONS: js.UndefOr[String] = js.undefined
    
    var COMPILED_ACTION: js.UndefOr[String] = js.undefined
    
    var EDITOR_ACTION: js.UndefOr[String] = js.undefined
    
    var PNG_ACTION: js.UndefOr[String] = js.undefined
    
    var SOURCE_ACTION: js.UndefOr[String] = js.undefined
    
    var SVG_ACTION: js.UndefOr[String] = js.undefined
  }
  object PartialCLICKTOVIEWACTIONS {
    
    inline def apply(): PartialCLICKTOVIEWACTIONS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCLICKTOVIEWACTIONS]
    }
    
    extension [Self <: PartialCLICKTOVIEWACTIONS](x: Self) {
      
      inline def setCLICK_TO_VIEW_ACTIONS(value: String): Self = StObject.set(x, "CLICK_TO_VIEW_ACTIONS", value.asInstanceOf[js.Any])
      
      inline def setCLICK_TO_VIEW_ACTIONSUndefined: Self = StObject.set(x, "CLICK_TO_VIEW_ACTIONS", js.undefined)
      
      inline def setCOMPILED_ACTION(value: String): Self = StObject.set(x, "COMPILED_ACTION", value.asInstanceOf[js.Any])
      
      inline def setCOMPILED_ACTIONUndefined: Self = StObject.set(x, "COMPILED_ACTION", js.undefined)
      
      inline def setEDITOR_ACTION(value: String): Self = StObject.set(x, "EDITOR_ACTION", value.asInstanceOf[js.Any])
      
      inline def setEDITOR_ACTIONUndefined: Self = StObject.set(x, "EDITOR_ACTION", js.undefined)
      
      inline def setPNG_ACTION(value: String): Self = StObject.set(x, "PNG_ACTION", value.asInstanceOf[js.Any])
      
      inline def setPNG_ACTIONUndefined: Self = StObject.set(x, "PNG_ACTION", js.undefined)
      
      inline def setSOURCE_ACTION(value: String): Self = StObject.set(x, "SOURCE_ACTION", value.asInstanceOf[js.Any])
      
      inline def setSOURCE_ACTIONUndefined: Self = StObject.set(x, "SOURCE_ACTION", js.undefined)
      
      inline def setSVG_ACTION(value: String): Self = StObject.set(x, "SVG_ACTION", value.asInstanceOf[js.Any])
      
      inline def setSVG_ACTIONUndefined: Self = StObject.set(x, "SVG_ACTION", js.undefined)
    }
  }
  
  trait Png extends StObject {
    
    var png: js.UndefOr[Boolean] = js.undefined
    
    var svg: js.UndefOr[Boolean] = js.undefined
  }
  object Png {
    
    inline def apply(): Png = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Png]
    }
    
    extension [Self <: Png](x: Self) {
      
      inline def setPng(value: Boolean): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      inline def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
      
      inline def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
  
  trait Svg extends StObject {
    
    var png: Boolean
    
    var svg: Boolean
  }
  object Svg {
    
    inline def apply(png: Boolean, svg: Boolean): Svg = {
      val __obj = js.Dynamic.literal(png = png.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Svg]
    }
    
    extension [Self <: Svg](x: Self) {
      
      inline def setPng(value: Boolean): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
}
