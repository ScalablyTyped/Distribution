package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The object containing the actions and the objects the actions act upon. */
trait SemanticRolesResult extends StObject {
  
  /** The extracted action from the sentence. */
  var action: js.UndefOr[SemanticRolesResultAction] = js.undefined
  
  /** The extracted object from the sentence. */
  var `object`: js.UndefOr[SemanticRolesResultObject] = js.undefined
  
  /** Sentence from the source that contains the subject, action, and object. */
  var sentence: js.UndefOr[String] = js.undefined
  
  /** The extracted subject from the sentence. */
  var subject: js.UndefOr[SemanticRolesResultSubject] = js.undefined
}
object SemanticRolesResult {
  
  inline def apply(): SemanticRolesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticRolesResult] (val x: Self) extends AnyVal {
    
    inline def setAction(value: SemanticRolesResultAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setObject(value: SemanticRolesResultObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setSentence(value: String): Self = StObject.set(x, "sentence", value.asInstanceOf[js.Any])
    
    inline def setSentenceUndefined: Self = StObject.set(x, "sentence", js.undefined)
    
    inline def setSubject(value: SemanticRolesResultSubject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
