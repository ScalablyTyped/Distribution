package typings.wixWixUiTestUtils

import typings.wixWixUiTestUtils.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesServersStorybookStaticsServerMod {
  
  @JSImport("@wix/wix-ui-test-utils/dist/types/servers/StorybookStaticsServer", "StorybookStaticsServer")
  @js.native
  open class StorybookStaticsServer () extends StObject {
    
    /* private */ var server: Any = js.native
    
    def start(param0: Port): js.Promise[Any] = js.native
    
    def stop(): js.Promise[Any] = js.native
  }
}
