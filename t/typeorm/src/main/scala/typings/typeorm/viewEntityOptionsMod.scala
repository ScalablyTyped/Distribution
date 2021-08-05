package typings.typeorm

import typings.typeorm.browserMod.Connection
import typings.typeorm.browserMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewEntityOptionsMod {
  
  trait ViewEntityOptions extends StObject {
    
    /**
      * Database name. Used in Mysql and Sql Server.
      */
    var database: js.UndefOr[String] = js.undefined
    
    /**
      * View expression.
      */
    var expression: js.UndefOr[String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[js.Any]])] = js.undefined
    
    /**
      * Indicates if view should be materialized view.
      * It's supported by Postgres and Oracle.
      */
    var materialized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * View name.
      * If not specified then naming strategy will generate view name from class name.
      */
    var name: js.UndefOr[String] = js.undefined
    
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
  }
  object ViewEntityOptions {
    
    inline def apply(): ViewEntityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewEntityOptions]
    }
    
    extension [Self <: ViewEntityOptions](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setExpression(value: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[js.Any]])): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionFunction1(value: /* connection */ Connection => SelectQueryBuilder[js.Any]): Self = StObject.set(x, "expression", js.Any.fromFunction1(value))
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setMaterialized(value: Boolean): Self = StObject.set(x, "materialized", value.asInstanceOf[js.Any])
      
      inline def setMaterializedUndefined: Self = StObject.set(x, "materialized", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSynchronize(value: Boolean): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
      
      inline def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
    }
  }
}
