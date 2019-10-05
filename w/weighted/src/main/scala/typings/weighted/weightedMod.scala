package typings.weighted

import typings.std.Number
import typings.weighted.weightedMod.RandomFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weighted", JSImport.Namespace)
@js.native
object weightedMod extends js.Object {
  def select[T](obj: js.Object): T = js.native
  def select[T](obj: js.Object, rand: RandomFunc): T = js.native
  def select[T](set: js.Array[T], weights: js.Array[Number]): T = js.native
  def select[T](set: js.Array[T], weights: js.Array[Number], rand: RandomFunc): T = js.native
  type RandomFunc = js.Function0[Number]
}

