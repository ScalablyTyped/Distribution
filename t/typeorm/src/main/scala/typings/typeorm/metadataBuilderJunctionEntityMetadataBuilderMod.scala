package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.metadataArgsJoinTableMetadataArgsMod.JoinTableMetadataArgs
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataBuilderJunctionEntityMetadataBuilderMod {
  
  @JSImport("typeorm/metadata-builder/JunctionEntityMetadataBuilder", "JunctionEntityMetadataBuilder")
  @js.native
  class JunctionEntityMetadataBuilder protected () extends StObject {
    def this(connection: Connection) = this()
    
    /**
      * Builds EntityMetadata for the junction of the given many-to-many relation.
      */
    def build(relation: RelationMetadata, joinTable: JoinTableMetadataArgs): EntityMetadata = js.native
    
    /* protected */ def changeDuplicatedColumnNames(junctionColumns: js.Array[ColumnMetadata], inverseJunctionColumns: js.Array[ColumnMetadata]): Unit = js.native
    
    /**
      * Collects inverse referenced columns from the given join column args.
      */
    /* protected */ def collectInverseReferencedColumns(relation: RelationMetadata, joinTable: JoinTableMetadataArgs): js.Array[ColumnMetadata] = js.native
    
    /**
      * Collects referenced columns from the given join column args.
      */
    /* protected */ def collectReferencedColumns(relation: RelationMetadata, joinTable: JoinTableMetadataArgs): js.Array[ColumnMetadata] = js.native
    
    /* private */ var connection: js.Any = js.native
  }
}
