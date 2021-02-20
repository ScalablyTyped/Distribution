package typings.typeorm

import typings.typeorm.commonEntityTargetMod.EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsEntityRepositoryMetadataArgsMod {
  
  @js.native
  trait EntityRepositoryMetadataArgs extends StObject {
    
    /**
      * Entity managed by this custom repository.
      */
    val entity: js.UndefOr[EntityTarget[_]] = js.native
    
    /**
      * Constructor of the custom entity repository.
      */
    val target: js.Function = js.native
  }
  object EntityRepositoryMetadataArgs {
    
    @scala.inline
    def apply(target: js.Function): EntityRepositoryMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityRepositoryMetadataArgs]
    }
    
    @scala.inline
    implicit class EntityRepositoryMetadataArgsMutableBuilder[Self <: EntityRepositoryMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: EntityTarget[_]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
