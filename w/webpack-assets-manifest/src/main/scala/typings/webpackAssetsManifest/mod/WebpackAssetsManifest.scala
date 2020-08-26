package typings.webpackAssetsManifest.mod

import typings.std.Plugin
import typings.std.ProxyHandler
import typings.webpackAssetsManifest.anon.AfterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackAssetsManifest extends Plugin {
  /** https://github.com/webdeveric/webpack-assets-manifest#options-read-the-schema */
  var defaultOptions: Options = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#hooks */
  var hooks: AfterOptions = js.native
  /** Determine if the manifest data is currently being merged */
  var isMerging: Boolean = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#options-read-the-schema */
  var options: Options = js.native
  /** Delete an item from the manifest */
  def delete(key: String): Boolean = js.native
  /** Replace backslash with forward slash */
  def fixKey(key: String): String = js.native
  /** Get an item from the manifest */
  def get(key: String): js.Any = js.native
  def get(key: String, defaultValue: String): js.Any = js.native
  /** Get the file extension */
  def getExtension(filename: String): String = js.native
  /** Get the file system path to the manifest */
  def getOutputPath(): String = js.native
  /**
    * Get a [Proxy](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Proxy/handler) for the manifest
    *
    * @param raw - Use `setRaw` instead of `set`
    */
  def getProxy(): ProxyHandler[WebpackAssetsManifest] = js.native
  def getProxy(raw: Boolean): ProxyHandler[WebpackAssetsManifest] = js.native
  /** Get the public path for the filename */
  def getPublicPath(filename: String): String = js.native
  /** Determine if an item exist in the manifest */
  def has(key: String): Boolean = js.native
  /** Determine if the filename matches the HMR filename pattern */
  def isHMR(filename: String): Boolean = js.native
  /** Add an item to the manifest */
  def set(key: String, value: String): this.type = js.native
  /** Add item to assets without modifying the key or value */
  def setRaw(key: String, value: String): this.type = js.native
}

