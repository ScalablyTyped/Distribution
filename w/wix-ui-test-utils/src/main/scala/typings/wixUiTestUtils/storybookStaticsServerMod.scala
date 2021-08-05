package typings.wixUiTestUtils

import typings.wixUiTestUtils.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storybookStaticsServerMod {
  
  @JSImport("wix-ui-test-utils/dist/src/servers/StorybookStaticsServer", "StorybookStaticsServer")
  @js.native
  class StorybookStaticsServer () extends StObject {
    
    /* private */ var server: js.Any = js.native
    
    def start(hasPort: Port): js.Promise[js.Object] = js.native
    
    def stop(): js.Promise[js.Object] = js.native
  }
}
