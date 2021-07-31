package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRemoteBrowserOptions extends StObject {
  
  var capabilities: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
}
object MultiRemoteBrowserOptions {
  
  @scala.inline
  def apply(
    capabilities: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
  ): MultiRemoteBrowserOptions = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiRemoteBrowserOptions]
  }
  
  @scala.inline
  implicit class MultiRemoteBrowserOptionsMutableBuilder[Self <: MultiRemoteBrowserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
    ): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
  }
}
