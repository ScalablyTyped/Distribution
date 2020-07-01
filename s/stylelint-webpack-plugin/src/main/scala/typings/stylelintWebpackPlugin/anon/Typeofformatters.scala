package typings.stylelintWebpackPlugin.anon

import typings.stylelint.mod.LintResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofformatters extends js.Object {
  def compact(results: js.Array[LintResult]): String
  def json(results: js.Array[LintResult]): String
  def string(results: js.Array[LintResult]): String
  def unix(results: js.Array[LintResult]): String
  def verbose(results: js.Array[LintResult]): String
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
}

