package typings.typeorm

import typings.typeorm.aliasMod.Alias
import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.queryExpressionMapMod.QueryExpressionMap
import typings.typeorm.relationMetadataMod.RelationMetadata
import typings.typeorm.typeormStrings.INNER
import typings.typeorm.typeormStrings.LEFT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinAttributeMod {
  
  @JSImport("typeorm/browser/query-builder/JoinAttribute", "JoinAttribute")
  @js.native
  class JoinAttribute protected () extends StObject {
    def this(connection: Connection, queryExpressionMap: QueryExpressionMap) = this()
    def this(connection: Connection, queryExpressionMap: QueryExpressionMap, joinAttribute: JoinAttribute) = this()
    
    /**
      * Alias of the joined (destination) table.
      */
    var alias: Alias = js.native
    
    /**
      * Extra condition applied to "ON" section of join.
      */
    var condition: js.UndefOr[String] = js.native
    
    var connection: js.Any = js.native
    
    /**
      * Join direction.
      */
    var direction: LEFT | INNER = js.native
    
    /**
      * Joined table, entity target, or relation in "post.category" format.
      */
    var entityOrProperty: js.Function | String = js.native
    
    val isMany: Boolean = js.native
    
    /**
      * Indicates if user maps one or many objects from the join.
      */
    var isMappingMany: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if this join is selected.
      */
    val isSelected: Boolean = js.native
    
    var isSelectedCache: Boolean = js.native
    
    var isSelectedEvaluated: Boolean = js.native
    
    /**
      * Generates alias of junction table, whose ids we get.
      */
    val junctionAlias: String = js.native
    
    /**
      * Property + alias of the object where to joined data should be mapped.
      */
    var mapToProperty: js.UndefOr[String] = js.native
    
    val mapToPropertyParentAlias: js.UndefOr[String] = js.native
    
    val mapToPropertyPropertyName: js.UndefOr[String] = js.native
    
    /**
      * Metadata of the joined entity.
      * If table without entity was joined, then it will return undefined.
      */
    val metadata: js.UndefOr[EntityMetadata] = js.native
    
    /**
      * Alias of the parent of this join.
      * For example, if we join ("post.category", "categoryAlias") then "post" is a parent alias.
      * This value is extracted from entityOrProperty value.
      * This is available when join was made using "post.category" syntax.
      */
    val parentAlias: js.UndefOr[String] = js.native
    
    var queryExpressionMap: js.Any = js.native
    
    /**
      * Relation of the parent.
      * This is used to understand what is joined.
      * This is available when join was made using "post.category" syntax.
      * Relation can be undefined if entityOrProperty is regular entity or custom table.
      */
    val relation: js.UndefOr[RelationMetadata] = js.native
    
    var relationCache: js.UndefOr[RelationMetadata] = js.native
    
    var relationEvaluated: Boolean = js.native
    
    /**
      * Relation property name of the parent.
      * This is used to understand what is joined.
      * For example, if we join ("post.category", "categoryAlias") then "category" is a relation property.
      * This value is extracted from entityOrProperty value.
      * This is available when join was made using "post.category" syntax.
      */
    val relationPropertyPath: js.UndefOr[String] = js.native
    
    /**
      * Name of the table which we should join.
      */
    val tablePath: String = js.native
  }
}
