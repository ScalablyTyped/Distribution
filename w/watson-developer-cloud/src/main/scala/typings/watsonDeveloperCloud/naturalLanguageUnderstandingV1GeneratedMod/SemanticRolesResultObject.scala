package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The extracted object from the sentence. */
trait SemanticRolesResultObject extends StObject {
  
  /** An array of extracted keywords. */
  var keywords: js.UndefOr[js.Array[SemanticRolesKeyword]] = js.undefined
  
  /** Object text. */
  var text: js.UndefOr[String] = js.undefined
}
object SemanticRolesResultObject {
  
  inline def apply(): SemanticRolesResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticRolesResultObject] (val x: Self) extends AnyVal {
    
    inline def setKeywords(value: js.Array[SemanticRolesKeyword]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: SemanticRolesKeyword*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
