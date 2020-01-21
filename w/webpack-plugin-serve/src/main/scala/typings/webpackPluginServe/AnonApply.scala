package typings.webpackPluginServe

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApply extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler_): Unit
}

object AnonApply {
  @scala.inline
  def apply(apply: Compiler_ => Unit): AnonApply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[AnonApply]
  }
}

