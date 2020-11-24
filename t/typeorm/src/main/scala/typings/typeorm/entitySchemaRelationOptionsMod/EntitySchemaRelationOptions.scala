package typings.typeorm.entitySchemaRelationOptionsMod

import typings.typeorm.deferrableTypeMod.DeferrableType
import typings.typeorm.joinColumnOptionsMod.JoinColumnOptions
import typings.typeorm.joinTableMultipleColumnsOptionsMod.JoinTableMultipleColumnsOptions
import typings.typeorm.joinTableOptionsMod.JoinTableOptions
import typings.typeorm.onDeleteTypeMod.OnDeleteType
import typings.typeorm.onUpdateTypeMod.OnUpdateType
import typings.typeorm.relationTypesMod.RelationType
import typings.typeorm.typeormStrings.`soft-remove`
import typings.typeorm.typeormStrings.insert
import typings.typeorm.typeormStrings.recover
import typings.typeorm.typeormStrings.remove
import typings.typeorm.typeormStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitySchemaRelationOptions extends js.Object {
  
  /**
    * If set to true then it means that related object can be allowed to be inserted / updated / removed to the db.
    * This is option a shortcut if you would like to set cascadeInsert, cascadeUpdate and cascadeRemove to true.
    */
  var cascade: js.UndefOr[Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])] = js.native
  
  /**
    * Default database value.
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicate if foreign key constraints can be deferred.
    */
  var deferrable: js.UndefOr[DeferrableType] = js.native
  
  /**
    * Indicates if this relation will be eagerly loaded.
    */
  var eager: js.UndefOr[Boolean] = js.native
  
  /**
    * Inverse side of the relation.
    */
  var inverseSide: js.UndefOr[String] = js.native
  
  /**
    * Join column options of this column. If set to true then it simply means that it has a join column.
    */
  var joinColumn: js.UndefOr[Boolean | JoinColumnOptions | js.Array[JoinColumnOptions]] = js.native
  
  /**
    * Join table options of this column. If set to true then it simply means that it has a join table.
    */
  var joinTable: js.UndefOr[Boolean | JoinTableOptions | JoinTableMultipleColumnsOptions] = js.native
  
  /**
    * Indicates if this relation will be lazily loaded.
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
  
  /**
    * Indicates with which entity this relation is made.
    */
  var target: js.Function | String = js.native
  
  /**
    * Indicates if this is a children (can be only one-to-many relation) relation in the tree tables.
    */
  var treeChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if this is a parent (can be only many-to-one relation) relation in the tree tables.
    */
  var treeParent: js.UndefOr[Boolean] = js.native
  
  /**
    * Type of relation. Can be one of the value of the RelationTypes class.
    */
  var `type`: RelationType = js.native
}
object EntitySchemaRelationOptions {
  
  @scala.inline
  def apply(target: js.Function | String, `type`: RelationType): EntitySchemaRelationOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySchemaRelationOptions]
  }
  
  @scala.inline
  implicit class EntitySchemaRelationOptionsOps[Self <: EntitySchemaRelationOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: RelationType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeVarargs(value: (insert | update | remove | `soft-remove` | recover)*): Self = this.set("cascade", js.Array(value :_*))
    
    @scala.inline
    def setCascade(value: Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])): Self = this.set("cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDeferrable(value: DeferrableType): Self = this.set("deferrable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferrable: Self = this.set("deferrable", js.undefined)
    
    @scala.inline
    def setEager(value: Boolean): Self = this.set("eager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEager: Self = this.set("eager", js.undefined)
    
    @scala.inline
    def setInverseSide(value: String): Self = this.set("inverseSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverseSide: Self = this.set("inverseSide", js.undefined)
    
    @scala.inline
    def setJoinColumnVarargs(value: JoinColumnOptions*): Self = this.set("joinColumn", js.Array(value :_*))
    
    @scala.inline
    def setJoinColumn(value: Boolean | JoinColumnOptions | js.Array[JoinColumnOptions]): Self = this.set("joinColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinColumn: Self = this.set("joinColumn", js.undefined)
    
    @scala.inline
    def setJoinTable(value: Boolean | JoinTableOptions | JoinTableMultipleColumnsOptions): Self = this.set("joinTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinTable: Self = this.set("joinTable", js.undefined)
    
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
    
    @scala.inline
    def setTreeChildren(value: Boolean): Self = this.set("treeChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeChildren: Self = this.set("treeChildren", js.undefined)
    
    @scala.inline
    def setTreeParent(value: Boolean): Self = this.set("treeParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeParent: Self = this.set("treeParent", js.undefined)
  }
}
