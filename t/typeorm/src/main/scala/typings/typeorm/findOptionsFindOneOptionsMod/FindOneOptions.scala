package typings.typeorm.findOptionsFindOneOptionsMod

import org.scalablytyped.runtime.TopLevel
import typings.typeorm.anon.DisableMixedMap
import typings.typeorm.anon.Milliseconds
import typings.typeorm.anon.Mode
import typings.typeorm.anon.`2`
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.findOptionsFindConditionsMod.FindConditions
import typings.typeorm.findOptionsJoinOptionsMod.JoinOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOneOptions[Entity] extends js.Object {
  
  /**
    * Enables or disables query result caching.
    */
  var cache: js.UndefOr[Boolean | Double | Milliseconds] = js.native
  
  /**
    * Specifies what relations should be loaded.
    */
  var join: js.UndefOr[JoinOptions] = js.native
  
  /**
    * Indicates if eager relations should be loaded or not.
    * By default they are loaded when find methods are used.
    */
  var loadEagerRelations: js.UndefOr[Boolean] = js.native
  
  /**
    * If sets to true then loads all relation ids of the entity and maps them into relation values (not relation objects).
    * If array of strings is given then loads only relation ids of the given properties.
    */
  var loadRelationIds: js.UndefOr[Boolean | DisableMixedMap] = js.native
  
  /**
    * Indicates what locking mode should be used.
    */
  var lock: js.UndefOr[Mode | `2`] = js.native
  
  /**
    * Order, in which entities should be ordered.
    */
  var order: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Entity ]:? 'ASC' | 'DESC' | 1 | -1}
    */ typings.typeorm.typeormStrings.FindOneOptions with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Indicates what relations of entity should be loaded (simplified left join form).
    */
  var relations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies what columns should be retrieved.
    */
  var select: js.UndefOr[js.Array[/* keyof Entity */ String]] = js.native
  
  /**
    * If this is set to true, SELECT query in a `find` method will be executed in a transaction.
    */
  var transaction: js.UndefOr[Boolean] = js.native
  
  /**
    * Simple condition that should be applied to match entities.
    */
  var where: js.UndefOr[
    js.Array[FindConditions[Entity]] | FindConditions[Entity] | ObjectLiteral | String
  ] = js.native
  
  /**
    * Indicates if soft-deleted rows should be included in entity result.
    */
  var withDeleted: js.UndefOr[Boolean] = js.native
}
object FindOneOptions {
  
  @scala.inline
  def apply[Entity](): FindOneOptions[Entity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneOptions[Entity]]
  }
  
  @scala.inline
  implicit class FindOneOptionsOps[Self <: FindOneOptions[_], Entity] (val x: Self with FindOneOptions[Entity]) extends AnyVal {
    
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
    def setCache(value: Boolean | Double | Milliseconds): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setJoin(value: JoinOptions): Self = this.set("join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    
    @scala.inline
    def setLoadEagerRelations(value: Boolean): Self = this.set("loadEagerRelations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadEagerRelations: Self = this.set("loadEagerRelations", js.undefined)
    
    @scala.inline
    def setLoadRelationIds(value: Boolean | DisableMixedMap): Self = this.set("loadRelationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadRelationIds: Self = this.set("loadRelationIds", js.undefined)
    
    @scala.inline
    def setLock(value: Mode | `2`): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    
    @scala.inline
    def setOrder(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof Entity ]:? 'ASC' | 'DESC' | 1 | -1}
      */ typings.typeorm.typeormStrings.FindOneOptions with TopLevel[js.Any]
    ): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setRelationsVarargs(value: String*): Self = this.set("relations", js.Array(value :_*))
    
    @scala.inline
    def setRelations(value: js.Array[String]): Self = this.set("relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
    
    @scala.inline
    def setSelectVarargs(value: (/* keyof Entity */ String)*): Self = this.set("select", js.Array(value :_*))
    
    @scala.inline
    def setSelect(value: js.Array[/* keyof Entity */ String]): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setTransaction(value: Boolean): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: FindConditions[Entity]*): Self = this.set("where", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: js.Array[FindConditions[Entity]] | FindConditions[Entity] | ObjectLiteral | String): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
    
    @scala.inline
    def setWithDeleted(value: Boolean): Self = this.set("withDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithDeleted: Self = this.set("withDeleted", js.undefined)
  }
}
