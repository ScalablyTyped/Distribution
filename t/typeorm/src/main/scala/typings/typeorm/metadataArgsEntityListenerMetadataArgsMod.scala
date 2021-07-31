package typings.typeorm

import typings.typeorm.typesEventListenerTypesMod.EventListenerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsEntityListenerMetadataArgsMod {
  
  trait EntityListenerMetadataArgs extends StObject {
    
    /**
      * Class's property name to which listener is applied.
      */
    val propertyName: String
    
    /**
      * Class to which listener is applied.
      */
    val target: js.Function
    
    /**
      * The type of the listener.
      */
    val `type`: EventListenerType
  }
  object EntityListenerMetadataArgs {
    
    @scala.inline
    def apply(propertyName: String, target: js.Function, `type`: EventListenerType): EntityListenerMetadataArgs = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityListenerMetadataArgs]
    }
    
    @scala.inline
    implicit class EntityListenerMetadataArgsMutableBuilder[Self <: EntityListenerMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: EventListenerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
