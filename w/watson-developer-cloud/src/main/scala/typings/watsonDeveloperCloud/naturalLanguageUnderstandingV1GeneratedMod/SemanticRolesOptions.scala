package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parses sentences into subject, action, and object form. Supported languages: English, German, Japanese, Korean, Spanish. */
trait SemanticRolesOptions extends StObject {
  
  /** Set this to `true` to return entity information for subjects and objects. */
  var entities: js.UndefOr[Boolean] = js.undefined
  
  /** Set this to `true` to return keyword information for subjects and objects. */
  var keywords: js.UndefOr[Boolean] = js.undefined
  
  /** Maximum number of semantic_roles results to return. */
  var limit: js.UndefOr[Double] = js.undefined
}
object SemanticRolesOptions {
  
  @scala.inline
  def apply(): SemanticRolesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticRolesOptions]
  }
  
  @scala.inline
  implicit class SemanticRolesOptionsMutableBuilder[Self <: SemanticRolesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: Boolean): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setKeywords(value: Boolean): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
