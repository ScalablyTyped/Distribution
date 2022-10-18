package typings.webdriverManager

import typings.webdriverManager.anon.Index
import typings.webdriverManager.builtLibBinariesConfigSourceMod.GithubApiConfigSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibBinariesGeckoDriverGithubMod {
  
  @JSImport("webdriver-manager/built/lib/binaries/gecko_driver_github", "GeckoDriverGithub")
  @js.native
  open class GeckoDriverGithub () extends GithubApiConfigSource {
    
    /* private */ def getLatestGeckoDriverVersion(): Any = js.native
    
    /* private */ def getSpecificGeckoDrierVersion(inputVersion: Any): Any = js.native
    
    def getVersionsLookup(): js.Promise[js.Array[Index]] = js.native
    
    /* private */ def oshelper(): Any = js.native
  }
}
