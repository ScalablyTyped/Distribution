package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsJoinColumnMetadataArgsMod {
  
  trait JoinColumnMetadataArgs extends StObject {
    
    /**
      * Name of the column.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Class's property name to which this column is applied.
      */
    var propertyName: String
    
    /**
      * Name of the column in the entity to which this column is referenced.
      * This is column property name, not a column database name.
      */
    var referencedColumnName: js.UndefOr[String] = js.undefined
    
    /**
      * Class to which this column is applied.
      */
    var target: js.Function | String
  }
  object JoinColumnMetadataArgs {
    
    inline def apply(propertyName: String, target: js.Function | String): JoinColumnMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinColumnMetadataArgs]
    }
    
    extension [Self <: JoinColumnMetadataArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setReferencedColumnName(value: String): Self = StObject.set(x, "referencedColumnName", value.asInstanceOf[js.Any])
      
      inline def setReferencedColumnNameUndefined: Self = StObject.set(x, "referencedColumnName", js.undefined)
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
