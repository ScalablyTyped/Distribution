package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheEntry[T] extends js.Object {
  var expiry: scala.Double
  var value: vexdbLib.Anon_0[T]
}

object CacheEntry {
  @scala.inline
  def apply[T](expiry: scala.Double, value: vexdbLib.Anon_0[T]): CacheEntry[T] = {
    val __obj = js.Dynamic.literal(expiry = expiry, value = value)
  
    __obj.asInstanceOf[CacheEntry[T]]
  }
}

