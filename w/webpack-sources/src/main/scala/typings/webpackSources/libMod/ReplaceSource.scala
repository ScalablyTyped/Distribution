package typings.webpackSources.libMod

import typings.webpackSources.replaceSourceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Decorates a Source with replacements and insertions of source code.
  *
  */
@JSImport("webpack-sources/lib", "ReplaceSource")
@js.native
class ReplaceSource protected () extends ^ {
  /**
    * The ReplaceSource supports "identity" mappings for child source.
    * When original source matches generated source for a mapping it's assumed to be mapped char by char allowing to split mappings at replacements/insertions.
    */
  def this(source: typings.webpackSources.sourceMod.^) = this()
  def this(source: typings.webpackSources.sourceMod.^, name: String) = this()
}
