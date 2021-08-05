package typings.typeorm.anon

import typings.typeorm.relationCountMetadataArgsMod.RelationCountMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsRelationCountMetadataArgs extends StObject {
  
  var args: RelationCountMetadataArgs
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
}
object ArgsRelationCountMetadataArgs {
  
  inline def apply(args: RelationCountMetadataArgs, entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata): ArgsRelationCountMetadataArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsRelationCountMetadataArgs]
  }
  
  extension [Self <: ArgsRelationCountMetadataArgs](x: Self) {
    
    inline def setArgs(value: RelationCountMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
