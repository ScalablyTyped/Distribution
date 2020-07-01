package typings.webpackStatsPlugin.statsWriterPluginMod

import typings.webpack.mod.Plugin
import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsWriterPlugin extends Plugin {
  def emitStats(curCompiler: Compilation): js.Promise[String] = js.native
  def emitStats(curCompiler: Compilation, callback: TransformFunc): js.Promise[Unit] = js.native
}

