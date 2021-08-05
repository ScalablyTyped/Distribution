package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsNamingStrategyMetadataArgsMod {
  
  trait NamingStrategyMetadataArgs extends StObject {
    
    /**
      * Strategy name.
      */
    val name: String
    
    /**
      * Class to which this column is applied.
      */
    val target: js.Function
  }
  object NamingStrategyMetadataArgs {
    
    inline def apply(name: String, target: js.Function): NamingStrategyMetadataArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamingStrategyMetadataArgs]
    }
    
    extension [Self <: NamingStrategyMetadataArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
