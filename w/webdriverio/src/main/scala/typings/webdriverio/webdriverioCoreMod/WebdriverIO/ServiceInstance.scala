package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceInstance
  extends StObject
     with HookFunctions {
  
  var capabilities: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
  ] = js.undefined
  
  var config: js.UndefOr[Config] = js.undefined
  
  var options: js.UndefOr[Record[String, js.Any]] = js.undefined
}
object ServiceInstance {
  
  @scala.inline
  def apply(): ServiceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceInstance]
  }
  
  @scala.inline
  implicit class ServiceInstanceMutableBuilder[Self <: ServiceInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
    ): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setOptions(value: Record[String, js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
