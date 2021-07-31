package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An entity that corresponds with an argument in a relation. */
trait RelationEntity extends StObject {
  
  /** Text that corresponds to the entity. */
  var text: js.UndefOr[String] = js.undefined
  
  /** Entity type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object RelationEntity {
  
  @scala.inline
  def apply(): RelationEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationEntity]
  }
  
  @scala.inline
  implicit class RelationEntityMutableBuilder[Self <: RelationEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
