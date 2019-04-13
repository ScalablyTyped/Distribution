package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Resolve")
@js.native
class Resolve () extends ChainedMap[Config] {
  var alias: TypedChainedMap[this.type, java.lang.String] = js.native
  var aliasFields: TypedChainedSet[this.type, java.lang.String] = js.native
  var descriptionFiles: TypedChainedSet[this.type, java.lang.String] = js.native
  var extensions: TypedChainedSet[this.type, java.lang.String] = js.native
  var mainFields: TypedChainedSet[this.type, java.lang.String] = js.native
  var mainFiles: TypedChainedSet[this.type, java.lang.String] = js.native
  var modules: TypedChainedSet[this.type, java.lang.String] = js.native
  var plugins: TypedChainedMap[this.type, Plugin[this.type]] = js.native
  def cachePredicate(value: js.Function1[/* data */ webpackDashChainLib.Anon_Path, scala.Boolean]): this.type = js.native
  def cacheWithContext(value: scala.Boolean): this.type = js.native
  def enforceExtension(value: scala.Boolean): this.type = js.native
  def enforceModuleExtension(value: scala.Boolean): this.type = js.native
  def plugin(name: java.lang.String): Plugin[this.type] = js.native
  def symlinks(value: scala.Boolean): this.type = js.native
  def unsafeCache(value: js.Array[stdLib.RegExp]): this.type = js.native
  def unsafeCache(value: scala.Boolean): this.type = js.native
  def unsafeCache(value: stdLib.RegExp): this.type = js.native
}

