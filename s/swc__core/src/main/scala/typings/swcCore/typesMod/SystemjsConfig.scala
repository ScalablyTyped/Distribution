package typings.swcCore.typesMod

import typings.swcCore.swcCoreStrings.systemjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemjsConfig
  extends StObject
     with ModuleConfig {
  
  var allowTopLevelThis: js.UndefOr[Boolean] = js.undefined
  
  var `type`: systemjs
}
object SystemjsConfig {
  
  inline def apply(): SystemjsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("systemjs")
    __obj.asInstanceOf[SystemjsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemjsConfig] (val x: Self) extends AnyVal {
    
    inline def setAllowTopLevelThis(value: Boolean): Self = StObject.set(x, "allowTopLevelThis", value.asInstanceOf[js.Any])
    
    inline def setAllowTopLevelThisUndefined: Self = StObject.set(x, "allowTopLevelThis", js.undefined)
    
    inline def setType(value: systemjs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
