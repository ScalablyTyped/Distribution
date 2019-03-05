package typings
package webpackDashWatchedDashGlobDashEntriesDashPluginLib.webpackDashWatchedDashGlobDashEntriesDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
@js.native
class namespaced () extends WebpackWatchedGlobEntries

/* static members */
@JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def getEntries(globs: js.Array[java.lang.String]): webpackLib.webpackMod.webpackNs.EntryFunc = js.native
  def getEntries(globs: js.Array[java.lang.String], globOptions: globLib.globMod.GNs.IOptions): webpackLib.webpackMod.webpackNs.EntryFunc = js.native
  def getEntries(
    globs: js.Array[java.lang.String],
    globOptions: globLib.globMod.GNs.IOptions,
    pluginOptions: webpackDashWatchedDashGlobDashEntriesDashPluginLib.webpackDashWatchedDashGlobDashEntriesDashPluginMod.PluginOptions
  ): webpackLib.webpackMod.webpackNs.EntryFunc = js.native
  def getFiles(globString: java.lang.String): stdLib.Record[java.lang.String, java.lang.String] = js.native
  def getFiles(globString: java.lang.String, globOptions: globLib.globMod.GNs.IOptions): stdLib.Record[java.lang.String, java.lang.String] = js.native
  def getFiles(
    globString: java.lang.String,
    globOptions: globLib.globMod.GNs.IOptions,
    basename_as_entry_name: scala.Boolean
  ): stdLib.Record[java.lang.String, java.lang.String] = js.native
}

