package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinColumnMetadataArgsMod {
  
  @js.native
  trait JoinColumnMetadataArgs extends StObject {
    
    /**
      * Name of the column.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Class's property name to which this column is applied.
      */
    var propertyName: String = js.native
    
    /**
      * Name of the column in the entity to which this column is referenced.
      * This is column property name, not a column database name.
      */
    var referencedColumnName: js.UndefOr[String] = js.native
    
    /**
      * Class to which this column is applied.
      */
    var target: js.Function | String = js.native
  }
  object JoinColumnMetadataArgs {
    
    @scala.inline
    def apply(propertyName: String, target: js.Function | String): JoinColumnMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinColumnMetadataArgs]
    }
    
    @scala.inline
    implicit class JoinColumnMetadataArgsMutableBuilder[Self <: JoinColumnMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencedColumnName(value: String): Self = StObject.set(x, "referencedColumnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencedColumnNameUndefined: Self = StObject.set(x, "referencedColumnName", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
