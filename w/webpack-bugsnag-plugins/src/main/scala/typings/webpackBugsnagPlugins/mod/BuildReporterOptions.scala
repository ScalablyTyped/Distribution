package typings.webpackBugsnagPlugins.mod

import typings.webpackBugsnagPlugins.anon.Debug
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.debug
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.error
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.info
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildReporterOptions extends js.Object {
  
  /**
    * Post the build payload to a specified URL
    *
    * @default https://build.bugsnag.com
    */
  var endpoint: js.UndefOr[String] = js.native
  
  /**
    * The minimum severity of log to output
    *
    * @default warn
    */
  var logLevel: js.UndefOr[debug | info | warn | error] = js.native
  
  /**
    * Provide a different logger object
    */
  var logger: js.UndefOr[Debug] = js.native
  
  /**
    * The path to search for source control info
    *
    * @default process.cwd()
    */
  var path: js.UndefOr[String] = js.native
}
object BuildReporterOptions {
  
  @scala.inline
  def apply(): BuildReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildReporterOptions]
  }
  
  @scala.inline
  implicit class BuildReporterOptionsOps[Self <: BuildReporterOptions] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setLogLevel(value: debug | info | warn | error): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: Debug): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
