package typings
package syntaxDashErrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("syntax-error", JSImport.Namespace)
@js.native
object syntaxDashErrorMod extends js.Object {
  /**
    * Check the source code string 'src' for syntax errors. Optionally you can specify a filename
    * file that will show up in the output.
    * If 'src' has a syntax error, return an error object err that can be printed or stringified.
    * If there are no syntax errors in 'src', return undefined.
    * Options will be passed through to acorn-node. acorn-node defaults to options
    * that match the most recent Node versions.
    */
  def apply(src: js.Any): js.UndefOr[stdLib.SyntaxError with syntaxDashErrorLib.Anon_Annotated] = js.native
  def apply(src: js.Any, file: java.lang.String): js.UndefOr[stdLib.SyntaxError with syntaxDashErrorLib.Anon_Annotated] = js.native
  def apply(src: js.Any, file: java.lang.String, opts: acornLib.acornMod.acornNs.Options): js.UndefOr[stdLib.SyntaxError with syntaxDashErrorLib.Anon_Annotated] = js.native
}

