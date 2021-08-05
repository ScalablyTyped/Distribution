package typings.typeorm.anon

import typings.std.Partial
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import typings.typeorm.relationCountRelationCountAttributeMod.RelationCountAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typeorm.typeorm/query-builder/relation-count/RelationCountAttribute.RelationCountAttribute> */
trait PartialRelationCountAttriAlias extends StObject {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var constructor: js.UndefOr[
    js.Function2[
      /* expressionMap */ QueryExpressionMap, 
      /* relationCountAttribute */ js.UndefOr[Partial[RelationCountAttribute]], 
      js.Any
    ]
  ] = js.undefined
  
  var expressionMap: js.UndefOr[js.Any] = js.undefined
  
  var joinInverseSideMetadata: js.UndefOr[typings.typeorm.metadataEntityMetadataMod.EntityMetadata] = js.undefined
  
  var junctionAlias: js.UndefOr[String] = js.undefined
  
  var mapToProperty: js.UndefOr[String] = js.undefined
  
  var mapToPropertyPropertyName: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[typings.typeorm.metadataEntityMetadataMod.EntityMetadata] = js.undefined
  
  var parentAlias: js.UndefOr[String] = js.undefined
  
  var queryBuilderFactory: js.UndefOr[js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]] = js.undefined
  
  var relation: js.UndefOr[RelationMetadata] = js.undefined
  
  var relationName: js.UndefOr[String] = js.undefined
  
  var relationProperty: js.UndefOr[String] = js.undefined
}
object PartialRelationCountAttriAlias {
  
  inline def apply(): PartialRelationCountAttriAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRelationCountAttriAlias]
  }
  
  extension [Self <: PartialRelationCountAttriAlias](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setConstructor(
      value: (/* expressionMap */ QueryExpressionMap, /* relationCountAttribute */ js.UndefOr[Partial[RelationCountAttribute]]) => js.Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setExpressionMap(value: js.Any): Self = StObject.set(x, "expressionMap", value.asInstanceOf[js.Any])
    
    inline def setExpressionMapUndefined: Self = StObject.set(x, "expressionMap", js.undefined)
    
    inline def setJoinInverseSideMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "joinInverseSideMetadata", value.asInstanceOf[js.Any])
    
    inline def setJoinInverseSideMetadataUndefined: Self = StObject.set(x, "joinInverseSideMetadata", js.undefined)
    
    inline def setJunctionAlias(value: String): Self = StObject.set(x, "junctionAlias", value.asInstanceOf[js.Any])
    
    inline def setJunctionAliasUndefined: Self = StObject.set(x, "junctionAlias", js.undefined)
    
    inline def setMapToProperty(value: String): Self = StObject.set(x, "mapToProperty", value.asInstanceOf[js.Any])
    
    inline def setMapToPropertyPropertyName(value: String): Self = StObject.set(x, "mapToPropertyPropertyName", value.asInstanceOf[js.Any])
    
    inline def setMapToPropertyPropertyNameUndefined: Self = StObject.set(x, "mapToPropertyPropertyName", js.undefined)
    
    inline def setMapToPropertyUndefined: Self = StObject.set(x, "mapToProperty", js.undefined)
    
    inline def setMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setParentAlias(value: String): Self = StObject.set(x, "parentAlias", value.asInstanceOf[js.Any])
    
    inline def setParentAliasUndefined: Self = StObject.set(x, "parentAlias", js.undefined)
    
    inline def setQueryBuilderFactory(value: /* qb */ SelectQueryBuilder[js.Any] => SelectQueryBuilder[js.Any]): Self = StObject.set(x, "queryBuilderFactory", js.Any.fromFunction1(value))
    
    inline def setQueryBuilderFactoryUndefined: Self = StObject.set(x, "queryBuilderFactory", js.undefined)
    
    inline def setRelation(value: RelationMetadata): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setRelationName(value: String): Self = StObject.set(x, "relationName", value.asInstanceOf[js.Any])
    
    inline def setRelationNameUndefined: Self = StObject.set(x, "relationName", js.undefined)
    
    inline def setRelationProperty(value: String): Self = StObject.set(x, "relationProperty", value.asInstanceOf[js.Any])
    
    inline def setRelationPropertyUndefined: Self = StObject.set(x, "relationProperty", js.undefined)
    
    inline def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
  }
}
