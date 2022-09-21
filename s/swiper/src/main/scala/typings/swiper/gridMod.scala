package typings.swiper

import typings.swiper.swiperStrings.column
import typings.swiper.swiperStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  trait GridEvents extends StObject
  
  trait GridMethods extends StObject
  
  trait GridOptions extends StObject {
    
    /**
      * Can be `'column'` or `'row'`. Defines how slides should fill rows, by column or by row
      *
      * @default 'column'
      */
    var fill: js.UndefOr[row | column] = js.undefined
    
    /**
      * Number of slides rows, for multirow layout
      *
      * @note `rows` > 1 is currently not compatible with loop mode (`loop: true`)
      *
      * @default 1
      */
    var rows: js.UndefOr[Double] = js.undefined
  }
  object GridOptions {
    
    inline def apply(): GridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridOptions]
    }
    
    extension [Self <: GridOptions](x: Self) {
      
      inline def setFill(value: row | column): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
}
