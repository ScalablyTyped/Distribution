package typings.typeorm

import typings.typeorm.typesTreeTypesMod.TreeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsTreeMetadataArgsMod {
  
  trait TreeMetadataArgs extends StObject {
    
    /**
      * Entity to which tree is applied.
      */
    var target: js.Function | String
    
    /**
      * Tree type.
      */
    var `type`: TreeType
  }
  object TreeMetadataArgs {
    
    inline def apply(target: js.Function | String, `type`: TreeType): TreeMetadataArgs = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeMetadataArgs]
    }
    
    extension [Self <: TreeMetadataArgs](x: Self) {
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: TreeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
