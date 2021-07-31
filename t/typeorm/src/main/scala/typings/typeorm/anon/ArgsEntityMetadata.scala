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
  
  @scala.inline
  def apply(args: EmbeddedMetadataArgs, entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata): ArgsEntityMetadata = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsEntityMetadata]
  }
  
  @scala.inline
  implicit class ArgsEntityMetadataMutableBuilder[Self <: ArgsEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: EmbeddedMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
