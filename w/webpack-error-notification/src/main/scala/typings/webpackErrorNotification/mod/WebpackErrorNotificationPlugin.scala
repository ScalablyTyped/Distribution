package typings.webpackErrorNotification.mod

import typings.webpack.mod.Plugin
import typings.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackErrorNotificationPlugin extends Plugin {
  def compilationDone(stats: Stats): Unit = js.native
  def compileMessage(stats: Stats): String = js.native
}

