package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsColumnWithWidthOptionsMod {
  
  trait ColumnWithWidthOptions extends StObject {
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Column type's display width. Used only on some column types in MySQL.
      * For example, INT(4) specifies an INT with a display width of four digits.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
      * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to this column
      */
    var zerofill: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnWithWidthOptions {
    
    inline def apply(): ColumnWithWidthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnWithWidthOptions]
    }
    
    extension [Self <: ColumnWithWidthOptions](x: Self) {
      
      inline def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZerofill(value: Boolean): Self = StObject.set(x, "zerofill", value.asInstanceOf[js.Any])
      
      inline def setZerofillUndefined: Self = StObject.set(x, "zerofill", js.undefined)
    }
  }
}
