package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiWatching extends Watching

object MultiWatching {
  @scala.inline
  def apply(close: js.Function0[scala.Unit] => scala.Unit, invalidate: () => scala.Unit): MultiWatching = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), invalidate = js.Any.fromFunction0(invalidate))
  
    __obj.asInstanceOf[MultiWatching]
  }
}

