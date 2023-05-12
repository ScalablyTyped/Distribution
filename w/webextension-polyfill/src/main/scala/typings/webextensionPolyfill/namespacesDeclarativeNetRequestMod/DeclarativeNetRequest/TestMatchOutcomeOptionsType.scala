package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMatchOutcomeOptionsType extends StObject {
  
  /**
    * Whether to account for rules from other installed extensions during rule evaluation.
    * Optional.
    */
  var includeOtherExtensions: js.UndefOr[Boolean] = js.undefined
}
object TestMatchOutcomeOptionsType {
  
  inline def apply(): TestMatchOutcomeOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestMatchOutcomeOptionsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestMatchOutcomeOptionsType] (val x: Self) extends AnyVal {
    
    inline def setIncludeOtherExtensions(value: Boolean): Self = StObject.set(x, "includeOtherExtensions", value.asInstanceOf[js.Any])
    
    inline def setIncludeOtherExtensionsUndefined: Self = StObject.set(x, "includeOtherExtensions", js.undefined)
  }
}
