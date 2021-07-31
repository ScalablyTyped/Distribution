package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SemanticRolesEntity. */
trait SemanticRolesEntity extends StObject {
  
  /** The entity text. */
  var text: js.UndefOr[String] = js.undefined
  
  /** Entity type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SemanticRolesEntity {
  
  @scala.inline
  def apply(): SemanticRolesEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesEntity]
  }
  
  @scala.inline
  implicit class SemanticRolesEntityMutableBuilder[Self <: SemanticRolesEntity] (val x: Self) extends AnyVal {
    
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
