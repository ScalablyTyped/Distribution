package typings.stylelintWebpackPlugin.mod

import typings.stylelintWebpackPlugin.getOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @typedef {import('webpack').Compiler} Compiler */
@js.native
trait StylelintWebpackPlugin extends js.Object {
  var options: Options = js.native
  /**
    * @param {Compiler} compiler
    * @returns {void}
    */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  /**
    *
    * @param {Compiler} compiler
    * @returns {string}
    */
  def getContext(compiler: Compiler): String = js.native
}

object StylelintWebpackPlugin {
  @scala.inline
  def apply(apply: Compiler => Unit, getContext: Compiler => String, options: Options): StylelintWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), getContext = js.Any.fromFunction1(getContext), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylelintWebpackPlugin]
  }
  @scala.inline
  implicit class StylelintWebpackPluginOps[Self <: StylelintWebpackPlugin] (val x: Self) extends AnyVal {
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
    def setApply(value: Compiler => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def setGetContext(value: Compiler => String): Self = this.set("getContext", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

