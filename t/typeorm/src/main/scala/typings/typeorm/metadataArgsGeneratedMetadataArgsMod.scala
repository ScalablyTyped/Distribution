package typings.typeorm

import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsGeneratedMetadataArgsMod {
  
  @js.native
  trait GeneratedMetadataArgs extends StObject {
    
    /**
      * Class's property name to which decorator is applied.
      */
    val propertyName: String = js.native
    
    /**
      * Generation strategy.
      */
    val strategy: uuid | increment | rowid = js.native
    
    /**
      * Class to which decorator is applied.
      */
    val target: js.Function | String = js.native
  }
  object GeneratedMetadataArgs {
    
    @scala.inline
    def apply(propertyName: String, strategy: uuid | increment | rowid, target: js.Function | String): GeneratedMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratedMetadataArgs]
    }
    
    @scala.inline
    implicit class GeneratedMetadataArgsMutableBuilder[Self <: GeneratedMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategy(value: uuid | increment | rowid): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
