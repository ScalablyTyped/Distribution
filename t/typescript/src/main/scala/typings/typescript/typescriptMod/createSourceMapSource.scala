package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createSourceMapSource")
@js.native
object createSourceMapSource extends js.Object {
  /**
    * Create an external source map source file reference
    */
  def apply(fileName: String, text: String): SourceMapSource = js.native
  def apply(fileName: String, text: String, skipTrivia: js.Function1[/* pos */ Double, Double]): SourceMapSource = js.native
}

