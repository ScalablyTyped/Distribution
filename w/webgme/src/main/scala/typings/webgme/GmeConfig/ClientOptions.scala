package typings.webgme.GmeConfig

import typings.webgme.anon.DSN
import typings.webgme.anon.LevelString
import typings.webgme.webgmeStrings.basic
import typings.webgme.webgmeStrings.basic2
import typings.webgme.webgmeStrings.basic3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  /**
    * Directory from where to serve the static files for the webapp. 
    * This should only be modified if you are using a custom UI.
    *  e.g. './src/client'
    */
  var appDir: String = js.native
  /**
    * Default connection router to use when opening up a new model, 
    * available options (ordered by level of complexity 
    * and sophistication) are: 'basic', 'basic2' and 'basic3'.
    */
  var defaultConnectionRouter: basic | basic2 | basic3 = js.native
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
  var errorReporting: DSN = js.native
  /**
    * When debug is activated in the browser 
    * (type localStorage.debug = gme* in the 
    * console and refresh the page) messages below 
    * this level will not be printed.
    * e.g. debug, info, warn, error
    */
  var log: LevelString = js.native
}

object ClientOptions {
  @scala.inline
  def apply(
    appDir: String,
    defaultConnectionRouter: basic | basic2 | basic3,
    errorReporting: DSN,
    log: LevelString
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], defaultConnectionRouter = defaultConnectionRouter.asInstanceOf[js.Any], errorReporting = errorReporting.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppDir(value: String): Self = this.set("appDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultConnectionRouter(value: basic | basic2 | basic3): Self = this.set("defaultConnectionRouter", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorReporting(value: DSN): Self = this.set("errorReporting", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog(value: LevelString): Self = this.set("log", value.asInstanceOf[js.Any])
  }
  
}

