package typings.webpackSources.libMod

import typings.webpackSources.prefixSourceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prefix every line of the decorated Source with a provided string.
  */
@JSImport("webpack-sources/lib", "PrefixSource")
@js.native
class PrefixSource protected () extends ^ {
  def this(prefix: String, source: String) = this()
  def this(prefix: String, source: typings.webpackSources.sourceMod.^) = this()
  def this(prefix: typings.webpackSources.sourceMod.^, source: String) = this()
  def this(prefix: typings.webpackSources.sourceMod.^, source: typings.webpackSources.sourceMod.^) = this()
}
