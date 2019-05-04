package typings
package vegaDashLiteLib.buildSrcCompileSplitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Explicit[T] extends js.Object {
  var explicit: scala.Boolean
  var value: T
}

object Explicit {
  @scala.inline
  def apply[T](explicit: scala.Boolean, value: T): Explicit[T] = {
    val __obj = js.Dynamic.literal(explicit = explicit, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Explicit[T]]
  }
}

