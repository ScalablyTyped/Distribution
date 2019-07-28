package typings.webpackDashPluginDashServe

import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apply extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}

object Anon_Apply {
  @scala.inline
  def apply(apply: Compiler => Unit): Anon_Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[Anon_Apply]
  }
}

