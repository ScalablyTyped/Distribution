package typings.typeorm

import typings.typeorm.typesColumnTypesMod.PrimaryGeneratedColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsPrimaryGeneratedColumnNumericOptionsMod {
  
  trait PrimaryGeneratedColumnNumericOptions extends StObject {
    
    /**
      * Column comment. Not supported by all database types.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * Column name in the database.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Column type. Must be one of the value from the ColumnTypes class.
      */
    var `type`: js.UndefOr[PrimaryGeneratedColumnType] = js.undefined
    
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
  object PrimaryGeneratedColumnNumericOptions {
    
    inline def apply(): PrimaryGeneratedColumnNumericOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryGeneratedColumnNumericOptions]
    }
    
    extension [Self <: PrimaryGeneratedColumnNumericOptions](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: PrimaryGeneratedColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
      
      inline def setZerofill(value: Boolean): Self = StObject.set(x, "zerofill", value.asInstanceOf[js.Any])
      
      inline def setZerofillUndefined: Self = StObject.set(x, "zerofill", js.undefined)
    }
  }
}
