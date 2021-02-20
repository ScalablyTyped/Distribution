package typings.typeorm

import typings.typeorm.browserMod.Connection
import typings.typeorm.browserMod.SelectQueryBuilder
import typings.typeorm.orderByConditionMod.OrderByCondition
import typings.typeorm.tableTypesMod.TableType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMetadataArgsMod {
  
  @js.native
  trait TableMetadataArgs extends StObject {
    
    /**
      * Database name. Used in MySql and Sql Server.
      */
    var database: js.UndefOr[String] = js.native
    
    /**
      * Table's database engine type (like "InnoDB", "MyISAM", etc).
      */
    var engine: js.UndefOr[String] = js.native
    
    /**
      * View expression.
      */
    var expression: js.UndefOr[String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]])] = js.native
    
    /**
      * Indicates if view is materialized
      */
    var materialized: js.UndefOr[Boolean] = js.native
    
    /**
      * Table's name. If name is not set then table's name will be generated from target's name.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Specifies a default order by used for queries from this table when no explicit order by is specified.
      */
    var orderBy: js.UndefOr[OrderByCondition | (js.Function1[/* object */ js.Any, OrderByCondition | _])] = js.native
    
    /**
      * Schema name. Used in Postgres and Sql Server.
      */
    var schema: js.UndefOr[String] = js.native
    
    /**
      * Indicates if schema synchronization is enabled or disabled for this entity.
      * If it will be set to false then schema sync will and migrations ignore this entity.
      * By default schema synchronization is enabled for all entities.
      */
    var synchronize: js.UndefOr[Boolean] = js.native
    
    /**
      * Class to which table is applied.
      * Function target is a table defined in the class.
      * String target is a table defined in a json schema.
      */
    var target: js.Function | String = js.native
    
    /**
      * Table type. Tables can be abstract, closure, junction, embedded, etc.
      */
    var `type`: TableType = js.native
    
    /**
      * If set to 'true' this option disables Sqlite's default behaviour of secretly creating
      * an integer primary key column named 'rowid' on table creation.
      */
    var withoutRowid: js.UndefOr[Boolean] = js.native
  }
  object TableMetadataArgs {
    
    @scala.inline
    def apply(target: js.Function | String, `type`: TableType): TableMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableMetadataArgs]
    }
    
    @scala.inline
    implicit class TableMetadataArgsMutableBuilder[Self <: TableMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setExpression(value: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]])): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionFunction1(value: /* connection */ Connection => SelectQueryBuilder[_]): Self = StObject.set(x, "expression", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      @scala.inline
      def setMaterialized(value: Boolean): Self = StObject.set(x, "materialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaterializedUndefined: Self = StObject.set(x, "materialized", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOrderBy(value: OrderByCondition | (js.Function1[/* object */ js.Any, OrderByCondition | _])): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderByFunction1(value: /* object */ js.Any => OrderByCondition | _): Self = StObject.set(x, "orderBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSynchronize(value: Boolean): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutRowid(value: Boolean): Self = StObject.set(x, "withoutRowid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutRowidUndefined: Self = StObject.set(x, "withoutRowid", js.undefined)
    }
  }
}
