package typings.webdriver

import typings.std.Error
import typings.std.PropertyDescriptor
import typings.std.Record
import typings.webdriver.anon.Capabilities
import typings.webdriver.anon.IsAndroid
import typings.webdriver.anon.PartialOptions
import typings.webdriver.anon.PartialSessionFlags
import typings.webdriver.requestMod.WebDriverResponse
import typings.webdriver.typesMod.JSONWPCommandError
import typings.webdriver.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("webdriver/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver/build/utils", "CustomRequestError")
  @js.native
  class CustomRequestError protected ()
    extends StObject
       with Error {
    def this(body: WebDriverResponse) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @scala.inline
  def getEnvironmentVars(hasIsW3CIsMobileIsIOSIsAndroidIsChromeIsSauceIsSeleniumStandalone: PartialSessionFlags): IsAndroid = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentVars")(hasIsW3CIsMobileIsIOSIsAndroidIsChromeIsSauceIsSeleniumStandalone.asInstanceOf[js.Any]).asInstanceOf[IsAndroid]
  
  @scala.inline
  def getErrorFromResponseBody(body: js.Any): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFromResponseBody")(body.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  @scala.inline
  def getPrototype(hasIsW3CIsChromeIsMobileIsSauceIsSeleniumStandalone: PartialSessionFlags): Record[String, PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(hasIsW3CIsChromeIsMobileIsSauceIsSeleniumStandalone.asInstanceOf[js.Any]).asInstanceOf[Record[String, PropertyDescriptor]]
  
  @scala.inline
  def getSessionError(err: JSONWPCommandError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionError")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getSessionError(err: JSONWPCommandError, params: PartialOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionError")(err.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isSuccessfulResponse(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")().asInstanceOf[Boolean]
  @scala.inline
  def isSuccessfulResponse(statusCode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")(statusCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isSuccessfulResponse(statusCode: Double, body: WebDriverResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")(statusCode.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isSuccessfulResponse(statusCode: Unit, body: WebDriverResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")(statusCode.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def startWebDriverSession(params: Options): js.Promise[Capabilities] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWebDriverSession")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Capabilities]]
}
