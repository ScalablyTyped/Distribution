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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
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
  
  trait Fn extends StObject {
    
    var fn: Any
    
    var visitor: js.UndefOr[Any] = js.undefined
  }
  object Fn {
    
    inline def apply(fn: Any): Fn = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
      
      inline def setFn(value: Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setVisitor(value: Any): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
      
      inline def setVisitorUndefined: Self = StObject.set(x, "visitor", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialCLICKTOVIEWACTIONS] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Png] (val x: Self) extends AnyVal {
      
      inline def setPng(value: Boolean): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      inline def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
      
      inline def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
  
  trait PngSvg extends StObject {
    
    var png: js.UndefOr[Double] = js.undefined
    
    var svg: js.UndefOr[Double] = js.undefined
  }
  object PngSvg {
    
    inline def apply(): PngSvg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PngSvg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PngSvg] (val x: Self) extends AnyVal {
      
      inline def setPng(value: Double): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      inline def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
      
      inline def setSvg(value: Double): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Svg] (val x: Self) extends AnyVal {
      
      inline def setPng(value: Boolean): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofexpressionInterpret extends StObject {
    
    def encode(ctx: Any, encode: Any): Any
    
    def event(ctx: Any, expr: Any): Any
    
    def handler(ctx: Any, expr: Any): Any
    
    def operator(ctx: Any, expr: Any): Any
    
    def parameter(ctx: Any, expr: Any): Any
  }
  object TypeofexpressionInterpret {
    
    inline def apply(
      encode: (Any, Any) => Any,
      event: (Any, Any) => Any,
      handler: (Any, Any) => Any,
      operator: (Any, Any) => Any,
      parameter: (Any, Any) => Any
    ): TypeofexpressionInterpret = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction2(encode), event = js.Any.fromFunction2(event), handler = js.Any.fromFunction2(handler), operator = js.Any.fromFunction2(operator), parameter = js.Any.fromFunction2(parameter))
      __obj.asInstanceOf[TypeofexpressionInterpret]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofexpressionInterpret] (val x: Self) extends AnyVal {
      
      inline def setEncode(value: (Any, Any) => Any): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
      
      inline def setEvent(value: (Any, Any) => Any): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
      
      inline def setHandler(value: (Any, Any) => Any): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
      
      inline def setOperator(value: (Any, Any) => Any): Self = StObject.set(x, "operator", js.Any.fromFunction2(value))
      
      inline def setParameter(value: (Any, Any) => Any): Self = StObject.set(x, "parameter", js.Any.fromFunction2(value))
    }
  }
}
