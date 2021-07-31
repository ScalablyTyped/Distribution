package typings.typeorm

import typings.typeorm.selectQueryBuilderMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationIdMetadataArgsMod {
  
  trait RelationIdMetadataArgs extends StObject {
    
    /**
      * Alias of the joined (destination) table.
      */
    val alias: js.UndefOr[String] = js.undefined
    
    /**
      * Class's property name to which this decorator is applied.
      */
    val propertyName: String
    
    /**
      * Extra condition applied to "ON" section of join.
      */
    val queryBuilderFactory: js.UndefOr[js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]] = js.undefined
    
    /**
      * Target's relation which it should count.
      */
    val relation: String | (js.Function1[/* object */ js.Any, js.Any])
    
    /**
      * Class to which this decorator is applied.
      */
    val target: js.Function
  }
  object RelationIdMetadataArgs {
    
    @scala.inline
    def apply(
      propertyName: String,
      relation: String | (js.Function1[/* object */ js.Any, js.Any]),
      target: js.Function
    ): RelationIdMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelationIdMetadataArgs]
    }
    
    @scala.inline
    implicit class RelationIdMetadataArgsMutableBuilder[Self <: RelationIdMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryBuilderFactory(value: /* qb */ SelectQueryBuilder[js.Any] => SelectQueryBuilder[js.Any]): Self = StObject.set(x, "queryBuilderFactory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryBuilderFactoryUndefined: Self = StObject.set(x, "queryBuilderFactory", js.undefined)
      
      @scala.inline
      def setRelation(value: String | (js.Function1[/* object */ js.Any, js.Any])): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationFunction1(value: /* object */ js.Any => js.Any): Self = StObject.set(x, "relation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
