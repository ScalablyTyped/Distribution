package typings.webpackServe

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompiler extends js.Object {
  var compiler: Compiler_
}

object AnonCompiler {
  @scala.inline
  def apply(compiler: Compiler_): AnonCompiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompiler]
  }
}

