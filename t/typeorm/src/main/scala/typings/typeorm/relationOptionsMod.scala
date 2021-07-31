package typings.typeorm

import typings.typeorm.deferrableTypeMod.DeferrableType
import typings.typeorm.onDeleteTypeMod.OnDeleteType
import typings.typeorm.onUpdateTypeMod.OnUpdateType
import typings.typeorm.typeormStrings.`soft-remove`
import typings.typeorm.typeormStrings.insert
import typings.typeorm.typeormStrings.recover
import typings.typeorm.typeormStrings.remove
import typings.typeorm.typeormStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationOptionsMod {
  
  trait RelationOptions extends StObject {
    
    /**
      * Sets cascades options for the given relation.
      * If set to true then it means that related object can be allowed to be inserted or updated in the database.
      * You can separately restrict cascades to insertion or updation using following syntax:
      *
      * cascade: ["insert", "update", "remove", "soft-remove", "recover"] // include or exclude one of them
      */
    var cascade: js.UndefOr[Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])] = js.undefined
    
    /**
      * Indicate if foreign key constraints can be deferred.
      */
    var deferrable: js.UndefOr[DeferrableType] = js.undefined
    
    /**
      * Set this relation to be eager.
      * Eager relations are always loaded automatically when relation's owner entity is loaded using find* methods.
      * Only using QueryBuilder prevents loading eager relations.
      * Eager flag cannot be set from both sides of relation - you can eager load only one side of the relationship.
      */
    var eager: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set this relation to be lazy. Note: lazy relations are promises. When you call them they return promise
      * which resolve relation result then. If your property's type is Promise then this relation is set to lazy automatically.
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
  }
  object RelationOptions {
    
    @scala.inline
    def apply(): RelationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelationOptions]
    }
    
    @scala.inline
    implicit class RelationOptionsMutableBuilder[Self <: RelationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCascade(value: Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      @scala.inline
      def setCascadeVarargs(value: (insert | update | remove | `soft-remove` | recover)*): Self = StObject.set(x, "cascade", js.Array(value :_*))
      
      @scala.inline
      def setDeferrable(value: DeferrableType): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
      
      @scala.inline
      def setEager(value: Boolean): Self = StObject.set(x, "eager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEagerUndefined: Self = StObject.set(x, "eager", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      @scala.inline
      def setOnDelete(value: OnDeleteType): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: OnUpdateType): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPersistence(value: Boolean): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    }
  }
}
