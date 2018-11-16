package typings
package weightedLib.weightedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weighted", JSImport.Namespace)
@js.native
object weightedModMembers extends js.Object {
  def select[T](obj: js.Object): T = js.native
  def select[T](obj: js.Object, rand: RandomFunc): T = js.native
  def select[T](set: js.Array[T], weights: js.Array[stdLib.Number]): T = js.native
  def select[T](set: js.Array[T], weights: js.Array[stdLib.Number], rand: RandomFunc): T = js.native
}

