package typings.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watching extends js.Object {
  def close(callback: js.Function0[Unit]): Unit
  def invalidate(): Unit
}

object Watching {
  @scala.inline
  def apply(close: js.Function0[Unit] => Unit, invalidate: () => Unit): Watching = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), invalidate = js.Any.fromFunction0(invalidate))
  
    __obj.asInstanceOf[Watching]
  }
}

