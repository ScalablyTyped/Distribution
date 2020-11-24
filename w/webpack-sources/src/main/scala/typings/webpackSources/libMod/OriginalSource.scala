package typings.webpackSources.libMod

import typings.node.Buffer
import typings.webpackSources.originalSourceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents source code, which is a copy of the original file
  */
@JSImport("webpack-sources/lib", "OriginalSource")
@js.native
class OriginalSource protected () extends ^ {
  /**
    * OriginalSource tries to create column mappings if requested, by splitting the source code at typical statement borders (;, {, }).
    */
  def this(sourceCode: String, name: String) = this()
  def this(sourceCode: Buffer, name: String) = this()
}
