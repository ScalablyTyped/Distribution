package typings.valiant.valiantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("valiant", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createInterval[T](): IntervalConstructor[T] = js.native
  def createInterval[T](compareValues: js.Function2[/* a */ T, /* b */ T, Double]): IntervalConstructor[T] = js.native
}

