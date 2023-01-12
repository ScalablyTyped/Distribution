package typings.vite.mod

import typings.vite.viteBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineConfig
  extends StObject
     with UserConfig {
  
  var configFile: js.UndefOr[String | `false`] = js.undefined
  
  var envFile: js.UndefOr[`false`] = js.undefined
}
object InlineConfig {
  
  inline def apply(): InlineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineConfig] (val x: Self) extends AnyVal {
    
    inline def setConfigFile(value: String | `false`): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    inline def setEnvFile(value: `false`): Self = StObject.set(x, "envFile", value.asInstanceOf[js.Any])
    
    inline def setEnvFileUndefined: Self = StObject.set(x, "envFile", js.undefined)
  }
}
