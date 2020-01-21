package typings.tstl.mapContainerMod.MapContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorBase[Key, T] extends js.Object {
  /**
    * The first, key element.
    */
  val first: Key
  /**
    * The second, stored element.
    */
  var second: T
}

object IteratorBase {
  @scala.inline
  def apply[Key, T](first: Key, second: T): IteratorBase[Key, T] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IteratorBase[Key, T]]
  }
}

