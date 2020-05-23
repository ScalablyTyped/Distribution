package typings.webpackPluginServe.anon

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler_): Unit
}

object Apply {
  @scala.inline
  def apply(apply: Compiler_ => Unit): Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[Apply]
  }
}

