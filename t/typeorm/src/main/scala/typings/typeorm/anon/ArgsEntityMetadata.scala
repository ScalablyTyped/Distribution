package typings.typeorm.anon

import typings.typeorm.embeddedMetadataArgsMod.EmbeddedMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsEntityMetadata extends StObject {
  
  var args: EmbeddedMetadataArgs
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
}
object ArgsEntityMetadata {
  
  inline def apply(args: EmbeddedMetadataArgs, entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata): ArgsEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsEntityMetadata]
  }
  
  extension [Self <: ArgsEntityMetadata](x: Self) {
    
    inline def setArgs(value: EmbeddedMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
