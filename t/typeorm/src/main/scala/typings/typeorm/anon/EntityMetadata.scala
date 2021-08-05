package typings.typeorm.anon

import typings.typeorm.checkMetadataArgsMod.CheckMetadataArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityMetadata extends StObject {
  
  var args: js.UndefOr[CheckMetadataArgs] = js.undefined
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
}
object EntityMetadata {
  
  inline def apply(entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata): EntityMetadata = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityMetadata]
  }
  
  extension [Self <: EntityMetadata](x: Self) {
    
    inline def setArgs(value: CheckMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
