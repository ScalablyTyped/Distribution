package typings.typeorm

import typings.typeorm.findOptionsOrderByConditionMod.OrderByCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsEntityOptionsMod {
  
  trait EntityOptions extends StObject {
    
    /**
      * Database name. Used in Mysql and Sql Server.
      */
    var database: js.UndefOr[String] = js.undefined
    
    /**
      * Table's database engine type (like "InnoDB", "MyISAM", etc).
      * It is used only during table creation.
      * If you update this value and table is already created, it will not change table's engine type.
      * Note that not all databases support this option.
      */
    var engine: js.UndefOr[String] = js.undefined
    
    /**
      * Table name.
      * If not specified then naming strategy will generate table name from entity name.
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
      * If set to 'true' this option disables Sqlite's default behaviour of secretly creating
      * an integer primary key column named 'rowid' on table creation.
      * @see https://www.sqlite.org/withoutrowid.html.
      */
    var withoutRowid: js.UndefOr[Boolean] = js.undefined
  }
  object EntityOptions {
    
    inline def apply(): EntityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntityOptions]
    }
    
    extension [Self <: EntityOptions](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrderBy(value: OrderByCondition | (js.Function1[/* object */ js.Any, OrderByCondition | js.Any])): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByFunction1(value: /* object */ js.Any => OrderByCondition | js.Any): Self = StObject.set(x, "orderBy", js.Any.fromFunction1(value))
      
      inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSynchronize(value: Boolean): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
      
      inline def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
      
      inline def setWithoutRowid(value: Boolean): Self = StObject.set(x, "withoutRowid", value.asInstanceOf[js.Any])
      
      inline def setWithoutRowidUndefined: Self = StObject.set(x, "withoutRowid", js.undefined)
    }
  }
}
