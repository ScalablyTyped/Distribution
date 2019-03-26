package typings
package webpackDashPluginDashServeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apply extends js.Object {
  @JSName("apply")
  def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit
}

object Anon_Apply {
  @scala.inline
  def apply(apply: webpackLib.webpackMod.Compiler => scala.Unit): Anon_Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[Anon_Apply]
  }
}

