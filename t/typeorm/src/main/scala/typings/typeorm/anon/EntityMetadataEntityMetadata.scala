package typings.typeorm.anon

import typings.typeorm.exclusionMetadataArgsMod.ExclusionMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityMetadataEntityMetadata extends StObject {
  
  var args: js.UndefOr[ExclusionMetadataArgs] = js.undefined
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
}
object EntityMetadataEntityMetadata {
  
  @scala.inline
  def apply(entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata): EntityMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class EntityMetadataEntityMetadataMutableBuilder[Self <: EntityMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: ExclusionMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
