package typings.typeorm.anon

import typings.typeorm.metadataArgsRelationCountMetadataArgsMod.RelationCountMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata extends StObject {
  
  var args: RelationCountMetadataArgs
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
}
object ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata {
  
  @scala.inline
  def apply(
    args: RelationCountMetadataArgs,
    entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class ArgsRelationCountMetadataArgsEntityMetadataEntityMetadataMutableBuilder[Self <: ArgsRelationCountMetadataArgsEntityMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: RelationCountMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
