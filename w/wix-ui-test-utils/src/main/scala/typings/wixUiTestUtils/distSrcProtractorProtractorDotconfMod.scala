package typings.wixUiTestUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtractorProtractorDotconfMod {
  
  object baseProtractorConfig {
    
    @JSImport("wix-ui-test-utils/dist/src/protractor/protractor.conf", "baseProtractorConfig")
    @js.native
    val ^ : js.Any = js.native
    
    inline def afterLaunch(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLaunch")().asInstanceOf[js.Promise[Any]]
    
    @JSImport("wix-ui-test-utils/dist/src/protractor/protractor.conf", "baseProtractorConfig.baseUrl")
    @js.native
    def baseUrl: String = js.native
    inline def baseUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(x.asInstanceOf[js.Any])
    
    inline def beforeLaunch(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLaunch")().asInstanceOf[js.Promise[Any]]
    
    inline def onPrepare(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPrepare")().asInstanceOf[Unit]
    
    @JSImport("wix-ui-test-utils/dist/src/protractor/protractor.conf", "baseProtractorConfig.specs")
    @js.native
    def specs: js.Array[String] = js.native
    inline def specs_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specs")(x.asInstanceOf[js.Any])
  }
}
