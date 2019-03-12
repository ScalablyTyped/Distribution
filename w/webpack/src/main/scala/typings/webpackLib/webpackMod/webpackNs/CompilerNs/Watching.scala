package typings
package webpackLib.webpackMod.webpackNs.CompilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watching extends js.Object {
  def close(callback: js.Function0[scala.Unit]): scala.Unit
  def invalidate(): scala.Unit
}

object Watching {
  @scala.inline
  def apply(close: js.Function0[scala.Unit] => scala.Unit, invalidate: () => scala.Unit): Watching = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), invalidate = js.Any.fromFunction0(invalidate))
  
    __obj.asInstanceOf[Watching]
  }
}

