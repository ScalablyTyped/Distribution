package typings.typeorm

import typings.typeorm.optionsJoinColumnOptionsMod.JoinColumnOptions
import typings.typeorm.optionsJoinTableMultipleColumnsOptionsMod.JoinTableMultipleColumnsOptions
import typings.typeorm.optionsJoinTableOptionsMod.JoinTableOptions
import typings.typeorm.typeormStrings.`soft-remove`
import typings.typeorm.typeormStrings.insert
import typings.typeorm.typeormStrings.recover
import typings.typeorm.typeormStrings.remove
import typings.typeorm.typeormStrings.update
import typings.typeorm.typesDeferrableTypeMod.DeferrableType
import typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
import typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
import typings.typeorm.typesRelationTypesMod.RelationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaEntitySchemaRelationOptionsMod {
  
  trait EntitySchemaRelationOptions extends StObject {
    
    /**
      * Default database value.
      */
    var default: js.UndefOr[js.Any] = js.undefined
    
    /**
      * If set to true then it means that related object can be allowed to be inserted / updated / removed to the db.
      * This is option a shortcut if you would like to set cascadeInsert, cascadeUpdate and cascadeRemove to true.
      */
    var cascade: js.UndefOr[Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])] = js.undefined
    
    /**
      * Indicate if foreign key constraints can be deferred.
      */
    var deferrable: js.UndefOr[DeferrableType] = js.undefined
    
    /**
      * Indicates if this relation will be eagerly loaded.
      */
    var eager: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inverse side of the relation.
      */
    var inverseSide: js.UndefOr[String] = js.undefined
    
    /**
      * Join column options of this column. If set to true then it simply means that it has a join column.
      */
    var joinColumn: js.UndefOr[Boolean | JoinColumnOptions | js.Array[JoinColumnOptions]] = js.undefined
    
    /**
      * Join table options of this column. If set to true then it simply means that it has a join table.
      */
    var joinTable: js.UndefOr[Boolean | JoinTableOptions | JoinTableMultipleColumnsOptions] = js.undefined
    
    /**
      * Indicates if this relation will be lazily loaded.
      */
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if relation column value can be nullable or not.
      */
    var nullable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database cascade action on delete.
      */
    var onDelete: js.UndefOr[OnDeleteType] = js.undefined
    
    /**
      * Database cascade action on update.
      */
    var onUpdate: js.UndefOr[OnUpdateType] = js.undefined
    
    /**
      * Indicates if persistence is enabled for the relation.
      * By default its enabled, but if you want to avoid any changes in the relation to be reflected in the database you can disable it.
      * If its disabled you can only change a relation from inverse side of a relation or using relation query builder functionality.
      * This is useful for performance optimization since its disabling avoid multiple extra queries during entity save.
      */
    var persistence: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this relation will be a primary key.
      * Can be used only for many-to-one and owner one-to-one relations.
      */
    var primary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates with which entity this relation is made.
      */
    var target: js.Function | String
    
    /**
      * Indicates if this is a children (can be only one-to-many relation) relation in the tree tables.
      */
    var treeChildren: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this is a parent (can be only many-to-one relation) relation in the tree tables.
      */
    var treeParent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Type of relation. Can be one of the value of the RelationTypes class.
      */
    var `type`: RelationType
  }
  object EntitySchemaRelationOptions {
    
    inline def apply(target: js.Function | String, `type`: RelationType): EntitySchemaRelationOptions = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntitySchemaRelationOptions]
    }
    
    extension [Self <: EntitySchemaRelationOptions](x: Self) {
      
      inline def setCascade(value: Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      inline def setCascadeVarargs(value: (insert | update | remove | `soft-remove` | recover)*): Self = StObject.set(x, "cascade", js.Array(value :_*))
      
      inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDeferrable(value: DeferrableType): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      inline def setEager(value: Boolean): Self = StObject.set(x, "eager", value.asInstanceOf[js.Any])
      
      inline def setEagerUndefined: Self = StObject.set(x, "eager", js.undefined)
      
      inline def setInverseSide(value: String): Self = StObject.set(x, "inverseSide", value.asInstanceOf[js.Any])
      
      inline def setInverseSideUndefined: Self = StObject.set(x, "inverseSide", js.undefined)
      
      inline def setJoinColumn(value: Boolean | JoinColumnOptions | js.Array[JoinColumnOptions]): Self = StObject.set(x, "joinColumn", value.asInstanceOf[js.Any])
      
      inline def setJoinColumnUndefined: Self = StObject.set(x, "joinColumn", js.undefined)
      
      inline def setJoinColumnVarargs(value: JoinColumnOptions*): Self = StObject.set(x, "joinColumn", js.Array(value :_*))
      
      inline def setJoinTable(value: Boolean | JoinTableOptions | JoinTableMultipleColumnsOptions): Self = StObject.set(x, "joinTable", value.asInstanceOf[js.Any])
      
      inline def setJoinTableUndefined: Self = StObject.set(x, "joinTable", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      inline def setOnDelete(value: OnDeleteType): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnUpdate(value: OnUpdateType): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPersistence(value: Boolean): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTreeChildren(value: Boolean): Self = StObject.set(x, "treeChildren", value.asInstanceOf[js.Any])
      
      inline def setTreeChildrenUndefined: Self = StObject.set(x, "treeChildren", js.undefined)
      
      inline def setTreeParent(value: Boolean): Self = StObject.set(x, "treeParent", value.asInstanceOf[js.Any])
      
      inline def setTreeParentUndefined: Self = StObject.set(x, "treeParent", js.undefined)
      
      inline def setType(value: RelationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
