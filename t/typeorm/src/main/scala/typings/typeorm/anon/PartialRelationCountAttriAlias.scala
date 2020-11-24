package typings.typeorm.anon

import typings.std.Partial
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import typings.typeorm.relationCountRelationCountAttributeMod.RelationCountAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typeorm.typeorm/query-builder/relation-count/RelationCountAttribute.RelationCountAttribute> */
@js.native
trait PartialRelationCountAttriAlias extends js.Object {
  
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
  implicit class PartialRelationCountAttriAliasOps[Self <: PartialRelationCountAttriAlias] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setConstructor(
      value: (/* expressionMap */ QueryExpressionMap, /* relationCountAttribute */ js.UndefOr[Partial[RelationCountAttribute]]) => js.Any
    ): Self = this.set("constructor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    
    @scala.inline
    def setExpressionMap(value: js.Any): Self = this.set("expressionMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionMap: Self = this.set("expressionMap", js.undefined)
    
    @scala.inline
    def setJoinInverseSideMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = this.set("joinInverseSideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinInverseSideMetadata: Self = this.set("joinInverseSideMetadata", js.undefined)
    
    @scala.inline
    def setJunctionAlias(value: String): Self = this.set("junctionAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJunctionAlias: Self = this.set("junctionAlias", js.undefined)
    
    @scala.inline
    def setMapToProperty(value: String): Self = this.set("mapToProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapToProperty: Self = this.set("mapToProperty", js.undefined)
    
    @scala.inline
    def setMapToPropertyPropertyName(value: String): Self = this.set("mapToPropertyPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapToPropertyPropertyName: Self = this.set("mapToPropertyPropertyName", js.undefined)
    
    @scala.inline
    def setMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setParentAlias(value: String): Self = this.set("parentAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentAlias: Self = this.set("parentAlias", js.undefined)
    
    @scala.inline
    def setQueryBuilderFactory(value: /* qb */ SelectQueryBuilder[_] => SelectQueryBuilder[_]): Self = this.set("queryBuilderFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteQueryBuilderFactory: Self = this.set("queryBuilderFactory", js.undefined)
    
    @scala.inline
    def setRelation(value: RelationMetadata): Self = this.set("relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelation: Self = this.set("relation", js.undefined)
    
    @scala.inline
    def setRelationName(value: String): Self = this.set("relationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationName: Self = this.set("relationName", js.undefined)
    
    @scala.inline
    def setRelationProperty(value: String): Self = this.set("relationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationProperty: Self = this.set("relationProperty", js.undefined)
  }
}
