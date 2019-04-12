package typings
package tarnLib.tarnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn", "Pool")
@js.native
class Pool[T] protected ()
  extends tarnLib.libPoolMod.Pool[T] {
  def this(opt: tarnLib.libPoolMod.PoolOptions[T]) = this()
}

