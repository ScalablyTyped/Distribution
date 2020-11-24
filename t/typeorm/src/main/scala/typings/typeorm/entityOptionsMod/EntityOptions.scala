package typings.typeorm.entityOptionsMod

import typings.typeorm.orderByConditionMod.OrderByCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityOptions extends js.Object {
  
  /**
    * Database name. Used in Mysql and Sql Server.
    */
  var database: js.UndefOr[String] = js.native
  
  /**
    * Table's database engine type (like "InnoDB", "MyISAM", etc).
    * It is used only during table creation.
    * If you update this value and table is already created, it will not change table's engine type.
    * Note that not all databases support this option.
    */
  var engine: js.UndefOr[String] = js.native
  
  /**
    * Table name.
    * If not specified then naming strategy will generate table name from entity name.
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
    * If set to 'true' this option disables Sqlite's default behaviour of secretly creating
    * an integer primary key column named 'rowid' on table creation.
    * @see https://www.sqlite.org/withoutrowid.html.
    */
  var withoutRowid: js.UndefOr[Boolean] = js.native
}
object EntityOptions {
  
  @scala.inline
  def apply(): EntityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityOptions]
  }
  
  @scala.inline
  implicit class EntityOptionsOps[Self <: EntityOptions] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
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
