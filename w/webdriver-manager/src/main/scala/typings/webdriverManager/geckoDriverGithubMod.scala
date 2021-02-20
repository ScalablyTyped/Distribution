package typings.webdriverManager

import typings.webdriverManager.anon.Index
import typings.webdriverManager.configSourceMod.GithubApiConfigSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geckoDriverGithubMod {
  
  @JSImport("webdriver-manager/built/lib/binaries/gecko_driver_github", "GeckoDriverGithub")
  @js.native
  class GeckoDriverGithub () extends GithubApiConfigSource {
    
    /* private */ def getLatestGeckoDriverVersion(): js.Any = js.native
    
    /* private */ def getSpecificGeckoDrierVersion(inputVersion: js.Any): js.Any = js.native
    
    def getVersionsLookup(): js.Promise[js.Array[Index]] = js.native
    
    /* private */ def oshelper(): js.Any = js.native
  }
}
