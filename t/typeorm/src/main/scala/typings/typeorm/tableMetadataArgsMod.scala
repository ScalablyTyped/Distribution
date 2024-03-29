package typings.typeorm

import typings.typeorm.browserMod.Connection
import typings.typeorm.browserMod.SelectQueryBuilder
import typings.typeorm.orderByConditionMod.OrderByCondition
import typings.typeorm.tableTypesMod.TableType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMetadataArgsMod {
  
  trait TableMetadataArgs extends StObject {
    
    /**
      * Database name. Used in MySql and Sql Server.
      */
    var database: js.UndefOr[String] = js.undefined
    
    /**
      * Table's database engine type (like "InnoDB", "MyISAM", etc).
      */
    var engine: js.UndefOr[String] = js.undefined
    
    /**
      * View expression.
      */
    var expression: js.UndefOr[String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[js.Any]])] = js.undefined
    
    /**
      * Indicates if view is materialized
      */
    var materialized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Table's name. If name is not set then table's name will be generated from target's name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a default order by used for queries from this table when no explicit order by is specified.
      */
    var orderBy: js.UndefOr[
        OrderByCondition | (js.Function1[/* object */ js.Any, OrderByCondition | js.Any])
      ] = js.undefined
    
    /**
      * Schema name. Used in Postgres and Sql Server.
      */
    var schema: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if schema synchronization is enabled or disabled for this entity.
      * If it will be set to false then schema sync will and migrations ignore this entity.
      * By default schema synchronization is enabled for all entities.
      */
    var synchronize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Class to which table is applied.
      * Function target is a table defined in the class.
      * String target is a table defined in a json schema.
      */
    var target: js.Function | String
    
    /**
      * Table type. Tables can be abstract, closure, junction, embedded, etc.
      */
    var `type`: TableType
    
    /**
      * If set to 'true' this option disables Sqlite's default behaviour of secretly creating
      * an integer primary key column named 'rowid' on table creation.
      */
    var withoutRowid: js.UndefOr[Boolean] = js.undefined
  }
  object TableMetadataArgs {
    
    inline def apply(target: js.Function | String, `type`: TableType): TableMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableMetadataArgs]
    }
    
    extension [Self <: TableMetadataArgs](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setExpression(value: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[js.Any]])): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionFunction1(value: /* connection */ Connection => SelectQueryBuilder[js.Any]): Self = StObject.set(x, "expression", js.Any.fromFunction1(value))
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setMaterialized(value: Boolean): Self = StObject.set(x, "materialized", value.asInstanceOf[js.Any])
      
      inline def setMaterializedUndefined: Self = StObject.set(x, "materialized", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrderBy(value: OrderByCondition | (js.Function1[/* object */ js.Any, OrderByCondition | js.Any])): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByFunction1(value: /* object */ js.Any => OrderByCondition | js.Any): Self = StObject.set(x, "orderBy", js.Any.fromFunction1(value))
      
      inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSynchronize(value: Boolean): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
      
      inline def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: TableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWithoutRowid(value: Boolean): Self = StObject.set(x, "withoutRowid", value.asInstanceOf[js.Any])
      
      inline def setWithoutRowidUndefined: Self = StObject.set(x, "withoutRowid", js.undefined)
    }
  }
}
