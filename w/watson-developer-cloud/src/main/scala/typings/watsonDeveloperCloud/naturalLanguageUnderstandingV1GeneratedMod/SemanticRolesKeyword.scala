package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SemanticRolesKeyword. */
trait SemanticRolesKeyword extends StObject {
  
  /** The keyword text. */
  var text: js.UndefOr[String] = js.undefined
}
object SemanticRolesKeyword {
  
  @scala.inline
  def apply(): SemanticRolesKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesKeyword]
  }
  
  @scala.inline
  implicit class SemanticRolesKeywordMutableBuilder[Self <: SemanticRolesKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
