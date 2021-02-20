package typings.typeorm.anon

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.uniqueMetadataArgsMod.UniqueMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnsEmbeddedMetadata extends StObject {
  
  var args: js.UndefOr[UniqueMetadataArgs] = js.native
  
  var columns: js.UndefOr[js.Array[ColumnMetadata]] = js.native
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.embeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata = js.native
}
object ColumnsEmbeddedMetadata {
  
  @scala.inline
  def apply(entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata): ColumnsEmbeddedMetadata = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsEmbeddedMetadata]
  }
  
  @scala.inline
  implicit class ColumnsEmbeddedMetadataMutableBuilder[Self <: ColumnsEmbeddedMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: UniqueMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setEmbeddedMetadata(value: typings.typeorm.embeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
