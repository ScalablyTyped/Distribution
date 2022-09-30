package typings.stylelint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<stylelint.stylelint.LinterOptions, 'cwd' | 'config' | 'configBasedir' | 'configFile'> */
trait PickLinterOptionscwdconfi extends StObject {
  
  var config: js.UndefOr[typings.stylelint.mod.Config] = js.undefined
  
  var configBasedir: js.UndefOr[String] = js.undefined
  
  var configFile: js.UndefOr[String] = js.undefined
  
  var cwd: js.UndefOr[String] = js.undefined
}
object PickLinterOptionscwdconfi {
  
  inline def apply(): PickLinterOptionscwdconfi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickLinterOptionscwdconfi]
  }
  
  extension [Self <: PickLinterOptionscwdconfi](x: Self) {
    
    inline def setConfig(value: typings.stylelint.mod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigBasedir(value: String): Self = StObject.set(x, "configBasedir", value.asInstanceOf[js.Any])
    
    inline def setConfigBasedirUndefined: Self = StObject.set(x, "configBasedir", js.undefined)
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
  }
}
