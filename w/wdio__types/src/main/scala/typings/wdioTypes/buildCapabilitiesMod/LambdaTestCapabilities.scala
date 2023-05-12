package typings.wdioTypes.buildCapabilitiesMod

import typings.wdioTypes.wdioTypesStrings.`true`
import typings.wdioTypes.wdioTypesStrings.error
import typings.wdioTypes.wdioTypesStrings.info_
import typings.wdioTypes.wdioTypesStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaTestCapabilities extends StObject {
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  var browserName: js.UndefOr[String] = js.undefined
  
  var browserVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specify a name for a logical group of tests.
    */
  var build: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Use this capability to add a custom tag to the builds.
    * These tags can be used to filter the builds on the Automate dashboard.
    */
  var buildTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Capture browser console logs at various steps in the test.
    */
  var console: js.UndefOr[warn | error | info_ | `true`] = js.undefined
  
  var headless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use this capability to add names to the tests.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var network: js.UndefOr[Boolean] = js.undefined
  
  var platformName: js.UndefOr[String] = js.undefined
  
  /**
    * Specify a name for a logical group of builds.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Set the resolution of the VM.
    */
  var resolution: js.UndefOr[String] = js.undefined
  
  var seCdp: js.UndefOr[Boolean] = js.undefined
  
  var selenium_version: js.UndefOr[String] = js.undefined
  
  var smartUiProject: js.UndefOr[String] = js.undefined
  
  /**
    * Use this capability to add a custom tag to the tests.
    * These tags can be used to filter the tests on the Automate dashboard.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Test locally hosted websites on LambdaTest.
    * To enable access to the local machine you need to setup the
    * LambdaTest Tunnel (https://www.lambdatest.com/support/docs/testing-locally-hosted-pages).
    */
  var tunnel: js.UndefOr[Boolean] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var video: js.UndefOr[Boolean] = js.undefined
  
  var visual: js.UndefOr[Boolean] = js.undefined
}
object LambdaTestCapabilities {
  
  inline def apply(): LambdaTestCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaTestCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaTestCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    inline def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersionUndefined: Self = StObject.set(x, "browserVersion", js.undefined)
    
    inline def setBuild(value: String | Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildTags(value: js.Array[String]): Self = StObject.set(x, "buildTags", value.asInstanceOf[js.Any])
    
    inline def setBuildTagsUndefined: Self = StObject.set(x, "buildTags", js.undefined)
    
    inline def setBuildTagsVarargs(value: String*): Self = StObject.set(x, "buildTags", js.Array(value*))
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setConsole(value: warn | error | info_ | `true`): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: Boolean): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    
    inline def setPlatformNameUndefined: Self = StObject.set(x, "platformName", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSeCdp(value: Boolean): Self = StObject.set(x, "seCdp", value.asInstanceOf[js.Any])
    
    inline def setSeCdpUndefined: Self = StObject.set(x, "seCdp", js.undefined)
    
    inline def setSelenium_version(value: String): Self = StObject.set(x, "selenium_version", value.asInstanceOf[js.Any])
    
    inline def setSelenium_versionUndefined: Self = StObject.set(x, "selenium_version", js.undefined)
    
    inline def setSmartUiProject(value: String): Self = StObject.set(x, "smartUiProject", value.asInstanceOf[js.Any])
    
    inline def setSmartUiProjectUndefined: Self = StObject.set(x, "smartUiProject", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTunnel(value: Boolean): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setVisual(value: Boolean): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    inline def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
