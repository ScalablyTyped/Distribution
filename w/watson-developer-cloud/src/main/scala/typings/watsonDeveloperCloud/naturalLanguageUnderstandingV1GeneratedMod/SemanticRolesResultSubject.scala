package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The extracted subject from the sentence. */
trait SemanticRolesResultSubject extends StObject {
  
  /** An array of extracted entities. */
  var entities: js.UndefOr[js.Array[SemanticRolesEntity]] = js.undefined
  
  /** An array of extracted keywords. */
  var keywords: js.UndefOr[js.Array[SemanticRolesKeyword]] = js.undefined
  
  /** Text that corresponds to the subject role. */
  var text: js.UndefOr[String] = js.undefined
}
object SemanticRolesResultSubject {
  
  @scala.inline
  def apply(): SemanticRolesResultSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultSubject]
  }
  
  @scala.inline
  implicit class SemanticRolesResultSubjectMutableBuilder[Self <: SemanticRolesResultSubject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[SemanticRolesEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: SemanticRolesEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[SemanticRolesKeyword]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: SemanticRolesKeyword*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
