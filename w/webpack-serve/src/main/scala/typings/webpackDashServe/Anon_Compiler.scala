package typings.webpackDashServe

import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compiler extends js.Object {
  var compiler: Compiler
}

object Anon_Compiler {
  @scala.inline
  def apply(compiler: Compiler): Anon_Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Compiler]
  }
}

