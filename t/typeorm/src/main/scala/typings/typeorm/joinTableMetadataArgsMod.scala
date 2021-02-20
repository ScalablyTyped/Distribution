package typings.typeorm

import typings.typeorm.joinColumnMetadataArgsMod.JoinColumnMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinTableMetadataArgsMod {
  
  @js.native
  trait JoinTableMetadataArgs extends StObject {
    
    /**
      * Database where join table will be created.
      * Works only in some databases (like mysql and mssql).
      */
    val database: js.UndefOr[String] = js.native
    
    /**
      * Second (inverse) column of the join table.
      */
    val inverseJoinColumns: js.UndefOr[js.Array[JoinColumnMetadataArgs]] = js.native
    
    /**
      * First column of the join table.
      */
    val joinColumns: js.UndefOr[js.Array[JoinColumnMetadataArgs]] = js.native
    
    /**
      * Name of the table that will be created to store values of the both tables (join table).
      * By default is auto generated.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * Class's property name to which this column is applied.
      */
    val propertyName: String = js.native
    
    /**
      * Schema where join table will be created.
      * Works only in some databases (like postgres and mssql).
      */
    val schema: js.UndefOr[String] = js.native
    
    /**
      * Class to which this column is applied.
      */
    val target: js.Function | String = js.native
  }
  object JoinTableMetadataArgs {
    
    @scala.inline
    def apply(propertyName: String, target: js.Function | String): JoinTableMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinTableMetadataArgs]
    }
    
    @scala.inline
    implicit class JoinTableMetadataArgsMutableBuilder[Self <: JoinTableMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setInverseJoinColumns(value: js.Array[JoinColumnMetadataArgs]): Self = StObject.set(x, "inverseJoinColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseJoinColumnsUndefined: Self = StObject.set(x, "inverseJoinColumns", js.undefined)
      
      @scala.inline
      def setInverseJoinColumnsVarargs(value: JoinColumnMetadataArgs*): Self = StObject.set(x, "inverseJoinColumns", js.Array(value :_*))
      
      @scala.inline
      def setJoinColumns(value: js.Array[JoinColumnMetadataArgs]): Self = StObject.set(x, "joinColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinColumnsUndefined: Self = StObject.set(x, "joinColumns", js.undefined)
      
      @scala.inline
      def setJoinColumnsVarargs(value: JoinColumnMetadataArgs*): Self = StObject.set(x, "joinColumns", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
