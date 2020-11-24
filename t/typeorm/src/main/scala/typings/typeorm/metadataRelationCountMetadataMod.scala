package typings.typeorm

import typings.typeorm.anon.ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/metadata/RelationCountMetadata", JSImport.Namespace)
@js.native
object metadataRelationCountMetadataMod extends js.Object {
  
  @js.native
  class RelationCountMetadata protected () extends js.Object {
    def this(options: ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata) = this()
    
    /**
      * Alias of the joined (destination) table.
      */
    var alias: js.UndefOr[String] = js.native
    
    /**
      * Builds some depend relation count metadata properties.
      * This builder method should be used only after entity metadata, its properties map and all relations are build.
      */
    def build(): Unit = js.native
    
    /**
      * Entity metadata where this column metadata is.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * Target's property name to which this metadata is applied.
      */
    var propertyName: String = js.native
    
    /**
      * Extra condition applied to "ON" section of join.
      */
    var queryBuilderFactory: js.UndefOr[js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]] = js.native
    
    /**
      * Relation which needs to be counted.
      */
    var relation: RelationMetadata = js.native
    
    /**
      * Relation name which need to count.
      */
    var relationNameOrFactory: String | (js.Function1[/* object */ js.Any, _]) = js.native
    
    /**
      * Target class to which metadata is applied.
      */
    var target: js.Function | String = js.native
  }
}
