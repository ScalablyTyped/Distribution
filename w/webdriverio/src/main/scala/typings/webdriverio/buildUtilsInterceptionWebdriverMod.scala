package typings.webdriverio

import typings.webdriverio.buildUtilsInterceptionTypesMod.Matches
import typings.webdriverio.buildUtilsInterceptionTypesMod.MockOverwrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsInterceptionWebdriverMod {
  
  @JSImport("webdriverio/build/utils/interception/webdriver", JSImport.Default)
  @js.native
  open class default () extends WebDriverInterception
  
  @js.native
  trait WebDriverInterception
    extends typings.webdriverio.buildUtilsInterceptionMod.default {
    
    /**
      * Abort the request with an error code
      * @param {string} errorCode  error code of the response
      */
    def abort(errorReason: String): js.Promise[js.Promise[Unit] | Unit] = js.native
    def abort(errorReason: String, sticky: Boolean): js.Promise[js.Promise[Unit] | Unit] = js.native
    
    /**
      * Abort the request once with an error code
      * @param {string} errorReason  error code of the response
      */
    def abortOnce(errorReason: String): js.Promise[js.Promise[Unit] | Unit] = js.native
    
    /**
      * allows access to all requests made with given pattern
      */
    @JSName("calls")
    def calls_MWebDriverInterception: js.Array[Matches] | js.Promise[js.Array[Matches]] = js.native
    
    def init(): js.Promise[Unit] = js.native
    
    var mockId: js.UndefOr[String] = js.native
    
    /**
      * Always respond with same overwrite
      * @param {*} overwrites  payload to overwrite the response
      * @param {*} params      additional respond parameters to overwrite
      */
    def respond(overwrite: MockOverwrite): js.Promise[js.Promise[Unit] | Unit] = js.native
    
    /**
      * Respond request once with given overwrite
      * @param {*} overwrites  payload to overwrite the response
      * @param {*} params      additional respond parameters to overwrite
      */
    def respondOnce(overwrite: MockOverwrite): js.Promise[js.Promise[Unit] | Unit] = js.native
  }
}
