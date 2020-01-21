package typings.workboxWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheFirst
  - typings.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheOnly
  - typings.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkFirst
  - typings.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkOnly
  - typings.workboxWebpackPlugin.workboxWebpackPluginStrings.StaleWhileRevalidate
*/
trait ChacheStrategy extends js.Object

object ChacheStrategy {
  @scala.inline
  def CacheFirst: typings.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheFirst = this.cast("CacheFirst")
  @scala.inline
  def CacheOnly: typings.workboxWebpackPlugin.workboxWebpackPluginStrings.CacheOnly = this.cast("CacheOnly")
  @scala.inline
  def NetworkFirst: typings.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkFirst = this.cast("NetworkFirst")
  @scala.inline
  def NetworkOnly: typings.workboxWebpackPlugin.workboxWebpackPluginStrings.NetworkOnly = this.cast("NetworkOnly")
  @scala.inline
  def StaleWhileRevalidate: typings.workboxWebpackPlugin.workboxWebpackPluginStrings.StaleWhileRevalidate = this.cast("StaleWhileRevalidate")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

