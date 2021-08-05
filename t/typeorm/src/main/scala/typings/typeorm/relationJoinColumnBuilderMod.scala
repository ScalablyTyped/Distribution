package typings.typeorm

import typings.typeorm.anon.ForeignKey
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.connectionMod.Connection
import typings.typeorm.joinColumnMetadataArgsMod.JoinColumnMetadataArgs
import typings.typeorm.relationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationJoinColumnBuilderMod {
  
  @JSImport("typeorm/browser/metadata-builder/RelationJoinColumnBuilder", "RelationJoinColumnBuilder")
  @js.native
  class RelationJoinColumnBuilder protected () extends StObject {
    def this(connection: Connection) = this()
    
    /**
      * Builds a foreign key of the many-to-one or one-to-one owner relations.
      */
    def build(joinColumns: js.Array[JoinColumnMetadataArgs], relation: RelationMetadata): ForeignKey = js.native
    
    /**
      * Collects columns from the given join column args.
      */
    /* private */ var collectColumns: js.Any = js.native
    
    /**
      * Collects referenced columns from the given join column args.
      */
    /* protected */ def collectReferencedColumns(joinColumns: js.Array[JoinColumnMetadataArgs], relation: RelationMetadata): js.Array[ColumnMetadata] = js.native
    
    /* private */ var connection: js.Any = js.native
  }
}
