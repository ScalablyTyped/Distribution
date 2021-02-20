package typings.typeorm

import typings.typeorm.columnModeMod.ColumnMode
import typings.typeorm.columnOptionsMod.ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMetadataArgsMod {
  
  @js.native
  trait ColumnMetadataArgs extends StObject {
    
    /**
      * Column mode in which column will work.
      *
      * todo: find name better then "mode".
      */
    val mode: ColumnMode = js.native
    
    /**
      * Extra column options.
      */
    val options: ColumnOptions = js.native
    
    /**
      * Class's property name to which column is applied.
      */
    val propertyName: String = js.native
    
    /**
      * Class to which column is applied.
      */
    val target: js.Function | String = js.native
  }
  object ColumnMetadataArgs {
    
    @scala.inline
    def apply(mode: ColumnMode, options: ColumnOptions, propertyName: String, target: js.Function | String): ColumnMetadataArgs = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnMetadataArgs]
    }
    
    @scala.inline
    implicit class ColumnMetadataArgsMutableBuilder[Self <: ColumnMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: ColumnMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: ColumnOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
