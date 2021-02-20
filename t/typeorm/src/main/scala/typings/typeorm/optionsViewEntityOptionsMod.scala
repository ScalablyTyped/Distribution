package typings.typeorm

import typings.typeorm.mod.Connection
import typings.typeorm.mod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsViewEntityOptionsMod {
  
  @js.native
  trait ViewEntityOptions extends StObject {
    
    /**
      * Database name. Used in Mysql and Sql Server.
      */
    var database: js.UndefOr[String] = js.native
    
    /**
      * View expression.
      */
    var expression: js.UndefOr[String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]])] = js.native
    
    /**
      * Indicates if view should be materialized view.
      * It's supported by Postgres and Oracle.
      */
    var materialized: js.UndefOr[Boolean] = js.native
    
    /**
      * View name.
      * If not specified then naming strategy will generate view name from class name.
      */
    var name: js.UndefOr[String] = js.native
    
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
  }
  object ViewEntityOptions {
    
    @scala.inline
    def apply(): ViewEntityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewEntityOptions]
    }
    
    @scala.inline
    implicit class ViewEntityOptionsMutableBuilder[Self <: ViewEntityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
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
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSynchronize(value: Boolean): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
    }
  }
}
