package typings.tstl.baseIteratorIMapIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait IMapIteratorBase[Key, T] extends js.Object {
  /**
    * The first, key element.
    */
  val first: Key
  /**
    * The second, stored element.
    */
  var second: T
}

object IMapIteratorBase {
  @scala.inline
  def apply[Key, T](first: Key, second: T): IMapIteratorBase[Key, T] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMapIteratorBase[Key, T]]
  }
}

