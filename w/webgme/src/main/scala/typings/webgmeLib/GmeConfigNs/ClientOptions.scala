package typings
package webgmeLib.GmeConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * Directory from where to serve the static files for the webapp. 
    * This should only be modified if you are using a custom UI.
    *  e.g. './src/client'
    */
  var appDir: java.lang.String
  /**
    * Default connection router to use when opening up a new model, 
    * available options (ordered by level of complexity 
    * and sophistication) are: 'basic', 'basic2' and 'basic3'.
    */
  var defaultConnectionRouter: webgmeLib.webgmeLibStrings.basic | webgmeLib.webgmeLibStrings.basic2 | webgmeLib.webgmeLibStrings.basic3
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
  var errorReporting: webgmeLib.Anon_RavenOptions
  /**
    * When debug is activated in the browser 
    * (type localStorage.debug = gme* in the 
    * console and refresh the page) messages below 
    * this level will not be printed.
    * e.g. debug, info, warn, error
    */
  var log: webgmeLib.Anon_Level
}

