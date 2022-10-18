package typings.webdriver

import typings.std.Error
import typings.std.Record
import typings.wdioTypes.buildOptionsMod.RequestLibOptions
import typings.wdioTypes.buildOptionsMod.WebDriver
import typings.webdriver.anon.Capabilities
import typings.webdriver.anon.IsAndroid
import typings.webdriver.anon.PartialSessionFlags
import typings.webdriver.anon.PartialWebDriver
import typings.webdriver.buildRequestMod.WebDriverResponse
import typings.webdriver.buildTypesMod.Client
import typings.webdriver.buildTypesMod.JSONWPCommandError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsMod {
  
  @JSImport("webdriver/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver/build/utils", "CustomRequestError")
  @js.native
  open class CustomRequestError protected ()
    extends StObject
       with Error {
    def this(body: WebDriverResponse, requestOptions: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def getEnvironmentVars(hasIsW3CIsMobileIsIOSIsAndroidIsChromeIsFirefoxIsSauceIsSeleniumStandalone: PartialSessionFlags): IsAndroid = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentVars")(hasIsW3CIsMobileIsIOSIsAndroidIsChromeIsFirefoxIsSauceIsSeleniumStandalone.asInstanceOf[js.Any]).asInstanceOf[IsAndroid]
  
  inline def getErrorFromResponseBody(body: Any, requestOptions: Any): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFromResponseBody")(body.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def getPrototype(hasIsW3CIsChromeIsFirefoxIsMobileIsSauceIsSeleniumStandalone: PartialSessionFlags): Record[String, js.PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(hasIsW3CIsChromeIsFirefoxIsMobileIsSauceIsSeleniumStandalone.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.PropertyDescriptor]]
  
  inline def getSessionError(err: JSONWPCommandError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionError")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSessionError(err: JSONWPCommandError, params: PartialWebDriver): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionError")(err.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTimeoutError(error: js.Error, requestOptions: RequestLibOptions): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeoutError")(error.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def isSuccessfulResponse(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")().asInstanceOf[Boolean]
  inline def isSuccessfulResponse(statusCode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")(statusCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSuccessfulResponse(statusCode: Double, body: WebDriverResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")(statusCode.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSuccessfulResponse(statusCode: Unit, body: WebDriverResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")(statusCode.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setupDirectConnect(client: Client): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupDirectConnect")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startWebDriverSession(params: WebDriver): js.Promise[Capabilities] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWebDriverSession")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Capabilities]]
}
