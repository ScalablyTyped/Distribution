package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A text string that appears within the entity text field. */
trait QueryEntitiesEntity extends StObject {
  
  /** Entity text content. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The type of the specified entity. */
  var `type`: js.UndefOr[String] = js.undefined
}
object QueryEntitiesEntity {
  
  inline def apply(): QueryEntitiesEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEntitiesEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryEntitiesEntity] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
