package typings.typeorm

import typings.typeorm.commonEntityTargetMod.EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsEntityRepositoryMetadataArgsMod {
  
  trait EntityRepositoryMetadataArgs extends StObject {
    
    /**
      * Entity managed by this custom repository.
      */
    val entity: js.UndefOr[EntityTarget[js.Any]] = js.undefined
    
    /**
      * Constructor of the custom entity repository.
      */
    val target: js.Function
  }
  object EntityRepositoryMetadataArgs {
    
    inline def apply(target: js.Function): EntityRepositoryMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityRepositoryMetadataArgs]
    }
    
    extension [Self <: EntityRepositoryMetadataArgs](x: Self) {
      
      inline def setEntity(value: EntityTarget[js.Any]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
