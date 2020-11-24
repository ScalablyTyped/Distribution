package typings.syntaxError

import typings.acorn.mod.Options
import typings.syntaxError.anon.SyntaxErrorlinenumbercolu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("syntax-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Check the source code string 'src' for syntax errors. Optionally you can specify a filename
    * file that will show up in the output.
    * If 'src' has a syntax error, return an error object err that can be printed or stringified.
    * If there are no syntax errors in 'src', return undefined.
    * Options will be passed through to acorn-node. acorn-node defaults to options
    * that match the most recent Node versions.
    */
  def apply(src: js.Any): js.UndefOr[SyntaxErrorlinenumbercolu] = js.native
  def apply(src: js.Any, file: js.UndefOr[scala.Nothing], opts: Options): js.UndefOr[SyntaxErrorlinenumbercolu] = js.native
  def apply(src: js.Any, file: String): js.UndefOr[SyntaxErrorlinenumbercolu] = js.native
  def apply(src: js.Any, file: String, opts: Options): js.UndefOr[SyntaxErrorlinenumbercolu] = js.native
}
