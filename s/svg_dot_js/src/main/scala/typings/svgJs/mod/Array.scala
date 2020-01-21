package typings.svgJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array
  extends Instantiable0[Array]
     with Instantiable1[/* array */ ArrayAlias, Array]
     with Instantiable2[/* array */ ArrayAlias, /* fallback */ js.Array[Double], Array] {
  var value: js.Array[Double] = js.native
  def at(pos: NumberAlias): Array = js.native
  def morph(array: js.Array[Double]): this.type = js.native
  def parse(array: ArrayAlias): js.Array[Double] = js.native
  def reverse(): this.type = js.native
  def settle(): js.Array[Double] = js.native
  def split(string: String): js.Array[Double] = js.native
}

