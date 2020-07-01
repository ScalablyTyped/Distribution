package typings.stylelintWebpackPlugin.mod

import typings.stylelintWebpackPlugin.getOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @typedef {import('webpack').Compiler} Compiler */
trait StylelintWebpackPlugin extends js.Object {
  var options: Options
  /**
    * @param {Compiler} compiler
    * @returns {void}
    */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  /**
    *
    * @param {Compiler} compiler
    * @returns {string}
    */
  def getContext(compiler: Compiler): String
}

object StylelintWebpackPlugin {
  @scala.inline
  def apply(apply: Compiler => Unit, getContext: Compiler => String, options: Options): StylelintWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), getContext = js.Any.fromFunction1(getContext), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylelintWebpackPlugin]
  }
}

