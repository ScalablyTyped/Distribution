package typings
package webpackDashWatchedDashGlobDashEntriesDashPluginLib.webpackDashWatchedDashGlobDashEntriesDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
@js.native
class ^ () extends WebpackWatchedGlobEntries

@JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getEntries(globs: js.Array[java.lang.String]): webpackLib.webpackMod.EntryFunc = js.native
  def getEntries(globs: js.Array[java.lang.String], globOptions: globLib.globMod.IOptions): webpackLib.webpackMod.EntryFunc = js.native
  def getEntries(
    globs: js.Array[java.lang.String],
    globOptions: globLib.globMod.IOptions,
    pluginOptions: PluginOptions
  ): webpackLib.webpackMod.EntryFunc = js.native
  def getFiles(globString: java.lang.String): stdLib.Record[java.lang.String, java.lang.String] = js.native
  def getFiles(globString: java.lang.String, globOptions: globLib.globMod.IOptions): stdLib.Record[java.lang.String, java.lang.String] = js.native
  def getFiles(
    globString: java.lang.String,
    globOptions: globLib.globMod.IOptions,
    basename_as_entry_name: scala.Boolean
  ): stdLib.Record[java.lang.String, java.lang.String] = js.native
}

