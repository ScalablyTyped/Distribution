package typings.vegaEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  CLICK_TO_VIEW_ACTIONS :string,   COMPILED_ACTION :string,   EDITOR_ACTION :string,   PNG_ACTION :string,   SOURCE_ACTION :string,   SVG_ACTION :string}> */
  @js.native
  trait PartialCLICKTOVIEWACTIONS extends StObject {
    
    var CLICK_TO_VIEW_ACTIONS: js.UndefOr[String] = js.native
    
    var COMPILED_ACTION: js.UndefOr[String] = js.native
    
    var EDITOR_ACTION: js.UndefOr[String] = js.native
    
    var PNG_ACTION: js.UndefOr[String] = js.native
    
    var SOURCE_ACTION: js.UndefOr[String] = js.native
    
    var SVG_ACTION: js.UndefOr[String] = js.native
  }
  object PartialCLICKTOVIEWACTIONS {
    
    @scala.inline
    def apply(): PartialCLICKTOVIEWACTIONS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCLICKTOVIEWACTIONS]
    }
    
    @scala.inline
    implicit class PartialCLICKTOVIEWACTIONSMutableBuilder[Self <: PartialCLICKTOVIEWACTIONS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCLICK_TO_VIEW_ACTIONS(value: String): Self = StObject.set(x, "CLICK_TO_VIEW_ACTIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLICK_TO_VIEW_ACTIONSUndefined: Self = StObject.set(x, "CLICK_TO_VIEW_ACTIONS", js.undefined)
      
      @scala.inline
      def setCOMPILED_ACTION(value: String): Self = StObject.set(x, "COMPILED_ACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOMPILED_ACTIONUndefined: Self = StObject.set(x, "COMPILED_ACTION", js.undefined)
      
      @scala.inline
      def setEDITOR_ACTION(value: String): Self = StObject.set(x, "EDITOR_ACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEDITOR_ACTIONUndefined: Self = StObject.set(x, "EDITOR_ACTION", js.undefined)
      
      @scala.inline
      def setPNG_ACTION(value: String): Self = StObject.set(x, "PNG_ACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNG_ACTIONUndefined: Self = StObject.set(x, "PNG_ACTION", js.undefined)
      
      @scala.inline
      def setSOURCE_ACTION(value: String): Self = StObject.set(x, "SOURCE_ACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSOURCE_ACTIONUndefined: Self = StObject.set(x, "SOURCE_ACTION", js.undefined)
      
      @scala.inline
      def setSVG_ACTION(value: String): Self = StObject.set(x, "SVG_ACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVG_ACTIONUndefined: Self = StObject.set(x, "SVG_ACTION", js.undefined)
    }
  }
  
  @js.native
  trait Png extends StObject {
    
    var png: js.UndefOr[Boolean] = js.native
    
    var svg: js.UndefOr[Boolean] = js.native
  }
  object Png {
    
    @scala.inline
    def apply(): Png = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Png]
    }
    
    @scala.inline
    implicit class PngMutableBuilder[Self <: Png] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPng(value: Boolean): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
      
      @scala.inline
      def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
  
  @js.native
  trait Svg extends StObject {
    
    var png: Boolean = js.native
    
    var svg: Boolean = js.native
  }
  object Svg {
    
    @scala.inline
    def apply(png: Boolean, svg: Boolean): Svg = {
      val __obj = js.Dynamic.literal(png = png.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Svg]
    }
    
    @scala.inline
    implicit class SvgMutableBuilder[Self <: Svg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPng(value: Boolean): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
}
