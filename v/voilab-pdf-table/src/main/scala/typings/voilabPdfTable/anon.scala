package typings.voilabPdfTable

import typings.voilabPdfTable.mod.VoilabPdfTable
import typings.voilabPdfTable.mod.VoilabPdfTableHeader
import typings.voilabPdfTable.voilabPdfTableStrings.bottom
import typings.voilabPdfTable.voilabPdfTableStrings.center
import typings.voilabPdfTable.voilabPdfTableStrings.left
import typings.voilabPdfTable.voilabPdfTableStrings.right
import typings.voilabPdfTable.voilabPdfTableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align[T] extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.undefined
    
    var border: js.UndefOr[String] = js.undefined
    
    var borderOpacity: js.UndefOr[Double] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var cellAdded: js.UndefOr[
        js.Function3[/* table */ VoilabPdfTable[T], /* row */ T, /* draw */ Boolean, Unit]
      ] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var headerPadding: js.UndefOr[
        js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: /* keyof T */ String
    
    var padding: js.UndefOr[
        js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ] = js.undefined
    
    var renderer: js.UndefOr[
        js.Function3[/* table */ VoilabPdfTable[T], /* row */ T, /* draw */ Boolean, Unit]
      ] = js.undefined
    
    var valign: js.UndefOr[top | center | bottom] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Align {
    
    inline def apply[T](id: /* keyof T */ String): Align[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align[T]]
    }
    
    extension [Self <: Align[?], T](x: Self & Align[T]) {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderOpacity(value: Double): Self = StObject.set(x, "borderOpacity", value.asInstanceOf[js.Any])
      
      inline def setBorderOpacityUndefined: Self = StObject.set(x, "borderOpacity", js.undefined)
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCellAdded(value: (/* table */ VoilabPdfTable[T], /* row */ T, /* draw */ Boolean) => Unit): Self = StObject.set(x, "cellAdded", js.Any.fromFunction3(value))
      
      inline def setCellAddedUndefined: Self = StObject.set(x, "cellAdded", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHeaderPadding(
        value: js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ): Self = StObject.set(x, "headerPadding", value.asInstanceOf[js.Any])
      
      inline def setHeaderPaddingUndefined: Self = StObject.set(x, "headerPadding", js.undefined)
      
      inline def setHeaderPaddingVarargs(value: Double*): Self = StObject.set(x, "headerPadding", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: /* keyof T */ String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPadding(
        value: js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setRenderer(value: (/* table */ VoilabPdfTable[T], /* row */ T, /* draw */ Boolean) => Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction3(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setValign(value: top | center | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Cancel extends StObject {
    
    var cancel: Boolean
  }
  object Cancel {
    
    inline def apply(cancel: Boolean): Cancel = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    }
  }
  
  trait Header[T] extends StObject {
    
    var header: String
    
    var headerBorder: js.UndefOr[String] = js.undefined
    
    var headerBorderOpacity: js.UndefOr[Double] = js.undefined
    
    var headerCellAdded: js.UndefOr[
        js.Function3[
          /* table */ VoilabPdfTable[T], 
          /* header */ VoilabPdfTableHeader[T], 
          /* draw */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var headerFill: js.UndefOr[Boolean] = js.undefined
    
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    var headerRenderer: js.UndefOr[
        js.Function3[
          /* table */ VoilabPdfTable[T], 
          /* header */ VoilabPdfTableHeader[T], 
          /* draw */ Boolean, 
          Unit
        ]
      ] = js.undefined
  }
  object Header {
    
    inline def apply[T](header: String): Header[T] = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header[T]]
    }
    
    extension [Self <: Header[?], T](x: Self & Header[T]) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderBorder(value: String): Self = StObject.set(x, "headerBorder", value.asInstanceOf[js.Any])
      
      inline def setHeaderBorderOpacity(value: Double): Self = StObject.set(x, "headerBorderOpacity", value.asInstanceOf[js.Any])
      
      inline def setHeaderBorderOpacityUndefined: Self = StObject.set(x, "headerBorderOpacity", js.undefined)
      
      inline def setHeaderBorderUndefined: Self = StObject.set(x, "headerBorder", js.undefined)
      
      inline def setHeaderCellAdded(
        value: (/* table */ VoilabPdfTable[T], /* header */ VoilabPdfTableHeader[T], /* draw */ Boolean) => Unit
      ): Self = StObject.set(x, "headerCellAdded", js.Any.fromFunction3(value))
      
      inline def setHeaderCellAddedUndefined: Self = StObject.set(x, "headerCellAdded", js.undefined)
      
      inline def setHeaderFill(value: Boolean): Self = StObject.set(x, "headerFill", value.asInstanceOf[js.Any])
      
      inline def setHeaderFillUndefined: Self = StObject.set(x, "headerFill", js.undefined)
      
      inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      inline def setHeaderRenderer(
        value: (/* table */ VoilabPdfTable[T], /* header */ VoilabPdfTableHeader[T], /* draw */ Boolean) => Unit
      ): Self = StObject.set(x, "headerRenderer", js.Any.fromFunction3(value))
      
      inline def setHeaderRendererUndefined: Self = StObject.set(x, "headerRenderer", js.undefined)
    }
  }
  
  trait HeaderBorder extends StObject {
    
    var header: js.UndefOr[scala.Nothing] = js.undefined
    
    var headerBorder: js.UndefOr[scala.Nothing] = js.undefined
    
    var headerBorderOpacity: js.UndefOr[scala.Nothing] = js.undefined
    
    var headerCellAdded: js.UndefOr[scala.Nothing] = js.undefined
    
    var headerFill: js.UndefOr[scala.Nothing] = js.undefined
    
    var headerHeight: js.UndefOr[scala.Nothing] = js.undefined
    
    var headerRenderer: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
