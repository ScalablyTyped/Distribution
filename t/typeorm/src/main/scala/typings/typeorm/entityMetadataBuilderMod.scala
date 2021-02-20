package typings.typeorm

import typings.typeorm.closureJunctionEntityMetadataBuilderMod.ClosureJunctionEntityMetadataBuilder
import typings.typeorm.connectionMod.Connection
import typings.typeorm.embeddedMetadataArgsMod.EmbeddedMetadataArgs
import typings.typeorm.embeddedMetadataMod.EmbeddedMetadata
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.junctionEntityMetadataBuilderMod.JunctionEntityMetadataBuilder
import typings.typeorm.metadataArgsStorageMod.MetadataArgsStorage
import typings.typeorm.relationJoinColumnBuilderMod.RelationJoinColumnBuilder
import typings.typeorm.tableMetadataArgsMod.TableMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMetadataBuilderMod {
  
  @JSImport("typeorm/browser/metadata-builder/EntityMetadataBuilder", "EntityMetadataBuilder")
  @js.native
  class EntityMetadataBuilder protected () extends StObject {
    def this(connection: Connection, metadataArgsStorage: MetadataArgsStorage) = this()
    
    /**
      * Builds a complete entity metadatas for the given entity classes.
      */
    def build(): js.Array[EntityMetadata] = js.native
    def build(entityClasses: js.Array[js.Function]): js.Array[EntityMetadata] = js.native
    
    /**
      * Used to build entity metadatas of the closure junction entities.
      */
    var closureJunctionEntityMetadataBuilder: ClosureJunctionEntityMetadataBuilder = js.native
    
    /* protected */ def computeEntityMetadataStep1(allEntityMetadatas: js.Array[EntityMetadata], entityMetadata: EntityMetadata): Unit = js.native
    
    /**
      * Computes all entity metadata's computed properties, and all its sub-metadatas (relations, columns, embeds, etc).
      */
    /* protected */ def computeEntityMetadataStep2(entityMetadata: EntityMetadata): Unit = js.native
    
    /**
      * Computes entity metadata's relations inverse side properties.
      */
    /* protected */ def computeInverseProperties(entityMetadata: EntityMetadata, entityMetadatas: js.Array[EntityMetadata]): Unit = js.native
    
    /* protected */ def computeParentEntityMetadata(allEntityMetadatas: js.Array[EntityMetadata], entityMetadata: EntityMetadata): Unit = js.native
    
    var connection: js.Any = js.native
    
    /**
      * Creates from the given embedded metadata args real embedded metadatas with its columns and relations,
      * and does the same for all its sub-embeddeds (goes recursively).
      */
    /* protected */ def createEmbeddedsRecursively(entityMetadata: EntityMetadata, embeddedArgs: js.Array[EmbeddedMetadataArgs]): js.Array[EmbeddedMetadata] = js.native
    
    /**
      * Creates entity metadata from the given table args.
      * Creates column, relation, etc. metadatas for everything this entity metadata owns.
      */
    /* protected */ def createEntityMetadata(tableArgs: TableMetadataArgs): EntityMetadata = js.native
    
    /**
      * Creates indices for the table of single table inheritance.
      */
    /* protected */ def createKeysForTableInheritance(entityMetadata: EntityMetadata): Unit = js.native
    
    /**
      * Used to build entity metadatas of the junction entities.
      */
    var junctionEntityMetadataBuilder: JunctionEntityMetadataBuilder = js.native
    
    var metadataArgsStorage: js.Any = js.native
    
    /**
      * Used to build join columns of the relations.
      */
    var relationJoinColumnBuilder: RelationJoinColumnBuilder = js.native
  }
}
