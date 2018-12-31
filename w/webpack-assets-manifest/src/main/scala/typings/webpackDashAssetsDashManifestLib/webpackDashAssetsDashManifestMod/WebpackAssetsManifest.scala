package typings
package webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackAssetsManifest
  extends webpackLib.webpackMod.Plugin {
  /** https://github.com/webdeveric/webpack-assets-manifest#options-read-the-schema */
  var defaultOptions: webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs.Options = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#hooks */
  var hooks: webpackDashAssetsDashManifestLib.Anon_Customize = js.native
  /** Determine if the manifest data is currently being merged */
  var isMerging: scala.Boolean = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#options-read-the-schema */
  var options: webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs.Options = js.native
  /** Delete an item from the manifest */
  def delete(key: java.lang.String): scala.Boolean = js.native
  /** Replace backslash with forward slash */
  def fixKey(key: java.lang.String): java.lang.String = js.native
  /** Get an item from the manifest */
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, defaultValue: java.lang.String): js.Any = js.native
  /** Get the file extension */
  def getExtension(filename: java.lang.String): java.lang.String = js.native
  /** Get the file system path to the manifest */
  def getOutputPath(): java.lang.String = js.native
  /**
  	 * Get a [Proxy](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Proxy/handler) for the manifest
  	 *
  	 * @param raw - Use `setRaw` instead of `set`
  	 */
  def getProxy(): stdLib.ProxyHandler[WebpackAssetsManifest] = js.native
  def getProxy(raw: scala.Boolean): stdLib.ProxyHandler[WebpackAssetsManifest] = js.native
  /** Get the public path for the filename */
  def getPublicPath(filename: java.lang.String): java.lang.String = js.native
  /** Determine if an item exist in the manifest */
  def has(key: java.lang.String): scala.Boolean = js.native
  /** Determine if the filename matches the HMR filename pattern */
  def isHMR(filename: java.lang.String): scala.Boolean = js.native
  /** Add an item to the manifest */
  def set(key: java.lang.String, value: java.lang.String): this.type = js.native
  /** Add item to assets without modifying the key or value */
  def setRaw(key: java.lang.String, value: java.lang.String): this.type = js.native
}

