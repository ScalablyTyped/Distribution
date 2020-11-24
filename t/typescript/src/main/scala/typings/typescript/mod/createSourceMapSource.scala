package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createSourceMapSource")
@js.native
object createSourceMapSource extends js.Object {
  
  /**
    * Create an external source map source file reference
    */
  def apply(fileName: java.lang.String, text: java.lang.String): SourceMapSource = js.native
  def apply(
    fileName: java.lang.String,
    text: java.lang.String,
    skipTrivia: js.Function1[/* pos */ Double, Double]
  ): SourceMapSource = js.native
}
