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
  
  @scala.inline
  def apply(): SemanticRolesResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesResultObject]
  }
  
  @scala.inline
  implicit class SemanticRolesResultObjectMutableBuilder[Self <: SemanticRolesResultObject] (val x: Self) extends AnyVal {
    
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
