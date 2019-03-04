package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiWatching extends Watching

object MultiWatching {
  @scala.inline
  def apply(close: js.Function1[js.Function0[scala.Unit], scala.Unit], invalidate: js.Function0[scala.Unit]): MultiWatching = {
    val __obj = js.Dynamic.literal(close = close, invalidate = invalidate)
  
    __obj.asInstanceOf[MultiWatching]
  }
}

