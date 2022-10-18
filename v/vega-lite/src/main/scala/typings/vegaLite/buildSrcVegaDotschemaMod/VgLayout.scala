package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaLite.anon.ColumnFooter
import typings.vegaLite.anon.Signal
import typings.vegaLite.vegaLiteStrings.end
import typings.vegaLite.vegaLiteStrings.flush
import typings.vegaLite.vegaLiteStrings.full
import typings.vegaLite.vegaLiteStrings.start
import typings.vegaTypings.typesSpecLayoutMod.LayoutAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgLayout extends StObject {
  
  var align: js.UndefOr[LayoutAlign | RowCol[LayoutAlign]] = js.undefined
  
  var bounds: js.UndefOr[full | flush] = js.undefined
  
  var center: js.UndefOr[Boolean | RowCol[Boolean]] = js.undefined
  
  var columns: js.UndefOr[Double | Signal] = js.undefined
  
  var footerBand: js.UndefOr[Double | RowCol[Double]] = js.undefined
  
  var headerBand: js.UndefOr[Double | RowCol[Double]] = js.undefined
  
  var offset: js.UndefOr[Double | ColumnFooter] = js.undefined
  
  var padding: js.UndefOr[Double | RowCol[Double]] = js.undefined
  
  var titleAnchor: js.UndefOr[start | end | (RowCol[start | end])] = js.undefined
}
object VgLayout {
  
  inline def apply(): VgLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgLayout]
  }
  
  extension [Self <: VgLayout](x: Self) {
    
    inline def setAlign(value: LayoutAlign | RowCol[LayoutAlign]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBounds(value: full | flush): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCenter(value: Boolean | RowCol[Boolean]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setColumns(value: Double | Signal): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setFooterBand(value: Double | RowCol[Double]): Self = StObject.set(x, "footerBand", value.asInstanceOf[js.Any])
    
    inline def setFooterBandUndefined: Self = StObject.set(x, "footerBand", js.undefined)
    
    inline def setHeaderBand(value: Double | RowCol[Double]): Self = StObject.set(x, "headerBand", value.asInstanceOf[js.Any])
    
    inline def setHeaderBandUndefined: Self = StObject.set(x, "headerBand", js.undefined)
    
    inline def setOffset(value: Double | ColumnFooter): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPadding(value: Double | RowCol[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setTitleAnchor(value: start | end | (RowCol[start | end])): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
    
    inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
  }
}
