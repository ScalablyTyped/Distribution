package typings.webpackServe.anon

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compiler extends js.Object {
  var compiler: Compiler_
}

object Compiler {
  @scala.inline
  def apply(compiler: Compiler_): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
}

