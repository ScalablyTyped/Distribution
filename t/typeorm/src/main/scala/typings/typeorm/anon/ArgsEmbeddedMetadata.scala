package typings.typeorm.anon

import typings.typeorm.relationMetadataArgsMod.RelationMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsEmbeddedMetadata extends StObject {
  
  var args: RelationMetadataArgs
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.embeddedMetadataMod.EmbeddedMetadata] = js.undefined
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
}
object ArgsEmbeddedMetadata {
  
  inline def apply(args: RelationMetadataArgs, entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata): ArgsEmbeddedMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsEmbeddedMetadata]
  }
  
  extension [Self <: ArgsEmbeddedMetadata](x: Self) {
    
    inline def setArgs(value: RelationMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedMetadata(value: typings.typeorm.embeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    inline def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
