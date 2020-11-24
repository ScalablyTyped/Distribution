package typings.stylelintWebpackPlugin.stylelintErrorMod

import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stylelint-webpack-plugin/declarations/StylelintError", JSImport.Default)
@js.native
class default protected () extends Error {
  /**
    * @param {Partial<string>} messages
    */
  def this(messages: Partial[String]) = this()
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
