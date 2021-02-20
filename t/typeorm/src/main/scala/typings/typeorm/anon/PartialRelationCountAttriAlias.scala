package typings.typeorm.anon

import typings.std.Partial
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import typings.typeorm.relationCountRelationCountAttributeMod.RelationCountAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typeorm.typeorm/query-builder/relation-count/RelationCountAttribute.RelationCountAttribute> */
@js.native
trait PartialRelationCountAttriAlias extends StObject {
  
  var alias: js.UndefOr[String] = js.native
  
  var constructor: js.UndefOr[
    js.Function2[
      /* expressionMap */ QueryExpressionMap, 
      /* relationCountAttribute */ js.UndefOr[Partial[RelationCountAttribute]], 
      js.Any
    ]
  ] = js.native
  
  var expressionMap: js.UndefOr[js.Any] = js.native
  
  var joinInverseSideMetadata: js.UndefOr[typings.typeorm.metadataEntityMetadataMod.EntityMetadata] = js.native
  
  var junctionAlias: js.UndefOr[String] = js.native
  
  var mapToProperty: js.UndefOr[String] = js.native
  
  var mapToPropertyPropertyName: js.UndefOr[String] = js.native
  
  var metadata: js.UndefOr[typings.typeorm.metadataEntityMetadataMod.EntityMetadata] = js.native
  
  var parentAlias: js.UndefOr[String] = js.native
  
  var queryBuilderFactory: js.UndefOr[js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]] = js.native
  
  var relation: js.UndefOr[RelationMetadata] = js.native
  
  var relationName: js.UndefOr[String] = js.native
  
  var relationProperty: js.UndefOr[String] = js.native
}
object PartialRelationCountAttriAlias {
  
  @scala.inline
  def apply(): PartialRelationCountAttriAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRelationCountAttriAlias]
  }
  
  @scala.inline
  implicit class PartialRelationCountAttriAliasMutableBuilder[Self <: PartialRelationCountAttriAlias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setConstructor(
      value: (/* expressionMap */ QueryExpressionMap, /* relationCountAttribute */ js.UndefOr[Partial[RelationCountAttribute]]) => js.Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    @scala.inline
    def setExpressionMap(value: js.Any): Self = StObject.set(x, "expressionMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionMapUndefined: Self = StObject.set(x, "expressionMap", js.undefined)
    
    @scala.inline
    def setJoinInverseSideMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "joinInverseSideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinInverseSideMetadataUndefined: Self = StObject.set(x, "joinInverseSideMetadata", js.undefined)
    
    @scala.inline
    def setJunctionAlias(value: String): Self = StObject.set(x, "junctionAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJunctionAliasUndefined: Self = StObject.set(x, "junctionAlias", js.undefined)
    
    @scala.inline
    def setMapToProperty(value: String): Self = StObject.set(x, "mapToProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapToPropertyPropertyName(value: String): Self = StObject.set(x, "mapToPropertyPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapToPropertyPropertyNameUndefined: Self = StObject.set(x, "mapToPropertyPropertyName", js.undefined)
    
    @scala.inline
    def setMapToPropertyUndefined: Self = StObject.set(x, "mapToProperty", js.undefined)
    
    @scala.inline
    def setMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setParentAlias(value: String): Self = StObject.set(x, "parentAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentAliasUndefined: Self = StObject.set(x, "parentAlias", js.undefined)
    
    @scala.inline
    def setQueryBuilderFactory(value: /* qb */ SelectQueryBuilder[_] => SelectQueryBuilder[_]): Self = StObject.set(x, "queryBuilderFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryBuilderFactoryUndefined: Self = StObject.set(x, "queryBuilderFactory", js.undefined)
    
    @scala.inline
    def setRelation(value: RelationMetadata): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationName(value: String): Self = StObject.set(x, "relationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationNameUndefined: Self = StObject.set(x, "relationName", js.undefined)
    
    @scala.inline
    def setRelationProperty(value: String): Self = StObject.set(x, "relationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationPropertyUndefined: Self = StObject.set(x, "relationProperty", js.undefined)
    
    @scala.inline
    def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
  }
}
