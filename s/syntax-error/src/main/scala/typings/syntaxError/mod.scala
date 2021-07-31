package typings.syntaxError

import typings.acorn.mod.Options
import typings.syntaxError.anon.SyntaxErrorlinenumbercolu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Check the source code string 'src' for syntax errors. Optionally you can specify a filename
    * file that will show up in the output.
    * If 'src' has a syntax error, return an error object err that can be printed or stringified.
    * If there are no syntax errors in 'src', return undefined.
    * Options will be passed through to acorn-node. acorn-node defaults to options
    * that match the most recent Node versions.
    */
  @scala.inline
  def apply(src: js.Any): js.UndefOr[SyntaxErrorlinenumbercolu] = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SyntaxErrorlinenumbercolu]]
  @scala.inline
  def apply(src: js.Any, file: String): js.UndefOr[SyntaxErrorlinenumbercolu] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SyntaxErrorlinenumbercolu]]
  @scala.inline
  def apply(src: js.Any, file: String, opts: Options): js.UndefOr[SyntaxErrorlinenumbercolu] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], file.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SyntaxErrorlinenumbercolu]]
  @scala.inline
  def apply(src: js.Any, file: Unit, opts: Options): js.UndefOr[SyntaxErrorlinenumbercolu] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], file.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SyntaxErrorlinenumbercolu]]
  
  @JSImport("syntax-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
