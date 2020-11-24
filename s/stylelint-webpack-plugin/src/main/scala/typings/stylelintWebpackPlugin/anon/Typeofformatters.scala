package typings.stylelintWebpackPlugin.anon

import typings.stylelint.mod.LintResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofformatters extends js.Object {
  
  def compact(results: js.Array[LintResult]): String = js.native
  
  def json(results: js.Array[LintResult]): String = js.native
  
  def string(results: js.Array[LintResult]): String = js.native
  
  def unix(results: js.Array[LintResult]): String = js.native
  
  def verbose(results: js.Array[LintResult]): String = js.native
}
object Typeofformatters {
  
  @scala.inline
  def apply(
    compact: js.Array[LintResult] => String,
    json: js.Array[LintResult] => String,
    string: js.Array[LintResult] => String,
    unix: js.Array[LintResult] => String,
    verbose: js.Array[LintResult] => String
  ): Typeofformatters = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), json = js.Any.fromFunction1(json), string = js.Any.fromFunction1(string), unix = js.Any.fromFunction1(unix), verbose = js.Any.fromFunction1(verbose))
    __obj.asInstanceOf[Typeofformatters]
  }
  
  @scala.inline
  implicit class TypeofformattersOps[Self <: Typeofformatters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompact(value: js.Array[LintResult] => String): Self = this.set("compact", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJson(value: js.Array[LintResult] => String): Self = this.set("json", js.Any.fromFunction1(value))
    
    @scala.inline
    def setString(value: js.Array[LintResult] => String): Self = this.set("string", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnix(value: js.Array[LintResult] => String): Self = this.set("unix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerbose(value: js.Array[LintResult] => String): Self = this.set("verbose", js.Any.fromFunction1(value))
  }
}
