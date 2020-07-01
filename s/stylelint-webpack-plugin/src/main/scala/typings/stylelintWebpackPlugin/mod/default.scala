package typings.stylelintWebpackPlugin.mod

import typings.stylelintWebpackPlugin.getOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @typedef {import('webpack').Compiler} Compiler */
@JSImport("stylelint-webpack-plugin", JSImport.Default)
@js.native
class default () extends StylelintWebpackPlugin {
  def this(options: js.Object) = this()
  /* CompleteClass */
  override var options: Options = js.native
  /**
    * @param {Compiler} compiler
    * @returns {void}
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: Compiler): Unit = js.native
  /**
    *
    * @param {Compiler} compiler
    * @returns {string}
    */
  /* CompleteClass */
  override def getContext(compiler: Compiler): String = js.native
}

