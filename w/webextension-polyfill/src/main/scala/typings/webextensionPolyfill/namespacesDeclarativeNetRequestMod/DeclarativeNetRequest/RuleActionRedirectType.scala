package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes how the redirect should be performed. Only valid when type is 'redirect'.
  */
trait RuleActionRedirectType extends StObject {
  
  /**
    * Path relative to the extension directory. Should start with '/'.
    * Optional.
    */
  var extensionPath: js.UndefOr[String] = js.undefined
  
  /**
    * TODO with regexFilter + Substitution pattern for rules which specify a 'regexFilter'.
    * Optional.
    */
  var regexSubstitution: js.UndefOr[String] = js.undefined
  
  /**
    * Url transformations to perform.
    * Optional.
    */
  var transform: js.UndefOr[URLTransform] = js.undefined
  
  /**
    * The redirect url. Redirects to JavaScript urls are not allowed.
    * Optional.
    */
  var url: js.UndefOr[String] = js.undefined
}
object RuleActionRedirectType {
  
  inline def apply(): RuleActionRedirectType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleActionRedirectType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleActionRedirectType] (val x: Self) extends AnyVal {
    
    inline def setExtensionPath(value: String): Self = StObject.set(x, "extensionPath", value.asInstanceOf[js.Any])
    
    inline def setExtensionPathUndefined: Self = StObject.set(x, "extensionPath", js.undefined)
    
    inline def setRegexSubstitution(value: String): Self = StObject.set(x, "regexSubstitution", value.asInstanceOf[js.Any])
    
    inline def setRegexSubstitutionUndefined: Self = StObject.set(x, "regexSubstitution", js.undefined)
    
    inline def setTransform(value: URLTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
