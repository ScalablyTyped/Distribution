package typings.typeorm.anon

import typings.typeorm.metadataArgsRelationIdMetadataArgsMod.RelationIdMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata extends StObject {
  
  var args: RelationIdMetadataArgs
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
}
object ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata {
  
  inline def apply(
    args: RelationIdMetadataArgs,
    entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata]
  }
  
  extension [Self <: ArgsRelationIdMetadataArgsEntityMetadataEntityMetadata](x: Self) {
    
    inline def setArgs(value: RelationIdMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
