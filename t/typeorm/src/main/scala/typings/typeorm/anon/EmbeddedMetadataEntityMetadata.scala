package typings.typeorm.anon

import typings.typeorm.metadataArgsEntityListenerMetadataArgsMod.EntityListenerMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedMetadataEntityMetadata extends StObject {
  
  var args: EntityListenerMetadataArgs
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.undefined
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
}
object EmbeddedMetadataEntityMetadata {
  
  @scala.inline
  def apply(
    args: EntityListenerMetadataArgs,
    entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): EmbeddedMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class EmbeddedMetadataEntityMetadataMutableBuilder[Self <: EmbeddedMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: EntityListenerMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadata(value: typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
