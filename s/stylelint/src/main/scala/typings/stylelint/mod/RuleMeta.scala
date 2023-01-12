package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleMeta extends StObject {
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var fixable: js.UndefOr[Boolean] = js.undefined
  
  var url: String
}
object RuleMeta {
  
  inline def apply(url: String): RuleMeta = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleMeta] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setFixable(value: Boolean): Self = StObject.set(x, "fixable", value.asInstanceOf[js.Any])
    
    inline def setFixableUndefined: Self = StObject.set(x, "fixable", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
