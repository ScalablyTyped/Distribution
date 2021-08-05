package typings.typeorm

import typings.typeorm.joinColumnMetadataArgsMod.JoinColumnMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinTableMetadataArgsMod {
  
  trait JoinTableMetadataArgs extends StObject {
    
    /**
      * Database where join table will be created.
      * Works only in some databases (like mysql and mssql).
      */
    val database: js.UndefOr[String] = js.undefined
    
    /**
      * Second (inverse) column of the join table.
      */
    val inverseJoinColumns: js.UndefOr[js.Array[JoinColumnMetadataArgs]] = js.undefined
    
    /**
      * First column of the join table.
      */
    val joinColumns: js.UndefOr[js.Array[JoinColumnMetadataArgs]] = js.undefined
    
    /**
      * Name of the table that will be created to store values of the both tables (join table).
      * By default is auto generated.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * Class's property name to which this column is applied.
      */
    val propertyName: String
    
    /**
      * Schema where join table will be created.
      * Works only in some databases (like postgres and mssql).
      */
    val schema: js.UndefOr[String] = js.undefined
    
    /**
      * Class to which this column is applied.
      */
    val target: js.Function | String
  }
  object JoinTableMetadataArgs {
    
    inline def apply(propertyName: String, target: js.Function | String): JoinTableMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinTableMetadataArgs]
    }
    
    extension [Self <: JoinTableMetadataArgs](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setInverseJoinColumns(value: js.Array[JoinColumnMetadataArgs]): Self = StObject.set(x, "inverseJoinColumns", value.asInstanceOf[js.Any])
      
      inline def setInverseJoinColumnsUndefined: Self = StObject.set(x, "inverseJoinColumns", js.undefined)
      
      inline def setInverseJoinColumnsVarargs(value: JoinColumnMetadataArgs*): Self = StObject.set(x, "inverseJoinColumns", js.Array(value :_*))
      
      inline def setJoinColumns(value: js.Array[JoinColumnMetadataArgs]): Self = StObject.set(x, "joinColumns", value.asInstanceOf[js.Any])
      
      inline def setJoinColumnsUndefined: Self = StObject.set(x, "joinColumns", js.undefined)
      
      inline def setJoinColumnsVarargs(value: JoinColumnMetadataArgs*): Self = StObject.set(x, "joinColumns", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
