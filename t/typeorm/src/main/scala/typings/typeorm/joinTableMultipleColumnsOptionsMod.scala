package typings.typeorm

import typings.typeorm.joinColumnOptionsMod.JoinColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinTableMultipleColumnsOptionsMod {
  
  @js.native
  trait JoinTableMultipleColumnsOptions extends StObject {
    
    /**
      * Database where join table will be created.
      * Works only in some databases (like mysql and mssql).
      */
    var database: js.UndefOr[String] = js.native
    
    /**
      * Second (inverse) column of the join table.
      */
    var inverseJoinColumns: js.UndefOr[js.Array[JoinColumnOptions]] = js.native
    
    /**
      * First column of the join table.
      */
    var joinColumns: js.UndefOr[js.Array[JoinColumnOptions]] = js.native
    
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
  object JoinTableMultipleColumnsOptions {
    
    @scala.inline
    def apply(): JoinTableMultipleColumnsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JoinTableMultipleColumnsOptions]
    }
    
    @scala.inline
    implicit class JoinTableMultipleColumnsOptionsMutableBuilder[Self <: JoinTableMultipleColumnsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setInverseJoinColumns(value: js.Array[JoinColumnOptions]): Self = StObject.set(x, "inverseJoinColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseJoinColumnsUndefined: Self = StObject.set(x, "inverseJoinColumns", js.undefined)
      
      @scala.inline
      def setInverseJoinColumnsVarargs(value: JoinColumnOptions*): Self = StObject.set(x, "inverseJoinColumns", js.Array(value :_*))
      
      @scala.inline
      def setJoinColumns(value: js.Array[JoinColumnOptions]): Self = StObject.set(x, "joinColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinColumnsUndefined: Self = StObject.set(x, "joinColumns", js.undefined)
      
      @scala.inline
      def setJoinColumnsVarargs(value: JoinColumnOptions*): Self = StObject.set(x, "joinColumns", js.Array(value :_*))
      
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
