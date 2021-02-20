package typings.typeorm.anon

import typings.typeorm.metadataArgsColumnMetadataArgsMod.ColumnMetadataArgs
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.typeormStrings.ancestor
import typings.typeorm.typeormStrings.descendant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterializedPath extends StObject {
  
  var args: ColumnMetadataArgs = js.native
  
  var closureType: js.UndefOr[ancestor | descendant] = js.native
  
  var connection: typings.typeorm.connectionConnectionMod.Connection = js.native
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
  
  var materializedPath: js.UndefOr[Boolean] = js.native
  
  var nestedSetLeft: js.UndefOr[Boolean] = js.native
  
  var nestedSetRight: js.UndefOr[Boolean] = js.native
  
  var referencedColumn: js.UndefOr[ColumnMetadata] = js.native
}
object MaterializedPath {
  
  @scala.inline
  def apply(
    args: ColumnMetadataArgs,
    connection: typings.typeorm.connectionConnectionMod.Connection,
    entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): MaterializedPath = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterializedPath]
  }
  
  @scala.inline
  implicit class MaterializedPathMutableBuilder[Self <: MaterializedPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: ColumnMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosureType(value: ancestor | descendant): Self = StObject.set(x, "closureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosureTypeUndefined: Self = StObject.set(x, "closureType", js.undefined)
    
    @scala.inline
    def setConnection(value: typings.typeorm.connectionConnectionMod.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadata(value: typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedPath(value: Boolean): Self = StObject.set(x, "materializedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedPathUndefined: Self = StObject.set(x, "materializedPath", js.undefined)
    
    @scala.inline
    def setNestedSetLeft(value: Boolean): Self = StObject.set(x, "nestedSetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedSetLeftUndefined: Self = StObject.set(x, "nestedSetLeft", js.undefined)
    
    @scala.inline
    def setNestedSetRight(value: Boolean): Self = StObject.set(x, "nestedSetRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedSetRightUndefined: Self = StObject.set(x, "nestedSetRight", js.undefined)
    
    @scala.inline
    def setReferencedColumn(value: ColumnMetadata): Self = StObject.set(x, "referencedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedColumnUndefined: Self = StObject.set(x, "referencedColumn", js.undefined)
  }
}
