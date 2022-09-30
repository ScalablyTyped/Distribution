package typings.stylelint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<stylelint.stylelint.RuleMeta> */
trait PartialRuleMeta extends StObject {
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var fixable: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PartialRuleMeta {
  
  inline def apply(): PartialRuleMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRuleMeta]
  }
  
  extension [Self <: PartialRuleMeta](x: Self) {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setFixable(value: Boolean): Self = StObject.set(x, "fixable", value.asInstanceOf[js.Any])
    
    inline def setFixableUndefined: Self = StObject.set(x, "fixable", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
