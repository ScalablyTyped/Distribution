package typings.victor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("victor", JSImport.Namespace)
@js.native
class ^ protected () extends Victor {
  /**
    * Can be used without the new keyword.
    * @param x The X component
    * @param y The Y component
    */
  def this(x: Double, y: Double) = this()
}

@JSImport("victor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates vector from array.
    * @param arr array An array that contains the X component in the first element and the Y component in the second
    */
  def fromArray(arr: js.Array[Double]): Victor = js.native
  /**
    * Creates vector from object.
    * @param obj An object containing the X component in the x property and the Y component in the y property
    */
  def fromObject(obj: VictorCoordinates): Victor = js.native
}

