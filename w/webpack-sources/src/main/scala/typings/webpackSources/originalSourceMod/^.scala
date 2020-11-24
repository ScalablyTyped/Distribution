package typings.webpackSources.originalSourceMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents source code, which is a copy of the original file
  */
@JSImport("webpack-sources/lib/OriginalSource", JSImport.Namespace)
@js.native
class ^ protected () extends OriginalSource {
  /**
    * OriginalSource tries to create column mappings if requested, by splitting the source code at typical statement borders (;, {, }).
    */
  def this(sourceCode: String, name: String) = this()
  def this(sourceCode: Buffer, name: String) = this()
}
