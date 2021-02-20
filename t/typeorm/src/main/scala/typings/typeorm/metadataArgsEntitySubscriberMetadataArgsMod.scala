package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsEntitySubscriberMetadataArgsMod {
  
  @js.native
  trait EntitySubscriberMetadataArgs extends StObject {
    
    /**
      * Class to which subscriber is applied.
      */
    val target: js.Function = js.native
  }
  object EntitySubscriberMetadataArgs {
    
    @scala.inline
    def apply(target: js.Function): EntitySubscriberMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntitySubscriberMetadataArgs]
    }
    
    @scala.inline
    implicit class EntitySubscriberMetadataArgsMutableBuilder[Self <: EntitySubscriberMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
