package typings.typeorm

import org.scalablytyped.runtime.TopLevel
import typings.typeorm.entitySchemaEntitySchemaCheckOptionsMod.EntitySchemaCheckOptions
import typings.typeorm.entitySchemaEntitySchemaExclusionOptionsMod.EntitySchemaExclusionOptions
import typings.typeorm.entitySchemaEntitySchemaIndexOptionsMod.EntitySchemaIndexOptions
import typings.typeorm.entitySchemaEntitySchemaUniqueOptionsMod.EntitySchemaUniqueOptions
import typings.typeorm.findOptionsOrderByConditionMod.OrderByCondition
import typings.typeorm.mod.Connection
import typings.typeorm.mod.SelectQueryBuilder
import typings.typeorm.typesTableTypesMod.TableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/entity-schema/EntitySchemaOptions", JSImport.Namespace)
@js.native
object entitySchemaEntitySchemaOptionsMod extends js.Object {
  
  @js.native
  class EntitySchemaOptions[T] () extends js.Object {
    
    /**
      * Entity check options.
      */
    var checks: js.UndefOr[js.Array[EntitySchemaCheckOptions]] = js.native
    
    /**
      * Entity column's options.
      */
    var columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? typeorm.typeorm/entity-schema/EntitySchemaColumnOptions.EntitySchemaColumnOptions}
      */ typings.typeorm.typeormStrings.EntitySchemaOptions with TopLevel[js.Any] = js.native
    
    /**
      * Database name. Used in MySql and Sql Server.
      */
    var database: js.UndefOr[String] = js.native
    
    /**
      * Entity exclusion options.
      */
    var exclusions: js.UndefOr[js.Array[EntitySchemaExclusionOptions]] = js.native
    
    /**
      * View expression.
      */
    var expression: js.UndefOr[String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]])] = js.native
    
    /**
      * Name of the schema it extends.
      */
    var `extends`: js.UndefOr[String] = js.native
    
    /**
      * Entity indices options.
      */
    var indices: js.UndefOr[js.Array[EntitySchemaIndexOptions]] = js.native
    
    /**
      * Entity name.
      */
    var name: String = js.native
    
    /**
      * Specifies a property name by which queries will perform ordering by default when fetching rows.
      */
    var orderBy: js.UndefOr[OrderByCondition] = js.native
    
    /**
      * Entity relation's options.
      */
    var relations: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? typeorm.typeorm/entity-schema/EntitySchemaRelationOptions.EntitySchemaRelationOptions}
      */ typings.typeorm.typeormStrings.EntitySchemaOptions with TopLevel[js.Any]
      ] = js.native
    
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
      * Table name.
      */
    var tableName: js.UndefOr[String] = js.native
    
    /**
      * Target bind to this entity schema. Optional.
      */
    var target: js.UndefOr[js.Function] = js.native
    
    /**
      * Table type.
      */
    var `type`: js.UndefOr[TableType] = js.native
    
    /**
      * Entity uniques options.
      */
    var uniques: js.UndefOr[js.Array[EntitySchemaUniqueOptions]] = js.native
  }
}
