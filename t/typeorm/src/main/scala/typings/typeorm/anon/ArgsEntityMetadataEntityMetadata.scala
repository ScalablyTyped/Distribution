package typings.typeorm.anon

import typings.typeorm.metadataArgsCheckMetadataArgsMod.CheckMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsEntityMetadataEntityMetadata extends StObject {
  
  var args: js.UndefOr[CheckMetadataArgs] = js.undefined
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
}
object ArgsEntityMetadataEntityMetadata {
  
  @scala.inline
  def apply(entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): ArgsEntityMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsEntityMetadataEntityMetadata]
  }
  
  @scala.inline
  implicit class ArgsEntityMetadataEntityMetadataMutableBuilder[Self <: ArgsEntityMetadataEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: CheckMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
