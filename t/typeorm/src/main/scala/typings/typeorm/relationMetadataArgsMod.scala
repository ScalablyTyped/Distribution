package typings.typeorm

import typings.typeorm.propertyTypeInFunctionMod.PropertyTypeFactory
import typings.typeorm.relationOptionsMod.RelationOptions
import typings.typeorm.relationTypeInFunctionMod.RelationTypeInFunction
import typings.typeorm.relationTypesMod.RelationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationMetadataArgsMod {
  
  trait RelationMetadataArgs extends StObject {
    
    /**
      * Inverse side of the relation.
      */
    val inverseSideProperty: js.UndefOr[PropertyTypeFactory[js.Any]] = js.undefined
    
    /**
      * Indicates if this relation will be lazily loaded.
      */
    val isLazy: Boolean
    
    /**
      * Indicates if this is a children (can be only one-to-many relation) relation in the tree tables.
      */
    val isTreeChildren: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this is a parent (can be only many-to-one relation) relation in the tree tables.
      */
    val isTreeParent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional relation options.
      */
    val options: RelationOptions
    
    /**
      * In the case if this relation is without a target, targetId must be specified.
      * This is used for entity schemas without classes.
      */
    /**
      * Class's property name to which this relation is applied.
      */
    val propertyName: String
    
    /**
      * Original (reflected) class's property type.
      *
      * todo: this can be empty for relations from entity schemas.
      */
    /**
      * Type of relation. Can be one of the value of the RelationTypes class.
      */
    val relationType: RelationType
    
    /**
      * Class to which this relation is applied.
      */
    val target: js.Function | String
    
    /**
      * Type of the relation. This type is in function because of language specifics and problems with recursive
      * referenced classes.
      */
    val `type`: RelationTypeInFunction
  }
  object RelationMetadataArgs {
    
    @scala.inline
    def apply(
      isLazy: Boolean,
      options: RelationOptions,
      propertyName: String,
      relationType: RelationType,
      target: js.Function | String,
      `type`: RelationTypeInFunction
    ): RelationMetadataArgs = {
      val __obj = js.Dynamic.literal(isLazy = isLazy.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], relationType = relationType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelationMetadataArgs]
    }
    
    @scala.inline
    implicit class RelationMetadataArgsMutableBuilder[Self <: RelationMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInverseSideProperty(value: PropertyTypeFactory[js.Any]): Self = StObject.set(x, "inverseSideProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseSidePropertyFunction1(value: js.Any => String | js.Any): Self = StObject.set(x, "inverseSideProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInverseSidePropertyUndefined: Self = StObject.set(x, "inverseSideProperty", js.undefined)
      
      @scala.inline
      def setIsLazy(value: Boolean): Self = StObject.set(x, "isLazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTreeChildren(value: Boolean): Self = StObject.set(x, "isTreeChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTreeChildrenUndefined: Self = StObject.set(x, "isTreeChildren", js.undefined)
      
      @scala.inline
      def setIsTreeParent(value: Boolean): Self = StObject.set(x, "isTreeParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTreeParentUndefined: Self = StObject.set(x, "isTreeParent", js.undefined)
      
      @scala.inline
      def setOptions(value: RelationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationType(value: RelationType): Self = StObject.set(x, "relationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: RelationTypeInFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction1(value: /* type */ js.UndefOr[js.Any] => js.Function): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    }
  }
}
