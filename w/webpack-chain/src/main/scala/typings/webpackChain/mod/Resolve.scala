package typings.webpackChain.mod

import typings.std.RegExp
import typings.webpackChain.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Resolve")
@js.native
class Resolve[T] ()
  extends typings.webpackChain.mod._Config.TypedChainedMap[T, js.Any] {
  var alias: TypedChainedMap[this.type, String] = js.native
  var aliasFields: TypedChainedSet[this.type, String] = js.native
  var descriptionFiles: TypedChainedSet[this.type, String] = js.native
  var extensions: TypedChainedSet[this.type, String] = js.native
  var mainFields: TypedChainedSet[this.type, String] = js.native
  var mainFiles: TypedChainedSet[this.type, String] = js.native
  var modules: TypedChainedSet[this.type, String] = js.native
  var plugins: TypedChainedMap[
    this.type, 
    Plugin[
      this.type, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ResolvePlugin */ _
    ]
  ] = js.native
  def cachePredicate(value: js.Function1[/* data */ Path, Boolean]): this.type = js.native
  def cacheWithContext(value: Boolean): this.type = js.native
  def enforceExtension(value: Boolean): this.type = js.native
  def enforceModuleExtension(value: Boolean): this.type = js.native
  def plugin(name: String): Plugin[
    this.type, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ResolvePlugin */ _
  ] = js.native
  def symlinks(value: Boolean): this.type = js.native
  def unsafeCache(value: js.Array[RegExp]): this.type = js.native
  def unsafeCache(value: Boolean): this.type = js.native
  def unsafeCache(value: RegExp): this.type = js.native
}

