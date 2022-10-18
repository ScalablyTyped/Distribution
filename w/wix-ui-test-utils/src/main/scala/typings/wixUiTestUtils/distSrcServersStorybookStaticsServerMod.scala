package typings.wixUiTestUtils

import typings.wixUiTestUtils.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcServersStorybookStaticsServerMod {
  
  @JSImport("wix-ui-test-utils/dist/src/servers/StorybookStaticsServer", "StorybookStaticsServer")
  @js.native
  open class StorybookStaticsServer () extends StObject {
    
    /* private */ var server: Any = js.native
    
    def start(hasPort: Port): js.Promise[Any] = js.native
    
    def stop(): js.Promise[Any] = js.native
  }
}
