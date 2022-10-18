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
  
  inline def apply(): SemanticRolesResultSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultSubject]
  }
  
  extension [Self <: SemanticRolesResultSubject](x: Self) {
    
    inline def setEntities(value: js.Array[SemanticRolesEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SemanticRolesEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setKeywords(value: js.Array[SemanticRolesKeyword]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: SemanticRolesKeyword*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
