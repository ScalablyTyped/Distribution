package typings.twilioSync.treeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map[K, V] extends js.Object {
  def get(key: K): V
  def set(key: K, value: V): Unit
}

object Map {
  @scala.inline
  def apply[K, V](get: K => V, set: (K, V) => Unit): Map[K, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Map[K, V]]
  }
}

