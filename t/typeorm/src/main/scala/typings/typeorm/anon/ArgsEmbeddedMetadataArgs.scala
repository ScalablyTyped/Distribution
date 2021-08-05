package typings.typeorm.anon

import typings.typeorm.metadataArgsEmbeddedMetadataArgsMod.EmbeddedMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsEmbeddedMetadataArgs extends StObject {
  
  var args: EmbeddedMetadataArgs
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
}
object ArgsEmbeddedMetadataArgs {
  
  inline def apply(
    args: EmbeddedMetadataArgs,
    entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): ArgsEmbeddedMetadataArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsEmbeddedMetadataArgs]
  }
  
  extension [Self <: ArgsEmbeddedMetadataArgs](x: Self) {
    
    inline def setArgs(value: EmbeddedMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
