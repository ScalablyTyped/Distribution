package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SemanticRolesVerb. */
trait SemanticRolesVerb extends StObject {
  
  /** Verb tense. */
  var tense: js.UndefOr[String] = js.undefined
  
  /** The keyword text. */
  var text: js.UndefOr[String] = js.undefined
}
object SemanticRolesVerb {
  
  inline def apply(): SemanticRolesVerb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesVerb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticRolesVerb] (val x: Self) extends AnyVal {
    
    inline def setTense(value: String): Self = StObject.set(x, "tense", value.asInstanceOf[js.Any])
    
    inline def setTenseUndefined: Self = StObject.set(x, "tense", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
