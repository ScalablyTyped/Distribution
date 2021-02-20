package typings.typeorm

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.joinTableMetadataArgsMod.JoinTableMetadataArgs
import typings.typeorm.relationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object junctionEntityMetadataBuilderMod {
  
  @JSImport("typeorm/browser/metadata-builder/JunctionEntityMetadataBuilder", "JunctionEntityMetadataBuilder")
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
    
    var connection: js.Any = js.native
  }
}
