package typings.typeorm.anon

import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.namingStrategyNamingStrategyInterfaceMod.NamingStrategyInterface
import typings.typeorm.typesDeferrableTypeMod.DeferrableType
import typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
import typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deferrable extends StObject {
  
  var columns: js.Array[ColumnMetadata] = js.native
  
  var deferrable: js.UndefOr[DeferrableType] = js.native
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
  
  var namingStrategy: js.UndefOr[NamingStrategyInterface] = js.native
  
  var onDelete: js.UndefOr[OnDeleteType] = js.native
  
  var onUpdate: js.UndefOr[OnUpdateType] = js.native
  
  var referencedColumns: js.Array[ColumnMetadata] = js.native
  
  var referencedEntityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata = js.native
}
object Deferrable {
  
  @scala.inline
  def apply(
    columns: js.Array[ColumnMetadata],
    entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata,
    referencedColumns: js.Array[ColumnMetadata],
    referencedEntityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): Deferrable = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any], referencedColumns = referencedColumns.asInstanceOf[js.Any], referencedEntityMetadata = referencedEntityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deferrable]
  }
  
  @scala.inline
  implicit class DeferrableMutableBuilder[Self <: Deferrable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDeferrable(value: DeferrableType): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamingStrategy(value: NamingStrategyInterface): Self = StObject.set(x, "namingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamingStrategyUndefined: Self = StObject.set(x, "namingStrategy", js.undefined)
    
    @scala.inline
    def setOnDelete(value: OnDeleteType): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: OnUpdateType): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    @scala.inline
    def setReferencedColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "referencedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "referencedColumns", js.Array(value :_*))
    
    @scala.inline
    def setReferencedEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "referencedEntityMetadata", value.asInstanceOf[js.Any])
  }
}
