package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsColumnNumericOptionsMod {
  
  trait ColumnNumericOptions extends StObject {
    
    /**
      * The precision for a decimal (exact numeric) column (applies only for decimal column), which is the maximum
      * number of digits that are stored for the values.
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * The scale for a decimal (exact numeric) column (applies only for decimal column), which represents the number
      * of digits to the right of the decimal point and must not be greater than precision.
      */
    var scale: js.UndefOr[Double] = js.undefined
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
      * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to the column
      */
    var zerofill: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnNumericOptions {
    
    @scala.inline
    def apply(): ColumnNumericOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnNumericOptions]
    }
    
    @scala.inline
    implicit class ColumnNumericOptionsMutableBuilder[Self <: ColumnNumericOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
      
      @scala.inline
      def setZerofill(value: Boolean): Self = StObject.set(x, "zerofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZerofillUndefined: Self = StObject.set(x, "zerofill", js.undefined)
    }
  }
}
