package typings.stylelintWebpackPlugin.stylelintErrorMod

import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint-webpack-plugin/declarations/StylelintError", JSImport.Default)
@js.native
class default protected () extends Error {
  /**
    * @param {Partial<string>} messages
    */
  def this(messages: Partial[String]) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

/* static members */
@JSImport("stylelint-webpack-plugin/declarations/StylelintError", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * @param {Options} options
    * @param {Array<LintResult>} messages
    * @returns {StylelintError}
    */
  def format(hasFormatter: Options, messages: js.Array[LintResult]): StylelintError = js.native
}

