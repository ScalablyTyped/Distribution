package typings.typeorm

import typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primaryGeneratedColumnNumericOptionsMod {
  
  @js.native
  trait PrimaryGeneratedColumnNumericOptions extends StObject {
    
    /**
      * Column comment. Not supported by all database types.
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * Column name in the database.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Column type. Must be one of the value from the ColumnTypes class.
      */
    var `type`: js.UndefOr[PrimaryGeneratedColumnType] = js.native
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: js.UndefOr[Boolean] = js.native
    
    /**
      * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
      * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to the column
      */
    var zerofill: js.UndefOr[Boolean] = js.native
  }
  object PrimaryGeneratedColumnNumericOptions {
    
    @scala.inline
    def apply(): PrimaryGeneratedColumnNumericOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryGeneratedColumnNumericOptions]
    }
    
    @scala.inline
    implicit class PrimaryGeneratedColumnNumericOptionsMutableBuilder[Self <: PrimaryGeneratedColumnNumericOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: PrimaryGeneratedColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
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
