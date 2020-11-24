package typings.typeorm.optionsRelationOptionsMod

import typings.typeorm.typeormStrings.`soft-remove`
import typings.typeorm.typeormStrings.insert
import typings.typeorm.typeormStrings.recover
import typings.typeorm.typeormStrings.remove
import typings.typeorm.typeormStrings.update
import typings.typeorm.typesDeferrableTypeMod.DeferrableType
import typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
import typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationOptions extends js.Object {
  
  /**
    * Sets cascades options for the given relation.
    * If set to true then it means that related object can be allowed to be inserted or updated in the database.
    * You can separately restrict cascades to insertion or updation using following syntax:
    *
    * cascade: ["insert", "update", "remove", "soft-remove", "recover"] // include or exclude one of them
    */
  var cascade: js.UndefOr[Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])] = js.native
  
  /**
    * Indicate if foreign key constraints can be deferred.
    */
  var deferrable: js.UndefOr[DeferrableType] = js.native
  
  /**
    * Set this relation to be eager.
    * Eager relations are always loaded automatically when relation's owner entity is loaded using find* methods.
    * Only using QueryBuilder prevents loading eager relations.
    * Eager flag cannot be set from both sides of relation - you can eager load only one side of the relationship.
    */
  var eager: js.UndefOr[Boolean] = js.native
  
  /**
    * Set this relation to be lazy. Note: lazy relations are promises. When you call them they return promise
    * which resolve relation result then. If your property's type is Promise then this relation is set to lazy automatically.
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if relation column value can be nullable or not.
    */
  var nullable: js.UndefOr[Boolean] = js.native
  
  /**
    * Database cascade action on delete.
    */
  var onDelete: js.UndefOr[OnDeleteType] = js.native
  
  /**
    * Database cascade action on update.
    */
  var onUpdate: js.UndefOr[OnUpdateType] = js.native
  
  /**
    * Indicates if persistence is enabled for the relation.
    * By default its enabled, but if you want to avoid any changes in the relation to be reflected in the database you can disable it.
    * If its disabled you can only change a relation from inverse side of a relation or using relation query builder functionality.
    * This is useful for performance optimization since its disabling avoid multiple extra queries during entity save.
    */
  var persistence: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if this relation will be a primary key.
    * Can be used only for many-to-one and owner one-to-one relations.
    */
  var primary: js.UndefOr[Boolean] = js.native
}
object RelationOptions {
  
  @scala.inline
  def apply(): RelationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationOptions]
  }
  
  @scala.inline
  implicit class RelationOptionsOps[Self <: RelationOptions] (val x: Self) extends AnyVal {
    
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
    def setCascadeVarargs(value: (insert | update | remove | `soft-remove` | recover)*): Self = this.set("cascade", js.Array(value :_*))
    
    @scala.inline
    def setCascade(value: Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])): Self = this.set("cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    
    @scala.inline
    def setDeferrable(value: DeferrableType): Self = this.set("deferrable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferrable: Self = this.set("deferrable", js.undefined)
    
    @scala.inline
    def setEager(value: Boolean): Self = this.set("eager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEager: Self = this.set("eager", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    
    @scala.inline
    def setOnDelete(value: OnDeleteType): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: OnUpdateType): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPersistence(value: Boolean): Self = this.set("persistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistence: Self = this.set("persistence", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
  }
}
