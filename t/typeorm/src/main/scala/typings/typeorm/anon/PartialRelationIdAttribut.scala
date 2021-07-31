package typings.typeorm.anon

import typings.std.Partial
import typings.typeorm.queryExpressionMapMod.QueryExpressionMap
import typings.typeorm.relationIdAttributeMod.RelationIdAttribute
import typings.typeorm.relationMetadataMod.RelationMetadata
import typings.typeorm.selectQueryBuilderMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typeorm.typeorm/browser/query-builder/relation-id/RelationIdAttribute.RelationIdAttribute> */
trait PartialRelationIdAttribut extends StObject {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var constructor: js.UndefOr[
    js.Function2[
      /* queryExpressionMap */ QueryExpressionMap, 
      /* relationIdAttribute */ js.UndefOr[Partial[RelationIdAttribute]], 
      js.Any
    ]
  ] = js.undefined
  
  var disableMixedMap: js.UndefOr[Boolean] = js.undefined
  
  var joinInverseSideMetadata: js.UndefOr[typings.typeorm.entityMetadataMod.EntityMetadata] = js.undefined
  
  var junctionAlias: js.UndefOr[String] = js.undefined
  
  var junctionMetadata: js.UndefOr[typings.typeorm.entityMetadataMod.EntityMetadata] = js.undefined
  
  var mapToProperty: js.UndefOr[String] = js.undefined
  
  var mapToPropertyParentAlias: js.UndefOr[String] = js.undefined
  
  var mapToPropertyPropertyPath: js.UndefOr[String] = js.undefined
  
  var parentAlias: js.UndefOr[String] = js.undefined
  
  var queryBuilderFactory: js.UndefOr[js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]] = js.undefined
  
  var queryExpressionMap: js.UndefOr[js.Any] = js.undefined
  
  var relation: js.UndefOr[RelationMetadata] = js.undefined
  
  var relationName: js.UndefOr[String] = js.undefined
  
  var relationPropertyPath: js.UndefOr[String] = js.undefined
}
object PartialRelationIdAttribut {
  
  @scala.inline
  def apply(): PartialRelationIdAttribut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRelationIdAttribut]
  }
  
  @scala.inline
  implicit class PartialRelationIdAttributMutableBuilder[Self <: PartialRelationIdAttribut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setConstructor(
      value: (/* queryExpressionMap */ QueryExpressionMap, /* relationIdAttribute */ js.UndefOr[Partial[RelationIdAttribute]]) => js.Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    @scala.inline
    def setDisableMixedMap(value: Boolean): Self = StObject.set(x, "disableMixedMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMixedMapUndefined: Self = StObject.set(x, "disableMixedMap", js.undefined)
    
    @scala.inline
    def setJoinInverseSideMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "joinInverseSideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinInverseSideMetadataUndefined: Self = StObject.set(x, "joinInverseSideMetadata", js.undefined)
    
    @scala.inline
    def setJunctionAlias(value: String): Self = StObject.set(x, "junctionAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJunctionAliasUndefined: Self = StObject.set(x, "junctionAlias", js.undefined)
    
    @scala.inline
    def setJunctionMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "junctionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJunctionMetadataUndefined: Self = StObject.set(x, "junctionMetadata", js.undefined)
    
    @scala.inline
    def setMapToProperty(value: String): Self = StObject.set(x, "mapToProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapToPropertyParentAlias(value: String): Self = StObject.set(x, "mapToPropertyParentAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapToPropertyParentAliasUndefined: Self = StObject.set(x, "mapToPropertyParentAlias", js.undefined)
    
    @scala.inline
    def setMapToPropertyPropertyPath(value: String): Self = StObject.set(x, "mapToPropertyPropertyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapToPropertyPropertyPathUndefined: Self = StObject.set(x, "mapToPropertyPropertyPath", js.undefined)
    
    @scala.inline
    def setMapToPropertyUndefined: Self = StObject.set(x, "mapToProperty", js.undefined)
    
    @scala.inline
    def setParentAlias(value: String): Self = StObject.set(x, "parentAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentAliasUndefined: Self = StObject.set(x, "parentAlias", js.undefined)
    
    @scala.inline
    def setQueryBuilderFactory(value: /* qb */ SelectQueryBuilder[js.Any] => SelectQueryBuilder[js.Any]): Self = StObject.set(x, "queryBuilderFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryBuilderFactoryUndefined: Self = StObject.set(x, "queryBuilderFactory", js.undefined)
    
    @scala.inline
    def setQueryExpressionMap(value: js.Any): Self = StObject.set(x, "queryExpressionMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryExpressionMapUndefined: Self = StObject.set(x, "queryExpressionMap", js.undefined)
    
    @scala.inline
    def setRelation(value: RelationMetadata): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationName(value: String): Self = StObject.set(x, "relationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationNameUndefined: Self = StObject.set(x, "relationName", js.undefined)
    
    @scala.inline
    def setRelationPropertyPath(value: String): Self = StObject.set(x, "relationPropertyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationPropertyPathUndefined: Self = StObject.set(x, "relationPropertyPath", js.undefined)
    
    @scala.inline
    def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
  }
}
