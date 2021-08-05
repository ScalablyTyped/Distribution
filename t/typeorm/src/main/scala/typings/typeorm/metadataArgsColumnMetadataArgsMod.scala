package typings.typeorm

import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import typings.typeorm.typesColumnModeMod.ColumnMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsColumnMetadataArgsMod {
  
  trait ColumnMetadataArgs extends StObject {
    
    /**
      * Column mode in which column will work.
      *
      * todo: find name better then "mode".
      */
    val mode: ColumnMode
    
    /**
      * Extra column options.
      */
    val options: ColumnOptions
    
    /**
      * Class's property name to which column is applied.
      */
    val propertyName: String
    
    /**
      * Class to which column is applied.
      */
    val target: js.Function | String
  }
  object ColumnMetadataArgs {
    
    inline def apply(mode: ColumnMode, options: ColumnOptions, propertyName: String, target: js.Function | String): ColumnMetadataArgs = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnMetadataArgs]
    }
    
    extension [Self <: ColumnMetadataArgs](x: Self) {
      
      inline def setMode(value: ColumnMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ColumnOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
