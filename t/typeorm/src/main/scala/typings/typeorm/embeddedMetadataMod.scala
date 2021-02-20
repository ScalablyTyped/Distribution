package typings.typeorm

import typings.typeorm.anon.ArgsEntityMetadata
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityListenerMetadataMod.EntityListenerMetadata
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.indexMetadataMod.IndexMetadata
import typings.typeorm.relationCountMetadataMod.RelationCountMetadata
import typings.typeorm.relationIdMetadataMod.RelationIdMetadata
import typings.typeorm.relationMetadataMod.RelationMetadata
import typings.typeorm.uniqueMetadataMod.UniqueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embeddedMetadataMod {
  
  @JSImport("typeorm/browser/metadata/EmbeddedMetadata", "EmbeddedMetadata")
  @js.native
  class EmbeddedMetadata protected () extends StObject {
    def this(options: ArgsEntityMetadata) = this()
    
    def build(connection: Connection): this.type = js.native
    
    /* protected */ def buildColumnsFromTree(): js.Array[ColumnMetadata] = js.native
    
    /* protected */ def buildEmbeddedMetadataTree(): js.Array[EmbeddedMetadata] = js.native
    
    /* protected */ def buildIndicesFromTree(): js.Array[IndexMetadata] = js.native
    
    /* protected */ def buildListenersFromTree(): js.Array[EntityListenerMetadata] = js.native
    
    /* protected */ def buildParentPrefixes(): js.Array[String] = js.native
    
    /* protected */ def buildParentPropertyNames(): js.Array[String] = js.native
    
    /* protected */ def buildPartialPrefix(): js.Array[String] = js.native
    
    /* protected */ def buildPrefix(connection: Connection): String = js.native
    
    /* protected */ def buildRelationCountsFromTree(): js.Array[RelationCountMetadata] = js.native
    
    /* protected */ def buildRelationIdsFromTree(): js.Array[RelationIdMetadata] = js.native
    
    /* protected */ def buildRelationsFromTree(): js.Array[RelationMetadata] = js.native
    
    /* protected */ def buildUniquesFromTree(): js.Array[UniqueMetadata] = js.native
    
    /**
      * Columns inside this embed.
      */
    var columns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Embed metadatas from all levels of the parent tree.
      *
      * example: post[data][information][counters].id where "data", "information" and "counters" are embeds
      * this method will return [embed metadata of data, embed metadata of information, embed metadata of counters]
      */
    var columnsFromTree: js.Array[ColumnMetadata] = js.native
    
    /**
      * Creates a new embedded object.
      */
    def create(): js.Any = js.native
    
    /**
      * Prefix of the embedded, used instead of propertyName.
      * If set to empty string or false, then prefix is not set at all.
      */
    var customPrefix: js.UndefOr[String | Boolean] = js.native
    
    /**
      * Returns embed metadatas from all levels of the parent tree.
      *
      * example: post[data][information][counters].id where "data", "information" and "counters" are embeds
      * this method will return [embed metadata of data, embed metadata of information, embed metadata of counters]
      */
    var embeddedMetadataTree: js.Array[EmbeddedMetadata] = js.native
    
    /**
      * Nested embeddable in this embeddable (which has current embedded as parent embedded).
      */
    var embeddeds: js.Array[EmbeddedMetadata] = js.native
    
    /**
      * Entity metadata where this embedded is.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * Indices applied to the embed columns.
      */
    var indices: js.Array[IndexMetadata] = js.native
    
    /**
      * Indices of this embed and all indices from its child embeds.
      */
    var indicesFromTree: js.Array[IndexMetadata] = js.native
    
    /**
      * Indicates if this embedded is in array mode.
      *
      * This option works only in mongodb.
      */
    var isArray: Boolean = js.native
    
    /**
      * Entity listeners inside this embed.
      */
    var listeners: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * Relations of this embed and all relations from its child embeds.
      */
    var listenersFromTree: js.Array[EntityListenerMetadata] = js.native
    
    /**
      * Parent embedded in the case if this embedded inside other embedded.
      */
    var parentEmbeddedMetadata: js.UndefOr[EmbeddedMetadata] = js.native
    
    /**
      * Returns array of prefixes of current embed and all its parent embeds.
      */
    var parentPrefixes: js.Array[String] = js.native
    
    /**
      * Returns array of property names of current embed and all its parent embeds.
      *
      * example: post[data][information][counters].id where "data", "information" and "counters" are embeds
      * we need to get value of "id" column from the post real entity object.
      * this method will return ["data", "information", "counters"]
      */
    var parentPropertyNames: js.Array[String] = js.native
    
    /**
      * Gets the prefix of the columns.
      * By default its a property name of the class where this prefix is.
      * But if custom prefix is set then it takes its value as a prefix.
      * However if custom prefix is set to empty string or false, then prefix to column is not applied at all.
      */
    var prefix: String = js.native
    
    /**
      * Property name on which this embedded is attached.
      */
    var propertyName: String = js.native
    
    /**
      * Gets full path to this embedded property (including embedded property name).
      * Full path is relevant when embedded is used inside other embeds (one or multiple nested).
      * For example it will return "counters.subcounters".
      */
    var propertyPath: String = js.native
    
    /**
      * Relation counts inside this embed.
      */
    var relationCounts: js.Array[RelationCountMetadata] = js.native
    
    /**
      * Relation counts of this embed and all relation counts from its child embeds.
      */
    var relationCountsFromTree: js.Array[RelationCountMetadata] = js.native
    
    /**
      * Relation ids inside this embed.
      */
    var relationIds: js.Array[RelationIdMetadata] = js.native
    
    /**
      * Relation ids of this embed and all relation ids from its child embeds.
      */
    var relationIdsFromTree: js.Array[RelationIdMetadata] = js.native
    
    /**
      * Relations inside this embed.
      */
    var relations: js.Array[RelationMetadata] = js.native
    
    /**
      * Relations of this embed and all relations from its child embeds.
      */
    var relationsFromTree: js.Array[RelationMetadata] = js.native
    
    /**
      * Embedded target type.
      */
    var `type`: js.Function = js.native
    
    /**
      * Uniques applied to the embed columns.
      */
    var uniques: js.Array[UniqueMetadata] = js.native
    
    /**
      * Uniques of this embed and all uniques from its child embeds.
      */
    var uniquesFromTree: js.Array[UniqueMetadata] = js.native
  }
}
