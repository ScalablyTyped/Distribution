package typings.typeorm.tableMetadataArgsMod

import typings.typeorm.browserMod.Connection
import typings.typeorm.browserMod.SelectQueryBuilder
import typings.typeorm.orderByConditionMod.OrderByCondition
import typings.typeorm.tableTypesMod.TableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableMetadataArgs extends js.Object {
  
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
  implicit class TableMetadataArgsOps[Self <: TableMetadataArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TableType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setExpressionFunction1(value: /* connection */ Connection => SelectQueryBuilder[_]): Self = this.set("expression", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpression(value: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]])): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setMaterialized(value: Boolean): Self = this.set("materialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterialized: Self = this.set("materialized", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrderByFunction1(value: /* object */ js.Any => OrderByCondition | _): Self = this.set("orderBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrderBy(value: OrderByCondition | (js.Function1[/* object */ js.Any, OrderByCondition | _])): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSynchronize(value: Boolean): Self = this.set("synchronize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronize: Self = this.set("synchronize", js.undefined)
    
    @scala.inline
    def setWithoutRowid(value: Boolean): Self = this.set("withoutRowid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutRowid: Self = this.set("withoutRowid", js.undefined)
  }
}
