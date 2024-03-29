package typings.typeorm

import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsGeneratedMetadataArgsMod {
  
  trait GeneratedMetadataArgs extends StObject {
    
    /**
      * Class's property name to which decorator is applied.
      */
    val propertyName: String
    
    /**
      * Generation strategy.
      */
    val strategy: uuid | increment | rowid
    
    /**
      * Class to which decorator is applied.
      */
    val target: js.Function | String
  }
  object GeneratedMetadataArgs {
    
    inline def apply(propertyName: String, strategy: uuid | increment | rowid, target: js.Function | String): GeneratedMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratedMetadataArgs]
    }
    
    extension [Self <: GeneratedMetadataArgs](x: Self) {
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: uuid | increment | rowid): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
