package typings.typeorm.viewEntityOptionsMod

import typings.typeorm.browserMod.Connection
import typings.typeorm.browserMod.SelectQueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewEntityOptions extends js.Object {
  
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
  implicit class ViewEntityOptionsOps[Self <: ViewEntityOptions] (val x: Self) extends AnyVal {
    
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
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSynchronize(value: Boolean): Self = this.set("synchronize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronize: Self = this.set("synchronize", js.undefined)
  }
}
