package typings.typeorm

import typings.typeorm.joinColumnOptionsMod.JoinColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinTableOptionsMod {
  
  @js.native
  trait JoinTableOptions extends StObject {
    
    /**
      * Database where join table will be created.
      * Works only in some databases (like mysql and mssql).
      */
    var database: js.UndefOr[String] = js.native
    
    /**
      * Second (inverse) column of the join table.
      */
    var inverseJoinColumn: js.UndefOr[JoinColumnOptions] = js.native
    
    /**
      * First column of the join table.
      */
    var joinColumn: js.UndefOr[JoinColumnOptions] = js.native
    
    /**
      * Name of the table that will be created to store values of the both tables (join table).
      * By default is auto generated.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Schema where join table will be created.
      * Works only in some databases (like postgres and mssql).
      */
    var schema: js.UndefOr[String] = js.native
  }
  object JoinTableOptions {
    
    @scala.inline
    def apply(): JoinTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JoinTableOptions]
    }
    
    @scala.inline
    implicit class JoinTableOptionsMutableBuilder[Self <: JoinTableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setInverseJoinColumn(value: JoinColumnOptions): Self = StObject.set(x, "inverseJoinColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseJoinColumnUndefined: Self = StObject.set(x, "inverseJoinColumn", js.undefined)
      
      @scala.inline
      def setJoinColumn(value: JoinColumnOptions): Self = StObject.set(x, "joinColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinColumnUndefined: Self = StObject.set(x, "joinColumn", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
