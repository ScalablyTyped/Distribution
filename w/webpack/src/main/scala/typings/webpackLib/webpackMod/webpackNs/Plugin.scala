package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin
  extends tapableLib.tapableMod.TapableNs.Plugin {
  @JSName("apply")
  def apply(compiler: Compiler): scala.Unit
}

object Plugin {
  @scala.inline
  def apply(apply: Compiler => scala.Unit): Plugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[Plugin]
  }
}

