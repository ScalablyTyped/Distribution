package typings.typeorm.anon

import typings.typeorm.entityListenerMetadataArgsMod.EntityListenerMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedMetadata extends StObject {
  
  var args: EntityListenerMetadataArgs
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.embeddedMetadataMod.EmbeddedMetadata] = js.undefined
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
}
object EmbeddedMetadata {
  
  inline def apply(args: EntityListenerMetadataArgs, entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata): EmbeddedMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedMetadata]
  }
  
  extension [Self <: EmbeddedMetadata](x: Self) {
    
    inline def setArgs(value: EntityListenerMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedMetadata(value: typings.typeorm.embeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    inline def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
