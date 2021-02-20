package typings.typeorm

import typings.typeorm.anon.PartialRelationCountAttriAlias
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationCountRelationCountAttributeMod {
  
  @JSImport("typeorm/query-builder/relation-count/RelationCountAttribute", "RelationCountAttribute")
  @js.native
  class RelationCountAttribute protected () extends StObject {
    def this(expressionMap: QueryExpressionMap) = this()
    def this(expressionMap: QueryExpressionMap, relationCountAttribute: PartialRelationCountAttriAlias) = this()
    
    /**
      * Alias of the joined (destination) table.
      */
    var alias: js.UndefOr[String] = js.native
    
    var expressionMap: js.Any = js.native
    
    val joinInverseSideMetadata: EntityMetadata = js.native
    
    val junctionAlias: String = js.native
    
    /**
      * Property + alias of the object where to joined data should be mapped.
      */
    var mapToProperty: String = js.native
    
    val mapToPropertyPropertyName: String = js.native
    
    /**
      * Metadata of the joined entity.
      * If table without entity was joined, then it will return undefined.
      */
    val metadata: EntityMetadata = js.native
    
    /**
      * Alias of the parent of this join.
      * For example, if we join ("post.category", "categoryAlias") then "post" is a parent alias.
      * This value is extracted from entityOrProperty value.
      * This is available when join was made using "post.category" syntax.
      */
    val parentAlias: String = js.native
    
    /**
      * Extra condition applied to "ON" section of join.
      */
    var queryBuilderFactory: js.UndefOr[js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]] = js.native
    
    /**
      * Relation of the parent.
      * This is used to understand what is joined.
      * This is available when join was made using "post.category" syntax.
      */
    val relation: RelationMetadata = js.native
    
    /**
      * Name of relation.
      */
    var relationName: String = js.native
    
    /**
      * Relation property name of the parent.
      * This is used to understand what is joined.
      * For example, if we join ("post.category", "categoryAlias") then "category" is a relation property.
      * This value is extracted from entityOrProperty value.
      * This is available when join was made using "post.category" syntax.
      */
    val relationProperty: js.UndefOr[String] = js.native
  }
}
