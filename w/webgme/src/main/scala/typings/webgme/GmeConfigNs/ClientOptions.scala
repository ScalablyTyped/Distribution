package typings.webgme.GmeConfigNs

import typings.webgme.Anon_DSN
import typings.webgme.Anon_LevelString
import typings.webgme.webgmeStrings.basic
import typings.webgme.webgmeStrings.basic2
import typings.webgme.webgmeStrings.basic3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * Directory from where to serve the static files for the webapp. 
    * This should only be modified if you are using a custom UI.
    *  e.g. './src/client'
    */
  var appDir: String
  /**
    * Default connection router to use when opening up a new model, 
    * available options (ordered by level of complexity 
    * and sophistication) are: 'basic', 'basic2' and 'basic3'.
    */
  var defaultConnectionRouter: basic | basic2 | basic3
  /**
    * Enable [raven-js](https://docs.sentry.io/clients/javascript/)
    * to automatically send reports to the provided url. 
    * [Sentry.io](https://sentry.io/) 
    * provides free plans and comes with an 
    * easy ui that supports releases, source maps etc.
    * 
    * Url like endpoint for raven-js e.g. 'https:// ****@sentry.io/999999'.
    * null indicates that it is unused.
    * 
    * Options passed to the raven-client, if not specified {release: } will be passed.
    */
  var errorReporting: Anon_DSN
  /**
    * When debug is activated in the browser 
    * (type localStorage.debug = gme* in the 
    * console and refresh the page) messages below 
    * this level will not be printed.
    * e.g. debug, info, warn, error
    */
  var log: Anon_LevelString
}

object ClientOptions {
  @scala.inline
  def apply(
    appDir: String,
    defaultConnectionRouter: basic | basic2 | basic3,
    errorReporting: Anon_DSN,
    log: Anon_LevelString
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(appDir = appDir, defaultConnectionRouter = defaultConnectionRouter.asInstanceOf[js.Any], errorReporting = errorReporting, log = log)
  
    __obj.asInstanceOf[ClientOptions]
  }
}

