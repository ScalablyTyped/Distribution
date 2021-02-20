package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnWithWidthOptionsMod {
  
  @js.native
  trait ColumnWithWidthOptions extends StObject {
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: js.UndefOr[Boolean] = js.native
    
    /**
      * Column type's display width. Used only on some column types in MySQL.
      * For example, INT(4) specifies an INT with a display width of four digits.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
      * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to this column
      */
    var zerofill: js.UndefOr[Boolean] = js.native
  }
  object ColumnWithWidthOptions {
    
    @scala.inline
    def apply(): ColumnWithWidthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnWithWidthOptions]
    }
    
    @scala.inline
    implicit class ColumnWithWidthOptionsMutableBuilder[Self <: ColumnWithWidthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZerofill(value: Boolean): Self = StObject.set(x, "zerofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZerofillUndefined: Self = StObject.set(x, "zerofill", js.undefined)
    }
  }
}
