package typings.webpackErrorNotification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-error-notification", JSImport.Namespace)
@js.native
/**
  * You can supply some strategy for the plugin to display notification.
  * If you don't supply anything, it will use process.platform as a strategy name.
  * `darwin` and `linux` are supported out of the box now.
  * You can also supply function(msg) {} as a strategy that will use your notification CLI tool of choice.
  */
class ^ () extends WebpackErrorNotificationPlugin {
  def this(strategy: Strategy) = this()
  def this(strategy: js.UndefOr[Strategy], options: Options) = this()
}
