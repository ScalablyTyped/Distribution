package typings.vegaTypings

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.layoutMod.LayoutParams
  */
  trait Layout extends StObject
  object Layout {
    
    inline def LayoutParams(): typings.vegaTypings.layoutMod.LayoutParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vegaTypings.layoutMod.LayoutParams]
    }
    
    inline def SignalRef(signal: String): typings.vegaTypings.signalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.signalMod.SignalRef]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.all
    - typings.vegaTypings.vegaTypingsStrings.each
    - typings.vegaTypings.vegaTypingsStrings.none
  */
  trait LayoutAlign extends StObject
  object LayoutAlign {
    
    inline def all: typings.vegaTypings.vegaTypingsStrings.all = "all".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.all]
    
    inline def each: typings.vegaTypings.vegaTypingsStrings.each = "each".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.each]
    
    inline def none: typings.vegaTypings.vegaTypingsStrings.none = "none".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.full
    - typings.vegaTypings.vegaTypingsStrings.flush
    - typings.vegaTypings.signalMod.SignalRef
  */
  trait LayoutBounds extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.anon.ColumnFooter
  */
  type LayoutOffset = _LayoutOffset | Double
  
  trait LayoutParams
    extends StObject
       with Layout {
    
    var align: js.UndefOr[LayoutAlign | SignalRef | RowColumn[LayoutAlign]] = js.undefined
    
    var bounds: js.UndefOr[LayoutBounds] = js.undefined
    
    var columns: js.UndefOr[Double | SignalRef] = js.undefined
    
    var footerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.undefined
    
    var headerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.undefined
    
    var offset: js.UndefOr[LayoutOffset] = js.undefined
    
    var padding: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.undefined
    
    var titleAnchor: js.UndefOr[LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor]] = js.undefined
    
    var titleBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.undefined
  }
  object LayoutParams {
    
    inline def apply(): LayoutParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutParams]
    }
    
    extension [Self <: LayoutParams](x: Self) {
      
      inline def setAlign(value: LayoutAlign | SignalRef | RowColumn[LayoutAlign]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBounds(value: LayoutBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setColumns(value: Double | SignalRef): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setFooterBand(value: Double | SignalRef | RowColumn[Double]): Self = StObject.set(x, "footerBand", value.asInstanceOf[js.Any])
      
      inline def setFooterBandUndefined: Self = StObject.set(x, "footerBand", js.undefined)
      
      inline def setHeaderBand(value: Double | SignalRef | RowColumn[Double]): Self = StObject.set(x, "headerBand", value.asInstanceOf[js.Any])
      
      inline def setHeaderBandUndefined: Self = StObject.set(x, "headerBand", js.undefined)
      
      inline def setOffset(value: LayoutOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPadding(value: Double | SignalRef | RowColumn[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setTitleAnchor(value: LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor]): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      inline def setTitleBand(value: Double | SignalRef | RowColumn[Double]): Self = StObject.set(x, "titleBand", value.asInstanceOf[js.Any])
      
      inline def setTitleBandUndefined: Self = StObject.set(x, "titleBand", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.start
    - typings.vegaTypings.vegaTypingsStrings.end
  */
  trait LayoutTitleAnchor extends StObject
  object LayoutTitleAnchor {
    
    inline def end: typings.vegaTypings.vegaTypingsStrings.end = "end".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.end]
    
    inline def start: typings.vegaTypings.vegaTypingsStrings.start = "start".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.start]
  }
  
  trait RowColumn[T] extends StObject {
    
    var column: js.UndefOr[T | SignalRef] = js.undefined
    
    var row: js.UndefOr[T | SignalRef] = js.undefined
  }
  object RowColumn {
    
    inline def apply[T](): RowColumn[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowColumn[T]]
    }
    
    extension [Self <: RowColumn[?], T](x: Self & RowColumn[T]) {
      
      inline def setColumn(value: T | SignalRef): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setRow(value: T | SignalRef): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait _LayoutOffset extends StObject
  object _LayoutOffset {
    
    inline def ColumnFooter(): typings.vegaTypings.anon.ColumnFooter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vegaTypings.anon.ColumnFooter]
    }
    
    inline def SignalRef(signal: String): typings.vegaTypings.signalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.signalMod.SignalRef]
    }
  }
}
