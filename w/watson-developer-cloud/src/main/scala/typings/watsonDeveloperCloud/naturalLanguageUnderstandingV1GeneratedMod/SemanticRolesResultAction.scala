package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The extracted action from the sentence. */
trait SemanticRolesResultAction extends StObject {
  
  /** normalized version of the action. */
  var normalized: js.UndefOr[String] = js.undefined
  
  /** Analyzed text that corresponds to the action. */
  var text: js.UndefOr[String] = js.undefined
  
  var verb: js.UndefOr[SemanticRolesVerb] = js.undefined
}
object SemanticRolesResultAction {
  
  inline def apply(): SemanticRolesResultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticRolesResultAction] (val x: Self) extends AnyVal {
    
    inline def setNormalized(value: String): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setNormalizedUndefined: Self = StObject.set(x, "normalized", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVerb(value: SemanticRolesVerb): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
