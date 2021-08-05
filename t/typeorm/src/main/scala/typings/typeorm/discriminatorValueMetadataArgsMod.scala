package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discriminatorValueMetadataArgsMod {
  
  trait DiscriminatorValueMetadataArgs extends StObject {
    
    /**
      * Class to which discriminator name is applied.
      */
    val target: js.Function | String
    
    /**
      * Discriminator value.
      */
    val value: js.Any
  }
  object DiscriminatorValueMetadataArgs {
    
    inline def apply(target: js.Function | String, value: js.Any): DiscriminatorValueMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscriminatorValueMetadataArgs]
    }
    
    extension [Self <: DiscriminatorValueMetadataArgs](x: Self) {
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
