package typings.tarn.tarnMod

import typings.tarn.libPoolMod.PoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn", "Pool")
@js.native
class Pool[T] protected ()
  extends typings.tarn.libPoolMod.Pool[T] {
  def this(opt: PoolOptions[T]) = this()
}

