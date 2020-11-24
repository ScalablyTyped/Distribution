package typings.webpackSources.libMod

import typings.webpackSources.concatSourceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Concatenate multiple Sources or strings to a single source.
  */
@JSImport("webpack-sources/lib", "ConcatSource")
@js.native
class ConcatSource protected () extends ^ {
  def this(args: (String | typings.webpackSources.sourceMod.^ )*) = this()
}
